package bajaj.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    private Integer paymentId;
    private Double amount;
    private LocalDateTime paymentTime;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

}
