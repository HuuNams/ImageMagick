package com.org.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MockupRequest {
    @JsonProperty("id")
    private long id;
    @JsonProperty("b64ImageRequest")
    private String b64ImageRequest;
}
