package com.idprocess.transport.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Passager;
import com.idprocess.transport.services.GroupeService;
import com.idprocess.transport.services.PassagerService;

@Component("passagerMB")
@Scope("session")
@Data
public class PassagerManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String ERROR   = "error";
	
	private Passager selectedPassager;
	private String tableauPass = "false";
	private String activation = "false";
	private String desactivation = "true";
	
	
	//Spring Passager Service is injected...
		@Autowired
		PassagerService passagerService;
		
		@Autowired
		GroupeService groupeService;

		@Getter
		@Setter
		private Passager passager = new Passager();
		
		@Setter
		private List<Passager> listPassager = new ArrayList<Passager>();  // liste de resultat de recherche de tout les passager
		
		@Setter
		private List<Passager> listPassagerRecherch = new ArrayList<Passager>(); // liste de resultat de recherche
		
		/**
		 * Add Passager : ajout de nouveau passager
		 * 
		 * @return String - Response Message
		 */		
		public String addPassager() {
			try {				
				passagerService.addPassager(passager);
				passager = new Passager();
				return "";	 		
		
			} catch (DataAccessException e) {
				e.printStackTrace();
			};

			return ERROR;
		}

		/**
		 * Reset Fields
		 * 
		 */
		public void reset() {
			passager.setCivilite("");		
			passager.setMail("");
			passager.setMobile("");
			passager.setNom("");
			passager.setPrenom("");

		}
	
		/**
		 * cette methode permet la recherche d'un passager avec different criteres de recherche
		 */
		public void findPassagerByParam(){			

			StringBuffer nomSB = new StringBuffer();
			nomSB.append("%").append(this.passager.getNom()).append("%");
	
			StringBuffer prenomSB = new StringBuffer();			
			prenomSB.append("%").append(this.passager.getPrenom()).append("%");
			
			StringBuffer villeSB = new StringBuffer();			
			villeSB.append("%").append(this.passager.getAdresse().getVille()).append("%");
			
			StringBuffer nomorgSB = new StringBuffer();			
			nomorgSB.append("%").append(this.passager.getClient().getNomOrg()).append("%");
			
			listPassagerRecherch = passagerService.findPassagerByParam(nomSB.toString(), prenomSB.toString(), villeSB.toString(), nomorgSB.toString());
			passager = new Passager();
			
			tableauPass = "true"; // rendre le tableau des resultats visible
			
		}
		
		/**
		 * selectionne tous les passagers 
		 * @return
		 */
		public List<Passager> getlistPassager() {
			 listPassager = passagerService.findToutPassager(); // la liste entiere des passagers
			 return listPassager;
		}
		
			
		/*********  la modification des passagers ************/	  
		/**
		 * activer les champs pour modifier client
		 */
		public void activerChamps(){
				activation = "true";
				desactivation = "false";
				
		}
		/**
		 * deactiver les champs et sauvegarder
		 */
		public void desactiverChamps(){
			activation = "false";
			desactivation = "true";
			passagerService.addPassager(this.selectedPassager);
			passager = new Passager();				
		}
}
