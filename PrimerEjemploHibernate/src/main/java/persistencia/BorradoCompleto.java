package persistencia;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Invento;

public class BorradoCompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = null;
		Session session = null;

		sf = new Configuration().configure().buildSessionFactory();
		session = sf.openSession();
		String[] inventos = new String[2];
		inventos[0] = "Imprenta";
		inventos[1] = "Vacuna Viruela";

		session.beginTransaction();

		for (int i = 0; i < inventos.length; i++) {
			Invento test33 = session.find(Invento.class, inventos[i]);
			System.out.println(test33.toString());
			session.remove(test33);

		}

		session.getTransaction().commit();
		;
		session.close();
		sf.close();

	}

}
