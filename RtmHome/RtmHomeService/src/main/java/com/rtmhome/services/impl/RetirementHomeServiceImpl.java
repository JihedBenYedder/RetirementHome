package com.rtmhome.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.rtmhome.model.RetirementHome;
import com.rtmhome.persistance.repository.RetirementHomeRepo;
import com.rtmhome.services.RetirementHomeService;

//@Repository(value = "retirementHomeService")
@Component
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
		return retirementHomeRepo.save(retirementHome) != null;
	}

}
