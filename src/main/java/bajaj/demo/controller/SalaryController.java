package bajaj.demo.controller;

import bajaj.demo.dto.Highestsalary;
import bajaj.demo.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
    @Autowired
    private service salary;

    @GetMapping("/highestsalary")
    public Highestsalary getHighestSalary() {
        return salary.getHighestSalary();
    }
}
