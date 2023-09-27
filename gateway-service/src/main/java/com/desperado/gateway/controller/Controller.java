package com.desperado.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/ad")
    public String index(Principal principal) {
        return principal.getName();
    }
}
