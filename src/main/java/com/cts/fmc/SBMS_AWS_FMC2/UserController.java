package com.cts.fmc.SBMS_AWS_FMC2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String getMapping() {
        return "Hello CTC !!!";
    }
}
