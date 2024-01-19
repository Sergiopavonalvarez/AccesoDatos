package persistencia;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Invento;

public class BusquedaQuery1 {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session session = null;

		sf = new Configuration().configure().buildSessionFactory();
		session = sf.openSession();
		List<Invento> a = new ArrayList<>();
		a = session.createQuery("from Invento WHERE nombeInvento = 'Imprenta'", Invento.class).getResultList();
		for (Invento invento : a) {
			System.out.println(invento);
		}
	}

}
