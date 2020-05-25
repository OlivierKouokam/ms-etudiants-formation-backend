package org.upac;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner{
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	FormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MsFormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		repositoryRestConfiguration.exposeIdsFor(Formation.class, Etudiant.class);
//		repositoryRestConfiguration.getCorsRegistry()
//		.addMapping("/**")
//		.allowedOrigins("*")
//		.allowedHeaders("*")
//		.allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "PATCH", "POST", "DELETE");
		
		Formation f1 = formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f2 = formationRepository.save(new Formation(null,"JAVA",30,null));
		Formation f3 = formationRepository.save(new Formation(null,"ORACLE",30,null));
		
		etudiantRepository.save(new Etudiant(null, "Kouokam", "Olivier", new Date(),f1));
		etudiantRepository.save(new Etudiant(null, "Hassan", "Cheick", new Date(),f1));
		etudiantRepository.save(new Etudiant(null, "Nasser", "Mounir", new Date(),f2));
		etudiantRepository.save(new Etudiant(null, "Kamdem", "Carl", new Date(),f3));
		etudiantRepository.save(new Etudiant(null, "Mohamed", "Youssfi", new Date(),f2));
	}

}
