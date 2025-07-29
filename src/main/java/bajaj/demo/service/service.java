package bajaj.demo.service;

import bajaj.demo.dto.Highestsalary;
import bajaj.demo.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private PaymentRepo paymentRepository;

    public Highestsalary getHighestSalary() {
        return paymentRepository.findHighest();
    }
}
