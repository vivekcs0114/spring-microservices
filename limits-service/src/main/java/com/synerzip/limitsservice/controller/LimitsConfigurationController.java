package com.synerzip.limitsservice.controller;

import com.synerzip.limitsservice.config.Configuration;
import com.synerzip.limitsservice.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(configuration.getMin(), configuration.getMax());
    }
}
