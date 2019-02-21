package com.cg.ems.ui;

import java.util.Scanner;

import com.cg.ams.bean.Author;
import com.cg.ams.service.AuthorServiceImplements;
import com.cg.ams.service.IAuthorService;

public class Main {
	static IAuthorService serv=new AuthorServiceImplements();
	public static void main(String[] args) 
	{
    int choice;
    Scanner scanner=new Scanner(System.in);
   
    while(true)
    {
    	System.out.println("Press Any Number");
 	    System.out.println("============\n1.Add\n 2.Delete\n 3.Update\n 4.FetchById\n5.Exit===============");
 	    choice=scanner.nextInt();
    	
    switch(choice)
    {
    case 1:System.out.println("Id will be generated automatically");
         
           System.out.println("Enter FirstName");
           String first=scanner.next();
           System.out.println("Enter MiddleName");
           String middle=scanner.next();
           System.out.println("Enter LastName");
           String lastt=scanner.next();
           System.out.println("Enter Phone Number");
           String phone=scanner.next();
           
           Author a=new Author();
           a.setFirstName(first);
           a.setLastName(lastt);
           a.setMiddleName(middle);
           a.setPhoneNo(phone);
           
           Author aa=serv.addDetails(a);
           
           System.out.println("===========Inserted=========");
    	    System.out.println(aa);
           break;
    case 2:System.out.println("Enter Id of which details you want to delete");
    	   int i=scanner.nextInt();
    	   Author ab=serv.deleteAuthor(i);
    	   System.out.println("==========Deleted=========");
    	    System.out.println(ab);
    	   break;
    case 3:System.out.println("Enter ID of which details you want to Update");
    	   int Authid=scanner.nextInt();
    	   System.out.println("Enter FirstName");
    	   String name=scanner.next();
    	   System.out.println("Enter LastName");
    	   String last=scanner.next();
    	   System.out.println("Enter Phone number");
    	   String number=scanner.next();
    	  Author aaaa=serv.updateAuthor(Authid, name,last,number);
    	   System.out.println("======Updated========");
    	    System.out.println(aaaa);
    	   	break;	
    case 4:
    	    System.out.println("Ener the id whose data you want to fetch");
    	    int idd=scanner.nextInt();
    	    Author aaa=serv.getAuthorid(idd);
   
    	    System.out.println("==========Fetched=============");
     	    System.out.println(aaa);
           break;
           
    case 5:System.out.println("=====Exit======");
    	System.exit(0);
    	
    	
    	 
    
    }

	}

}
}
