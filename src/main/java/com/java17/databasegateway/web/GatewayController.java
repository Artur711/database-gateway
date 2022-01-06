package com.java17.databasegateway.web;

//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test-db")
public class GatewayController {

    @GetMapping("/get-response")
    public String getTesResponse() {
        return "It's working";
    }

    @GetMapping("get-admin-response")
//    @Secured("ROLE_ADMIN")
    public String getAdminResponse() {
        return "You are administrator if you see this";
    }
}
