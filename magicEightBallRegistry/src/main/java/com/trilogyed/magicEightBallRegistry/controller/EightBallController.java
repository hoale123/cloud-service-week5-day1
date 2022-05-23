package com.trilogyed.magicEightBallRegistry.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RefreshScope
public class EightBallController {
    String[] answers = {
            "No",
            "Yes",
            "Looking cloudy",
            "Not sure",
            "Absolutely!",
            "Ask again",
            "Ummm",
            "Not a chance"
    };

    Random random = new Random();

    @GetMapping(value="/answers")
    public String getQuote() {
        return answers[random.nextInt(8)];
    }
}
