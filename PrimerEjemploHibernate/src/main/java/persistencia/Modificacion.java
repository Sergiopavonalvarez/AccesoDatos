package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Invento;

public class Modificacion {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session session = null;

		sf = new Configuration().configure().buildSessionFactory();
		session = sf.openSession();
		Invento test3 = new Invento();

		test3.setFecha(1760);
		test3.setInventor("James Watt");
		test3.setNombeInvento("Maquina de Vapor");

		session.beginTransaction();
		session.persist(test3);
		
		

		session.getTransaction().commit();
		
		
		


		
		



		session.close();
		sf.close();


	}

}
