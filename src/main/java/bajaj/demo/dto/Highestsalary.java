package bajaj.demo.dto;

public class Highestsalary {
    private Double salary;
    private String name;
    private Integer age;
    private String departmentName;

    public Highestsalary(Double salary, String name, Integer age, String departmentName) {
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.departmentName = departmentName;
    }
}
