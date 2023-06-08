package com.cydeo.entity;

import com.cydeo.enums.Status;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment extends BaseEntity{
    private BigDecimal amount;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    @Enumerated(EnumType.STRING)
    private Status status;
}
