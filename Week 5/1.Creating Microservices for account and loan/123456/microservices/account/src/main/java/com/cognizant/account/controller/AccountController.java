package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("type", "savings");
        response.put("balance", 234343);
        return response;
    }
}