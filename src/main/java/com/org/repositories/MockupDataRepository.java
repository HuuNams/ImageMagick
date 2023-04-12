package com.org.repositories;

import com.org.entities.MockupData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MockupDataRepository extends JpaRepository<MockupData, Long> {
    MockupData findById(long id);
}
