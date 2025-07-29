package bajaj.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    private Integer departmentId;
    private String departmentName;
}
