package FicherosBinarios;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero16 {
	public static void main(String[] args) throws IOException {
		// Abrir el archivo FAleatorio2.dat en modo de lectura y escritura
		RandomAccessFile f = new RandomAccessFile("FAleatorio2.dat", "rw");

		// Imprimir los primeros 10 términos de la serie de Fibonacci
		System.out.println("Serie de Fibonacci:");
		int n = 10;
		int a = 0;
		int b = 1;
		int temp = 0;

		for (int i = 2; i < n; i++) {
			temp = a + b;
			System.out.print(temp + ", ");
			a = b;
			b = temp;
			f.writeLong(temp);
		}

		System.out.println("");

		// Determinar el tamaño actual del archivo y retroceder 24 bytes
		//long son 8 bytes por posicion 
		long size = f.length() - 32;

		// Modificar el último valor de la serie de Fibonacci a 0
		int k = 0;
		f.seek(size);
		f.writeLong(k);

		// Leer y mostrar los primeros 8 términos de la serie de Fibonacci desde el
		// principio del archivo
		System.out.println("Serie de Fibonacci modificada:");
		f.seek(0);
		for (long i = 0; i < 8; i++) {
			System.out.print(f.readLong() + ", ");
		}

		// Cerrar el archivo
		f.close();
	}
}
