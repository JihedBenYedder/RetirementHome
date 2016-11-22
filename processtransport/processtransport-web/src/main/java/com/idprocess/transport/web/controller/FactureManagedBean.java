package com.idprocess.transport.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Passager;
import com.idprocess.transport.services.PassagerService;

	@Component("factureMB")
	@RequestScoped
	@Data
	public class FactureManagedBean<HttpSession> implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private Passager selectedFacture;
		private String tableauFacture = "false";		
		
		private boolean activation = false;
		private boolean desactivation = true;
		
		private Date dateDebut;	
		private Date dateFin;	
		
		
		
		public void findMissionByMultiParam(){
			
			tableauFacture = "true";
			
		}
		
		/**
		 * activer les champs pour modifier mission
		 */
		public void activerChamps(){
				activation = true;
				desactivation = false;
				
		}
		/**
		 * deactiver les champs et sauvegarder la mission
		 */
		public void desactiverChamps(){
			activation = false;
			desactivation = true;
			//passagerService.addPassager(passager);
			//passager = new Passager();				
		}
					
			
}
