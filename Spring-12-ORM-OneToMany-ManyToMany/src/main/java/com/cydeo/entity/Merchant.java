package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "merchants")
public class Merchant extends BaseEntity{
    private String code;
    private String name;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private int payoutDelayCount;
}
