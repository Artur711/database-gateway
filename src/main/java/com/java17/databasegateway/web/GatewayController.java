package com.java17.databasegateway.web;

import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/v1/test-db")
public class GatewayController {

    @GetMapping("/get-response")
    public ResponseEntity<String> getTesResponse() {
        return ok("It's working");
    }

    @GetMapping("get-admin-response")
//    @Secured("ROLE_ADMIN")
    public ResponseEntity<String> getAdminResponse() {
        return ok("You are administrator if you see this");
    }
}
