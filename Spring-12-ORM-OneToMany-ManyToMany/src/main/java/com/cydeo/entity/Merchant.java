package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

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

    @OneToMany(mappedBy = "merchant") // one merchant to many payment
    private List<Payment> payments;

    public Merchant(String code, String name, BigDecimal transactionFee, BigDecimal commissionRate, int payoutDelayCount) {
        this.code = code;
        this.name = name;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }
}
