package com.github.masouza28.strategy_design_pattern.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record NotificationRequest(
       @NotBlank String channel,
       @NotBlank String destination,
       @NotBlank String message
) {
}
