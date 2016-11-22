//package com.idprocess.transport.persistence.tests;
//
//import static org.fest.assertions.Assertions.assertThat;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.idprocess.transport.model.Adresse;
//import com.idprocess.transport.model.Client;
//import com.idprocess.transport.model.Contrat;
//import com.idprocess.transport.model.DetailContrat;
//import com.idprocess.transport.model.Groupe;
//import com.idprocess.transport.model.Passager;
//import com.idprocess.transport.persistence.repository.ClientRepository;
//import com.idprocess.transport.persistence.repository.ContratRepository;
//import com.idprocess.transport.persistence.repository.GroupeRepository;
//import com.idprocess.transport.persistence.repository.PassagerRepository;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-context-test.xml"})
//@ActiveProfiles(profiles = "dev")
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
//public class ClientJpaDaoTest {
//
//	@Autowired
//	ClientRepository clientRepository;
//	
//	@Autowired
//	PassagerRepository passagerRepository;
//	
//	@Autowired
//	GroupeRepository groupeRepository;
//	
//	@Autowired
//	ContratRepository contratRepository;
//	
//	private List<Groupe> listGroupe = new ArrayList<Groupe>();
//
//	
//	@Test
//	public void isInjected(){
//		assertThat(clientRepository).isNotNull();
//	}
//	
//	@Test
//	public void addClient(){
//		Adresse adr = new Adresse();
//		adr.setCp("75010");
//		adr.setRue("10 rue de paris");
//		adr.setVille("paris");
//		
//		Client c = new Client();
//		c.setAdresse(adr);
//		c.setCivilite("Mr");
//		c.setMail("aaa@aa.fr");
//		c.setNom("nom");
//		
//		//passagerRepository.saveAndFlush(c);
//	}
//	
//	@Test
//	public void SearchGroupe(){	
//	String nomP = "Gel";
//	String nomCli = "rance";
//	//listGroupe = groupeRepository.recherchAvecNomClientOuNomPassager(nomP, nomCli);
//	}
//	
//	@Test
//	public 	void ExistanceClient(){
//		Client client = new Client();
//		client.setNomOrg("SOCIETE GENERALE");
//		client.setNomRep("Gelbert");
//		client.setPrenomRep("Camille");
////	    List<Client> listC2 = clientRepository.clientExisteDeja(client.getNomOrg(), client.getNomRep(), client.getPrenomRep());
////	    
////	    System.out.println("size === "+listC2.size());
////	    
////	    if(listC2.size()!=0){
////		   
////	    	System.out.println("Ce client existe deja !!");
////	    	
////	    }
//	}
//	
//	@Test
//	public void ExistancePassager(){
//		Passager p = new Passager();
//		p.setNom("DUPOND");
//		p.setPrenom("Richard");
//		p.setMail("dupond@gmail.com");
////		List<Passager> listP = passagerRepository.passagerExisteDeja(p.getNom(), p.getPrenom(), p.getMail());
////		
////		System.out.println("size === "+listP.size());
////	    
////	    if(listP.size()!=0){
////		   
////	    	System.out.println("Ce passager existe deja !!");
////	    	
////	    }
//	}
//	
//
//	
//	@Test
//	public void ajoutContrat(){	
//		
//		Adresse adr2 = new Adresse();
//		adr2.setCp("75014");
//		adr2.setRue("15 rue de liberte");
//		adr2.setVille("paris");
//		
//	
//	Passager passager = new Passager();
//	passager.setIdPassager((long) 343);
//	
//	Contrat contrat_test = new Contrat();
//	contrat_test.setVehiculeAdapte(true);
//	contrat_test.setNombreAdultes(2);
//	contrat_test.setPassager(passager);
//	contrat_test.setBagages(1);
//	
//	DetailContrat detailContrat1 = new DetailContrat();
//	detailContrat1.setIdDetailContrat(1);
//	detailContrat1.setDuree(2);
//	detailContrat1.setTarifTtc((long) 150);
//	detailContrat1.setAdresseArrivee(adr2);
//	
//	
//	DetailContrat detailContrat2 = new DetailContrat();
//	detailContrat2.setIdDetailContrat(2);
//	detailContrat2.setDuree(4);
//	detailContrat2.setTarifTtc((long) 240);
//	
//	contrat_test.setDetailContrats(new ArrayList<DetailContrat>());
//	contrat_test.getDetailContrats().add(detailContrat1);
//	contrat_test.getDetailContrats().add(detailContrat2);
//	
//	//contratRepository.saveAndFlush(contrat_test);
//	}
//}
