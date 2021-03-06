package me.gogosing.controller;

import me.gogosing.config.ApplicationConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by JinBum Jeong on 2020/02/22.
 */
@RestController
@RequestMapping("/v1")
public class MessageController {

    private final ApplicationConfiguration applicationConfiguration;

    public MessageController(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    @GetMapping("/message")
    public Map<String, String> getMessage() {
        return Map.of(
            "message", applicationConfiguration.getMessage()
        );
    }
}
