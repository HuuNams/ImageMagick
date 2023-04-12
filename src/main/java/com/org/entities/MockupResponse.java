package com.org.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MockupResponse {
    private int code;
    private String msg;
    private String b64ImageResponse;

    public void clear() {
        this.msg = "";
        this.b64ImageResponse = "";
    }
}
