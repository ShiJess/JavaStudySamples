package events;
import org.hibernate.Session;
import java.util.Date;
import util.HibernateUtil;

public class EventManger {

	public static void main(String[] args)
	{
		EventManger mgr=new EventManger();
		//if(args[0].equals("store"))
		//{
			mgr.createAndStoreEvent("My Event", new Date());
		//}
	}
	
	private void createAndStoreEvent(String title,Date theDate){
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Event theEvent=new Event();
		theEvent.setTitle(title);
		theEvent.setDate(theDate);
		
		session.save(theEvent);
		session.getTransaction().commit();
	}
}
