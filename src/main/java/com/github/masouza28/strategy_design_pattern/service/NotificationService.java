package com.github.masouza28.strategy_design_pattern.service;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService{

        private final Map<String, NotificationStrategy> mapStrategy = Map.of(
                "discord",new DiscordNotificationStrategy(),
                "instagram", new InstagramNotificationStrategy(),
                "whatsapp", new WhatsAppNotificationStrategy()
        );

    public void notify(@NotBlank String channel, @NotBlank String destination, @NotBlank String message) {
            mapStrategy.get(channel).SendNotification(destination,message);
    }
}
