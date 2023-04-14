package kodlama.io.starbucks.configuration.adapter;

import kodlama.io.starbucks.adapters.MernisServiceAdapter;
import kodlama.io.starbucks.business.abstracts.CustomerCheckService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerCheckConfig {
    @Bean
    public CustomerCheckService getCustomerCheckService(){
        return new MernisServiceAdapter();
    }
}
