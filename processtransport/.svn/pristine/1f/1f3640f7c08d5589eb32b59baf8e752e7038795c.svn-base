package com.idprocess.transport.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Passager;
import com.idprocess.transport.model.Groupe;
import com.idprocess.transport.services.GroupeService;

@Component("groupeMB")
@RequestScoped
@Data
public class GroupeManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String ERROR   = "error";

	//Spring Groupe Service is injected...
		@Autowired
		GroupeService groupeService;
		
		private Groupe selectedGroupe;
		private String tableauGroupe = "false";
		private String activation = "false";
		private String desactivation = "true";
				
		@Getter
		@Setter
		private Groupe groupe = new Groupe();				
	
		private String nomP;
		private String nomCli;
		
		@Getter
		@Setter
		private List<Groupe> listGroupe = new ArrayList<Groupe>();
	
		/** 
		 * Add Groupe
		 * 
		 * @return String - Response Message
		 */
		
		public String addGroupe() {
			try {
				groupeService.addGroupe(groupe);
				groupe = new Groupe();
				return "";
							
			} catch (DataAccessException e) {
				e.printStackTrace();
			} 	

			return ERROR;
		}

		private List<Groupe> list = new ArrayList<Groupe>();
		
		
		public List<Groupe> getList(){
			list = groupeService.tousLesGroupe();
			return list;
		}
		
		public void findGroupeByParam(){
			
			String nomP = this.getNomP();
			String nomCli = this.getNomCli();
					
			listGroupe =  groupeService.recherchAvecNomClientOuNomPassager(nomP, nomCli);
			groupe = new Groupe();		
		}
		
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
			groupeService.addGroupe(this.selectedGroupe);
			groupe = new Groupe();				
		}
		
	}

