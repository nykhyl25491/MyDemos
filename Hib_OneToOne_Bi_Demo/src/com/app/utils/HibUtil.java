package com.app.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibUtil 
{
	private static SessionFactory sf;
	
	static
	{
		try 
		{
			//create instance of std service reg from its builder
			StandardServiceRegistry reg=new StandardServiceRegistryBuilder().configure().build();
			//build singleton n immutable SF instance from its meta data
			sf=new MetadataSources(reg).buildMetadata().buildSessionFactory();
			System.out.println("sf created!!!!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory getSf() {
		return sf;
	}

}


