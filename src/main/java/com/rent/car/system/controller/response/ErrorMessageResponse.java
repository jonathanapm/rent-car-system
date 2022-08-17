package com.rent.car.system.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorMessageResponse {

    @JsonProperty("message_response")
    private String messageResponse;
}
