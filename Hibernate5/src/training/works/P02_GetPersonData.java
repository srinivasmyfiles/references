package training.works;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.entity.Person;
import training.util.HibernateUtil;

public class P02_GetPersonData {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession(); 
		
		Person p1 = session.get(Person.class, 1);
		session.close();
		factory.close();
		
		System.out.println(p1);
		
	}
}
