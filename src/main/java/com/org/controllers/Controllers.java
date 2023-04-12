package com.org.controllers;

import com.org.entities.MockupRequest;
import com.org.entities.MockupResponse;
import com.org.services.MockupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Controllers {

    @Autowired
    private MockupService mockupService;
    @PostMapping("/mockup")
    public ResponseEntity<MockupResponse> genMockup (@RequestBody MockupRequest mockupRequest) {
        //TODO: Should any information should be logged here?
        MockupResponse mockupResponse = mockupService.generateMockup(mockupRequest);

        return ResponseEntity.ok(mockup);
    }

}
