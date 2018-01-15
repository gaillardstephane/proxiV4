package org.formation.spring.test;

import org.formation.spring.config.ApplicationConfig;
import org.formation.spring.dao.IDaoClient;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.model.Client2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		
		
		
		ApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);		   

	//	IPrestiBanqueService service = context.getBean("service", IPrestiBanqueService.class);
		IDaoClient service=context.getBean("service", IDaoClient.class);
		

		service.findAll();
	
		
//		service.addClient(new Client("Danielo", "BOLIVAR", "login", "motDePasse",new Adresse(53, "rue", "ville") ));
//	service.addClient(new Client2("filipo", "ZANZIBAR","login", "motDePasse", new Adresse(24, "rue", "Paris")));
////		
//////	service.deleteClient(3);
//		Client2 c=service.editClient(2);
//		c.setNom("Danielo");
//		
//	service.updateClient(c);
//		
		//addClient(new Client(1, "Bob", "L'�ponge", "email@gtm.com", new Adresse(24, "rue", "ville"), new Conseiller(1, "nomConseiller", "prenom")));
		//addClient(new Client(2, "nom", "prenom", "email", new Adresse(21, "rue", "ville"), new Conseiller(5, "nomConseiller", "prenom")));
		//System.out.println(service.listClients());
		
		
		//service.a
		
	    ((ConfigurableApplicationContext)(context)).close();

	}

}
