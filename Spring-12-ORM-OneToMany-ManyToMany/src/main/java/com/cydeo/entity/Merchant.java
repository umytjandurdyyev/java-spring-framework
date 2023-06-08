package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "merchants")
@Data
@NoArgsConstructor
public class Merchant extends BaseEntity{
    private String code;
    private String name;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private int payoutDelayCount;
}
