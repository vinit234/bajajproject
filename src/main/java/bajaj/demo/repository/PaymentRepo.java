package bajaj.demo.repository;

import bajaj.demo.dto.Highestsalary;
import bajaj.demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    @Query("SELECT new bajaj.demo.dto.Highestsalary(p.amount, CONCAT(e.firstName, ' ', e.lastName), FUNCTION('DATEDIFF', CURRENT_DATE(), e.dob) / 365, d.departmentName) " +
            "FROM Payment p " +
            "JOIN p.employee e " +
            "JOIN e.department d " +
            "WHERE FUNCTION('DAY', p.paymentTime) <> 1 " +
            "ORDER BY p.amount DESC " +
            "LIMIT 1")
    Highestsalary findHighest();
}
