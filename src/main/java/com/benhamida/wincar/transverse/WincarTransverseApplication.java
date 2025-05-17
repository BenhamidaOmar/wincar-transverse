package com.benhamida.wincar.transverse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.benhamida.wincar.transverse.config.GlobalConfig;
import com.benhamida.wincar.transverse.entities.Collaborateur;
import com.benhamida.wincar.transverse.repository.CollaborateurRepository;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class WincarTransverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WincarTransverseApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CollaborateurRepository collaborateurRepository) {

		return args -> {

			Collaborateur c1 = new Collaborateur(null, "Benhamida", "Omar", "obenhami@btechnologie.com",
					"+212661811722");
			Collaborateur c2 = new Collaborateur(null, "Fathi", "Youssef", "yfathi@btechnologie.com", "+212661140596");

			List<Collaborateur> ordres = new ArrayList<>();
			ordres.add(c1);
			ordres.add(c2);

			collaborateurRepository.saveAll(ordres);

		};
	}

}
