package com.onlinetouch.users.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.onlinetouch.users.enumtype.Role;

@Entity
public class UserRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userRoleId;
	
	@ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
    private Set<WebUser> users;
	
	@Enumerated(EnumType.STRING)
	private Role role;

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Set<WebUser> getUsers() {
		return users;
	}

	public void setUsers(Set<WebUser> users) {
		this.users = users;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
