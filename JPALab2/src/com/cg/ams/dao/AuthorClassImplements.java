package com.cg.ams.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.ams.bean.Author;
import com.cg.ams.util.JPAUtil;

public class AuthorClassImplements implements IAuthorDao {

	EntityManager em=null;
	EntityTransaction trans=null;
	
	public AuthorClassImplements()
	{
		em=JPAUtil.getEntityManager();
		trans=em.getTransaction();
	}
	@Override
	public Author addDetails(Author auth) {
		trans.begin();
		em.persist(auth);
		trans.commit();
		return auth;
	}

	@Override
	public Author deleteAuthor(int AuthorId) {
		Author a1=em.find(Author.class,AuthorId);
		trans.begin();
		em.remove(a1);
		trans.commit();
		return a1;
		
	}

	@Override
	public Author updateAuthor(int AuthorId,String firstName,String LastName,String PhoneNUM) {
	 Author a2=em.find(Author.class, AuthorId);
	 trans.begin();
	 a2.setFirstName(firstName);
	 a2.setLastName(LastName);
	 a2.setPhoneNo(PhoneNUM);
	 trans.commit();
	 return a2;
	}

	@Override
	public Author getAuthorid(int AuthorId) {
		Author a4=em.find(Author.class,AuthorId);
		return a4;
	}

	


}
