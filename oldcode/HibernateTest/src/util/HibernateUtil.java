package util;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	static{
		try{
			//Configuration conf=new Configuration();
			//conf.configure();
			//ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).getBootstrapServiceRegistry();
			//sessionFactory=conf.buildSessionFactory(sr);
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("Ini"+ex);
			throw new ExceptionInInitializerError(ex);
		}
			}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}
