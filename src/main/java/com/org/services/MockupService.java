package com.org.services;

import com.org.entities.MockupData;
import com.org.entities.MockupRequest;
import com.org.entities.MockupResponse;
import com.org.repositories.MockupDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import magick.*;

@Service
@Slf4j
public class MockupService {
    private MockupDataRepository mockupDataRepository;

    public MockupResponse generateMockup(MockupRequest mockupRequest) {
        MockupResponse mockupResponse = new MockupResponse();
        try {
            long id = mockupRequest.getId();
            MockupData mockupData = mockupDataRepository.findById(id);
            if (mockupData == null) {
                //TODO: add detail here
                throw new Exception("ID not exist or something blah blah");
            }

            String design_path = mockupData.getDesignPath();
            String model_path = mockupData.getModelPath();

            ImageInfo imageInfo = new ImageInfo();
            MagickImage magickImage = new MagickImage();

        } catch (Exception exception) {
            log.error("Unexpected Exception, generating mockup failed", exception);
            //TODO: same as above
        }
        return mockupResponse;
    }
}
