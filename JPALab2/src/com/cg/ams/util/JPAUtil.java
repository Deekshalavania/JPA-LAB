package com.cg.ams.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
		private static EntityManagerFactory emf=null;
		private static EntityManager em=null; //It will give the object so we need to create factory

		public static EntityManager getEntityManager()
		{
			emf=Persistence.createEntityManagerFactory("JPA-PU");
			em=emf.createEntityManager();
			return em; // We will entity Manager to perform all crude operation
			
		}

		}
