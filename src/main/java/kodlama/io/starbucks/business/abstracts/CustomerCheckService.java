package kodlama.io.starbucks.business.abstracts;

import kodlama.io.starbucks.entities.Customer;

public interface CustomerCheckService {

    boolean checkIfRealPerson(Customer customer) throws Exception;
}
