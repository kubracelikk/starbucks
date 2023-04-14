package kodlama.io.starbucks.repository;

import kodlama.io.starbucks.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsByNationalIdentity(String nationalIdentity);
}
