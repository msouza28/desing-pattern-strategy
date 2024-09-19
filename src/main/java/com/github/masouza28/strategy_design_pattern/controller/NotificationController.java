package com.github.masouza28.strategy_design_pattern.controller;

import com.github.masouza28.strategy_design_pattern.controller.dto.NotificationRequest;
import com.github.masouza28.strategy_design_pattern.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/notify")
    public ResponseEntity<Void> send(@RequestBody @Valid NotificationRequest request){

        notificationService.notify(request.channel(),request.destination(),request.message());
        
        return ResponseEntity.accepted().build();
    }
}
