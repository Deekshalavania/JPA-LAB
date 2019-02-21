package com.cg.ams.service;



import com.cg.ams.bean.Author;


public interface IAuthorService 
{
public Author addDetails(Author auth);
public Author deleteAuthor(int AuthorId);
public  Author updateAuthor(int AuthorId,String firstName,String LastName,String PhoneNUM);
public Author getAuthorid(int AuthorId);

}
