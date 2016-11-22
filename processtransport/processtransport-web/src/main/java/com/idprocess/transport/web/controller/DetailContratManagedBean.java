package com.idprocess.transport.web.controller;

import java.io.Serializable;

import javax.faces.bean.RequestScoped;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;

import com.idprocess.transport.model.DetailContrat;

@Component("detailContratMB")
@RequestScoped
@Data
public class DetailContratManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Getter
		@Setter
		private DetailContrat detailcontrat = new DetailContrat();
		
		
}
