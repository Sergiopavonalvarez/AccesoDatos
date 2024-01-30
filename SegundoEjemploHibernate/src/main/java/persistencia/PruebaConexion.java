package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:h2:C:\\BBDD\\H2DB\\Prueba"; // Cambia esto según tu configuración
		String user = "sa";
		String password = ""; // Cambia esto según tu configuración

		try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password)) {
			System.out.println("Conexión exitosa");
		} catch (SQLException e) {
			System.err.println("Error de conexión: " + e.getMessage());
		}
	}
}
