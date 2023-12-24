package FicherosBinarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero17 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile f = new RandomAccessFile("FAleatorio3.dat", "rw");

		// Escribir "Hello Barbie"
		f.writeChars("Hello Barbie");

		// Posicionarse al inicio y leer una línea
		f.seek(0);
		String primeraLinea = f.readLine();
		System.out.println(primeraLinea);

		f.seek(12);
		f.writeChars("Ken!  ");

		// Posicionarse al inicio y leer una línea después de la escritura
		f.seek(0);
		String segundaLinea = f.readLine();
		System.out.println(segundaLinea);


		// Cerrar el archivo
		f.close();
		
	}
}
