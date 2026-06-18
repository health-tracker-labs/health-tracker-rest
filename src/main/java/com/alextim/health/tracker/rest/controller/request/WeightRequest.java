package com.alextim.health.tracker.rest.controller.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class WeightRequest {
    private BigDecimal weight;
    private LocalDate date;
}
