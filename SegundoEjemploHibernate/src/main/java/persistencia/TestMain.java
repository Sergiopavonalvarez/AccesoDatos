package persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Test;

public class TestMain {

	public static void main(String[] args) {

		SessionFactory sf = null;
		Session session = null;
		try {
			// Inicializamos un objeto SessionFactory con la configuración
			// del fichero hibernate.cfg.xml
			sf = new Configuration().configure().buildSessionFactory();

			// Iniciamos una sesión
			session = sf.openSession();

			// Construimos un objeto de tipo Test
			Test test1 = new Test();
			test1.setId(1);
			test1.setName("Hello");
			// Construimos otro objeto de tipo Test
			Test test2 = new Test();
			test2.setId(2);
			test2.setName("World");

			// Iniciamos una transacción dentro de la sesión
			session.beginTransaction();

			// Almacenamos los objetos
			session.persist(test1);
			session.persist(test2);

			// Commiteamos la transacción
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerramos todos los objetos
			if (session != null)
				session.close();
			if (sf != null)
				sf.close();
		}

	}

}
