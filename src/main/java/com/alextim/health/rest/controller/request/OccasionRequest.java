package com.alextim.health.rest.controller.request;

import com.alextim.health.rest.enums.OccasionLevel;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class OccasionRequest {
    private OccasionLevel occasionLevel;
    private boolean convulsion;
    private LocalDateTime occasionDate;
}
