package com.idprocess.transport.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.persistence.repository.ClientRepository;
import com.idprocess.transport.services.ClientService;

@Component("clientMB")
@Scope("session")
@Data
public class ClientManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String ERROR   = "error";

	private boolean particularCategory = false;
	private boolean organisationCategory = true;
	private String category;
	
	private boolean activation = false;
	private boolean desactivation = true;
	
	private boolean tableauOrg = false; 
	
    private Client selectedClientOrg; 

	//Spring Client Service is injected...
	@Autowired
	ClientService clientService;
	
	@Autowired
	ClientRepository clientRepository;

	@Getter
	@Setter
	private Client client = new Client();
	
	private List<Client> list = new ArrayList<Client>();
	@Getter
	@Setter
	private List<Client> listClient = new ArrayList<Client>();
	
	@Getter
	@Setter
	private List<Client> listClientPar = new ArrayList<Client>();

	@Getter
	@Setter
	private List<Client> listClientOrg = new ArrayList<Client>();
	
	
	
	public List<Client> getList(){
		
		list = clientService.tousLesClient();
		return list;
	}
	
	
	public List<Client> autocomplete(String query) {  
        List<Client> results = new ArrayList<Client>();  
        query = "%"+query+"%";
        results= clientRepository.findClientByNomOrgLike(query);  
        return results;  
    }  

	
	/**
	 * recherche des client organisations
	 */
	public void chercheClientParNomOuVille(){		
		StringBuffer nomOrgSB = new StringBuffer();
		nomOrgSB.append("%").append(this.client.getNomOrg()).append("%");
		
		StringBuffer villeSB = new StringBuffer();
		villeSB.append("%").append(this.client.getAdresse().getVille()).append("%");
		
		listClientOrg =  clientService.findByNomOrgLikeAndAdresseVilleLike(nomOrgSB.toString(), villeSB.toString());
		client = new Client();	
		tableauOrg = true;
		
	}
	
	


	public void chooseCategory(ValueChangeEvent e){
		if("particulier".equals(e.getNewValue())){
			particularCategory = true;
			organisationCategory = false;
			client.setTypeClient("particulier") ;
		}

		if("organisation".equals(e.getNewValue())){
			organisationCategory = true;
			particularCategory = false;
			client.setTypeClient("organisation") ;

		}
	}


	/**
	 * Add Client
	 * 
	 * @return String - Response Message
	 */
	
	public String addClient() {
		try {
			client.setTypeClient("organisation");
			clientService.addClient(client);
			client = new Client();
			return "";
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	

		return ERROR;
	}

	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		client.setCivilite("");
		
		client.setMail("");
		client.setMobile("");
		client.setNom("");
		client.setPrenom("");
	}
	
	/**
	 * activer les champs pour modifier client
	 */
	public void activerChamps(){
			activation = true;
			desactivation = false;
			
	}
	/**
	 * deactiver les champs et sauvegarder
	 */
	public void desactiverChamps(){
		activation = false;
		desactivation = true;
		clientService.addClient(this.selectedClientOrg);
		client = new Client();	
		
	}


}