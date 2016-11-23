package com.rtmhome.services;

import java.util.List;

import com.rtmhome.model.RetirementHome;

public interface RetirementHomeService {
	
	public RetirementHome getRetirementHomeById(Long retirementHomeId);
	
	public List<RetirementHome> getRetirementHomes();
	
	public boolean createRetirementHome(RetirementHome retirementHome);

}
