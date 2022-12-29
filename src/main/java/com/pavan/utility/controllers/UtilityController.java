package com.pavan.utility.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UtilityController {

    private static final Logger logger = LoggerFactory.getLogger(UtilityController.class);

    @GetMapping("/stress")
    public int generateStress() {
        logger.info("Generating stress..");
        int counter = 0;
        for(int i = 0; i <= 5000000; i++) {
            counter += i;
        }
        return counter;
    }
}