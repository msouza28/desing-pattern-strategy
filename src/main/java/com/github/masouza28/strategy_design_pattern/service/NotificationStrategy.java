package com.github.masouza28.strategy_design_pattern.service;

public interface NotificationStrategy {

    void SendNotification(String destination, String message);
}
