package kodlama.io.starbucks.configuration.mapper;

import kodlama.io.starbucks.adapters.MernisServiceAdapter;
import kodlama.io.starbucks.business.abstracts.CustomerCheckService;
import kodlama.io.starbucks.business.concretes.CustomerCheckManager;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
