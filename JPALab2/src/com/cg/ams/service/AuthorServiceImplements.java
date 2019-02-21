package com.cg.ams.service;
import com.cg.ams.bean.Author;
import com.cg.ams.dao.AuthorClassImplements;
import com.cg.ams.dao.IAuthorDao;

public class AuthorServiceImplements implements IAuthorService{
    IAuthorDao dao=null;
    public AuthorServiceImplements()
    {
    	dao=new AuthorClassImplements();
    }
	@Override
	public Author addDetails(Author acc) {
		// TODO Auto-generated method stub
		return dao.addDetails(acc);
	}

	@Override
	public Author deleteAuthor(int AuthorId) {
		 return dao.deleteAuthor(AuthorId);
		
	}

	@Override
	public Author updateAuthor(int AuthorId,String firstName,String LastName,String PhoneNUM) {
		 return dao.updateAuthor(AuthorId,firstName,LastName,PhoneNUM);
	}

	@Override
	public Author getAuthorid(int AutId) {
		
		return dao.getAuthorid(AutId);
	}

}
