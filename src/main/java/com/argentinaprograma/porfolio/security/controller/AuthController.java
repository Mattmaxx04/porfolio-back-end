package com.argentinaprograma.porfolio.security.controller;

import com.argentinaprograma.porfolio.security.enums.RoleName;
import com.argentinaprograma.porfolio.security.exception.JwtDto;
import com.argentinaprograma.porfolio.security.exception.LoginUser;
import com.argentinaprograma.porfolio.security.exception.NewUser;
import com.argentinaprograma.porfolio.security.jwt.JwtProvider;
import com.argentinaprograma.porfolio.security.model.Role;
import com.argentinaprograma.porfolio.security.model.User;
import com.argentinaprograma.porfolio.security.service.RoleService;
import com.argentinaprograma.porfolio.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "https://porfolio-app-48d1e.web.app")
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/new")
    public ResponseEntity<?> neww(@Valid @RequestBody NewUser newUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Message("campos mal puestos"), HttpStatus.BAD_REQUEST);
        }

        if (userService.existsByNameUser(newUser.getNameUser())) {
            return new ResponseEntity(new Message("exe usuario ya existe"), HttpStatus.BAD_REQUEST);
        }

        User user = new User(newUser.getName(), newUser.getNameUser(), passwordEncoder.encode(newUser.getPassword()));

        Set<Role> roles = new HashSet<>();
        roles.add(roleService.getByRoleName(RoleName.ROLE_USER).get());
        if (newUser.getRoles().contains("admin")) {
            roles.add(roleService.getByRoleName(RoleName.ROLE_ADMIN).get());
        }

        user.setRoles(roles);
        userService.save(user);

        return new ResponseEntity(new Message("usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Message("campos mal puestos"), HttpStatus.BAD_REQUEST);
        }

        Authentication authentication
                = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken
                (loginUser.getNameUser(), loginUser.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());

        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
}
