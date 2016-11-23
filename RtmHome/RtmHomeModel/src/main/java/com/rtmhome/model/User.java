package com.rtmhome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class User {

@Column(name = "id_user")
private Long id_user;

@Column(name = "id_user")
private String profile;

@Column(name = "username")
private String username;

@Column(name = "password")
private String password;

@Column(name = "email")
private String email;
}
