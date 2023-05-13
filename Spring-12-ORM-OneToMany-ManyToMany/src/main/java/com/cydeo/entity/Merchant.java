package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "merchants")
public class Merchant extends BaseEntity{
    private String code;
    private String name;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private int payoutDelayCount;
    @OneToMany(mappedBy = "merchant") // one to many relationship, ownership belongs to many side
    private List<Payment> paymentList;

    public Merchant(String code, String name, BigDecimal transactionFee, BigDecimal commissionRate, int payoutDelayCount) {
        this.code = code;
        this.name = name;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }
}
