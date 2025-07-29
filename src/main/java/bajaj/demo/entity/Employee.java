package bajaj.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private Integer empId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;
}
