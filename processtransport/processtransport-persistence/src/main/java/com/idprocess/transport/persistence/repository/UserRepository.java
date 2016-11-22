/**
 * 
 */

package com.idprocess.transport.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idprocess.transport.model.Utilisateur;

/**
 * @author oussama
 *
 */
public interface UserRepository extends JpaRepository<Utilisateur, Long>{

	Utilisateur findUserByLogin(String login);
}
