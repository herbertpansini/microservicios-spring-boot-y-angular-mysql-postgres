package com.vaxi.springbootmicroservice3apigateway.controller;

import com.vaxi.springbootmicroservice3apigateway.model.Role;
import com.vaxi.springbootmicroservice3apigateway.security.UserPrincipal;
import com.vaxi.springbootmicroservice3apigateway.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PutMapping("change/{role}")
    @ResponseStatus(HttpStatus.OK)
    public void changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role) {
        this.userService.changeRole(role, userPrincipal.getUsername());
    }
}