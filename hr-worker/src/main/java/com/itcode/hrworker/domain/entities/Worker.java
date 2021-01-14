package com.itcode.hrworker.domain.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull(message = "Field First Name be null")
    private String firstName;
    @NotNull(message = "Field Last Name be null")
    private String lastname;
    @NotNull(message = "Field email be null")
    @Email
    private String email;
    @NotNull(message = "Field DailyIcome be null")
    private Double dailyIncome;
}
