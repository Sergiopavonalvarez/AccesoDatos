package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Partidos;
import entities.Politicos;

public class test {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session session = null;
		sf = new Configuration().configure().buildSessionFactory();
		session = sf.openSession();
		
		Politicos a=new Politicos();
		a.setEstudios("Graduado");
		a.setNombre("Sanchez");
		Partidos b=new Partidos();
		b.setEscaños(5);
		b.setNombre_partido("PSOE");
		b.setPoliticos(a);




		
		session.beginTransaction();
		session.persist(b);

		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
