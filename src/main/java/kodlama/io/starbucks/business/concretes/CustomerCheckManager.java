package kodlama.io.starbucks.business.concretes;

import kodlama.io.starbucks.adapters.MernisServiceAdapter;
import kodlama.io.starbucks.business.abstracts.CustomerCheckService;
import kodlama.io.starbucks.entities.Customer;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CustomerCheckManager implements CustomerCheckService {
    private final CustomerCheckService service;

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        return service.checkIfRealPerson(customer);
    }
}
