package com.github.masouza28.strategy_design_pattern.service.strategy;

import com.github.masouza28.strategy_design_pattern.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstagramNotificationStrategy implements NotificationStrategy {
    private static final Logger log = LoggerFactory.getLogger(InstagramNotificationStrategy.class);

    @Override
    public void SendNotification(String destination, String message) {
        log.info("[{}] foi enviado no canal Instagram para [{}]", message, destination);
    }
}
