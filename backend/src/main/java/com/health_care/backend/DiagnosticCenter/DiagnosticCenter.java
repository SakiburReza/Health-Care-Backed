package com.health_care.backend.DiagnosticCenter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class DiagnosticCenter {
    @Id
    @GeneratedValue

    private Integer id;
    private String name;
    private String location;
}