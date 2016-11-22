package com.idprocess.transport.ws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idprocess.transport.model.Chauffeur;
import com.idprocess.transport.model.Client;
import com.idprocess.transport.model.Mission;
import com.idprocess.transport.model.User;
import com.idprocess.transport.persistence.ChauffeurDao;
import com.idprocess.transport.persistence.ClientDao;
import com.idprocess.transport.persistence.MissionDao;
import com.idprocess.transport.persistence.UserDao;


@Service
public class ClientWsServiceImpl implements ClientWsService{
	
	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ChauffeurDao chauffeurDao;
	
	@Autowired
	private MissionDao missionDao;
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.ws.services.ClientWsService#addClient(com.idprocess.transport.model.Client)
	 */
	@Override
	public String addClient(Client client) {
		clientDao.addClient(client);
		return "success";
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.ws.services.ClientWsService#getNameClient(int)
	 */
	@Override
	public String getNameClient(int id) {
	   return clientDao.findClientById(id).getNom();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.ws.services.ClientWsService#login(java.lang.String, java.lang.String)
	 */
	@Override
    public boolean loginUser(String login, String mp) {
		User u = new User();
		u.setLogin(login);
		u.setPassword(mp);
	 return userDao.findUserBylog(u);
   }
	
	/*
	 * (non-Javadoc)
	 * @see com.idprocess.transport.ws.services.ClientWsService#loginChauffeur(java.lang.String, java.lang.String)
	 */
	public boolean loginChauffeur(String login, String mp){
		Chauffeur c = new Chauffeur();
		c.setLogin(login);
		c.setPassword(mp);
	 return chauffeurDao.findChauffeurBylog(c);	
	}
	
	
	public List<Mission> findMissionByChauffeur(String chauffeur, String mp){
			Mission m = new Mission();
//			m.setChauffeur(chauffeur);
//			m.setPassword(mp);
		   return missionDao.findMissionByChauffeur(m);

	}


}
