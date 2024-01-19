package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Invento;

public class TestMain {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session session = null;

		try {
			sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			Invento test1 = new Invento();
			Invento test2 = new Invento();
			Invento test3 = new Invento();
			test1.setFecha(1454);
			test1.setInventor("Gutemberg");
			test1.setNombeInvento("Imprenta");

			test2.setFecha(1769);
			test2.setInventor("Edward Jenner");
			test2.setNombeInvento("Vacuna Viruela");

			test3.setFecha(1895);
			test3.setInventor("Lumiere");
			test3.setNombeInvento("Cinematografo");

			session.beginTransaction();
			session.persist(test1);
			session.persist(test2);
			session.persist(test3);
			session.getTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();

			}
			if (sf != null) {
				sf.close();
			}

		}
	}
}
