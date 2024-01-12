package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Invento;

public class Busqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		Session session = null;

		sf = new Configuration().configure().buildSessionFactory();
		session = sf.openSession();
		Invento test33 = session.find(Invento.class, "Imprenta");
		System.out.println(test33.toString());


		session.close();
		sf.close();

	}

}
