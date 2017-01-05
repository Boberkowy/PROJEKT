package com.example;

import com.example.Model.DAO.IAddressRepository;
import com.example.Model.Domain.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(IAddressRepository repository){
		return(args) -> {
			repository.save(new Address("pomorskie","gdansk","83-115","tczewska","52"));
			repository.save(new Address("lubuskie","Lublin","43-652","Kwiatowa","45"));

			log.info("Zapisani adresy");
			for(Address address : repository.findAll()){
				log.info(address.toString());
			}
		};
	}
}
