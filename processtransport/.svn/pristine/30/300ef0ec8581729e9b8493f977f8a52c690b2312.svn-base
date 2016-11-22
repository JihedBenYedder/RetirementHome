package com.idprocess.transport.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;  
import javax.faces.context.FacesContext;  
import javax.faces.application.*; 
import javax.faces.event.ValueChangeEvent;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Contrat;
import com.idprocess.transport.model.DetailContrat;
import com.idprocess.transport.model.PlanningSemaine;

import com.idprocess.transport.services.ContratService;

@Component("contratMB")
@RequestScoped
@Data
public class ContratManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	// private static final String SUCCESS = "success";
	private static final String ERROR = "error";

	@Autowired
	ContratService contratService;

	@Getter
	@Setter
	private Contrat contrat = new Contrat();

	@Getter
	@Setter
	private DetailContrat detailcontrat = new DetailContrat();
	@Getter
	@Setter
	private DetailContrat det;
	@Getter
	@Setter
	private List<DetailContrat> listDet = new ArrayList<DetailContrat>();

	@Getter
	@Setter
	private PlanningSemaine planningSemaine = new PlanningSemaine();	
	
	private String adr;
	
//	private Format formatter = new SimpleDateFormat("dd/MMM/yyyy");
//	private Calendar calendar = Calendar.getInstance();

	private String clientRecherche;

	private Date date;
	
	private List<Contrat> listContrat = new ArrayList<Contrat>();
	
	private Contrat selectedContrat; 
	
	private int num;
	
	private boolean tableauContrat = false;

	private boolean occasionnelCategory = false;
	private boolean regulierCategory = true;
	private String category;

	private String etatAffichage = "true";

	private boolean etat_popup = false;
	
	private boolean activation = false;
	private boolean desactivation = true;

	public void chooseCategory(ValueChangeEvent e) {
		if ("occasionnel".equals(e.getNewValue())) {
			occasionnelCategory = true;
			regulierCategory = false;
			contrat.setTypeContrat("occasionnel");
			contrat.setEtatContrat("actif");
		}

		if ("regulier".equals(e.getNewValue())) {
			regulierCategory = true;
			occasionnelCategory = false;
			contrat.setTypeContrat("regulier");	
			contrat.setEtatContrat("actif");
		}
	}

	public String addContrat() {
		try {
			
			Date deb = contrat.getDateDebutContrat();
			Date fin = contrat.getDateFinContrat();
			if (!fin.before(deb))
		        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sample error message", "erreur de date, date fin doit etre superieur a la date de debut !!!"));  
				System.out.println("Erreur de date !!!!! la date de fin "+fin+ " doit etre superieur a la date de debut "+deb);
			
			//contrat.setEtatContrat="actif";
			detailcontrat.getPlanningSemaines().add(planningSemaine);	
			this.listDet.add(this.detailcontrat);
			contrat.setDetailContrats(this.listDet);
			contratService.addContrat(contrat);
			planningSemaine = new PlanningSemaine();
			detailcontrat = new DetailContrat();			
			contrat = new Contrat();			
			return "";
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		return ERROR;
	}

	public void cacherChamps() {
		etatAffichage = "true";

	}

	public void afficher_popup() {
		etat_popup = true;
	}

	public void chercheContratParTypeOuPassager(){		
		StringBuffer typeSB = new StringBuffer();
		typeSB.append("%").append(this.contrat.getTypeContrat()).append("%");
		
		StringBuffer passagerSB = new StringBuffer();
		passagerSB.append("%").append(this.contrat.getPassager().getNom()).append("%");
		
		StringBuffer clientSB = new StringBuffer();
		clientSB.append("%").append(this.clientRecherche+"%");
		
		listContrat =  contratService.findByTypeContratLikeAndPassagerNomLike(typeSB.toString(), passagerSB.toString(),clientSB.toString());
		
		StringBuffer typeSB2 = new StringBuffer();

		tableauContrat = true;
	}
	
	public void activerChamps(){
		activation = true;
		desactivation = false;
		
	}
	
	public void desactiverChamps(){
		activation = false;
		desactivation = true;
		contratService.addContrat(this.selectedContrat);
		contrat = new Contrat();	
	}
	
	public List<DetailContrat> ajoutListeDetail(){
		
		DetailContrat det = new DetailContrat();
		listDet.add(det);
		num = num+1;
		return listDet;
	}
	
	public void removeDetailContrat(DetailContrat detailcontrat){
		listDet.remove(detailcontrat);
	}
	
	public void removeDetailContrat2(int id){
		listDet.remove(listDet.get(id));
	}
	
	public long getActifTarif(List<DetailContrat> detailcontrats){
		
		for(DetailContrat detailContrat : detailcontrats){
			if(detailContrat != null)
				return detailContrat.getTarifTtc();
		}
		
		return 0;
	}
	
}
