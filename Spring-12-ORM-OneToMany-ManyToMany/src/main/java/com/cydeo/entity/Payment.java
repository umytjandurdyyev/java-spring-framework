package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "payments")
public class Payment extends BaseEntity{
    private BigDecimal amount;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_detail_id")
    private PaymentDetail paymentDetail;

    public Payment(LocalDate createdDate,BigDecimal amount, Status status) {
        this.amount = amount;
        this.createdDate = createdDate;
        this.status = status;
    }
}
