package com.rtmhome.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rtmhome.model.RetirementHome;
import com.rtmhome.persistance.repository.RetirementHomeRepo;
import com.rtmhome.services.RetirementHomeService;

public class RetirementHomeServiceImpl implements RetirementHomeService {

	@Autowired
	RetirementHomeRepo retirementHomeRepo;
	
	public RetirementHome getRetirementHomeById(Long retirementHomeId) {
		return retirementHomeRepo.findByIdRetirementHome(retirementHomeId);
	}

	public List<RetirementHome> getRetirementHomes() {
		return (List<RetirementHome>) retirementHomeRepo.findAll();
	}

	public boolean createRetirementHome(RetirementHome retirementHome) {
		// TODO Auto-generated method stub
		return false;
	}

}
