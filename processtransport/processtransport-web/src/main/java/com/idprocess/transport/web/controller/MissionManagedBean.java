package com.idprocess.transport.web.controller;

import java.io.Serializable;

import javax.faces.bean.RequestScoped;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;

import com.idprocess.transport.model.Mission;

@Component("missionMB")
@RequestScoped
@Data
public class MissionManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
		@Getter
		@Setter
		private Mission mission = new Mission();
}
