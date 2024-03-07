package com.dennis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dennis.constants.RestApiUrls.*;
@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthController {
    @PostMapping(REGISTER)
    public ResponseEntity<Boolean> register(){

        return ResponseEntity.ok(true);
    }

    @PostMapping(LOGIN)
    public ResponseEntity<Boolean> login(){

        return ResponseEntity.ok(true);
    }

    @PostMapping(ACTIVATE_STATUS)
    public ResponseEntity<Boolean> activateStatus(){

        return ResponseEntity.ok(true);
    }

}
