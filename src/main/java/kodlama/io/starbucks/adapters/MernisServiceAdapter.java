package kodlama.io.starbucks.adapters;

import kodlama.io.starbucks.business.abstracts.CustomerCheckService;
import kodlama.io.starbucks.entities.Customer;
import kodlama.io.starbucks.mernis.OAGKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        OAGKPSPublicSoap client = new OAGKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());

    }
}
