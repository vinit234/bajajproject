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

    // Getters and Setters
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
