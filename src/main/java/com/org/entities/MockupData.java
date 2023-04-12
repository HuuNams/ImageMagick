package com.org.entities;
import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "MOCKUP_DATA")
@Data
public class MockupData {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESIGN_PATH")
    private String designPath;

    @Column(name = "MODEL_PATH")
    private String modelPath;
}
