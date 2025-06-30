package com.alextim.health.rest.controller.request;

import lombok.Getter;

@Getter
public class PersonRequest {
    private String firstName;
    private String middleName;
    private String secondName;
    private Long countryId;
    private String email;
}
