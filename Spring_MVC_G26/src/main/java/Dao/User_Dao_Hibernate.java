package Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import Entity.User;

public class User_Dao_Hibernate {
	private HibernateTemplate ht;

	public User_Dao_Hibernate() {
		super();
	}

	public User_Dao_Hibernate(HibernateTemplate ht) {
		super();
		this.ht = ht;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	
	@Transactional
	public void insert(User s) {
		// TODO Auto-generated method stub
		ht.persist(s);
	}

	
	@Transactional
	public void update(User s) {
		// TODO Auto-generated method stub
		ht.merge(s);
	}

	
	@Transactional
	public void delete(User s) {
		// TODO Auto-generated method stub
		ht.delete(s);
	}

	
	@Transactional
	public User get(int uid) {
		// TODO Auto-generated method stub
		User s=ht.get(User.class, uid);
		return s;
	}

	
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> li=ht.loadAll(User.class);
		return li;
	}
	
	
}
