package FicherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero15_seek {

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
			f.writeInt(temp);
		}

		System.out.println("");

		// Calcular y mostrar el tamaño actual del archivo
		long size = f.length();
		System.out.println("El tamaño es: " + size);

		// Modificar el valor en una posición específica del archivo a 0
		int pos = 7; // Posición en la que se modificará el valor (1-indexed)
		int k = 0;
		// se utiliza para ajustar la posición a un índice basado en cero, ya 
		//que la posición del archivo generalmente se cuenta desde el índice 0. 
		//Luego, se multiplica por 4 porque cada entero en Java ocupa 4 bytes
		f.seek((pos - 1) * 4);
		f.writeInt(k);

		// Leer y mostrar los primeros 8 términos de la serie de Fibonacci desde el
		// principio del archivo
		System.out.println("Serie de Fibonacci modificada:");
		f.seek(0);
		for (int i = 0; i < 8; i++) {
			System.out.print(f.readInt() + ", ");
		}

		// Cerrar el archivo
		f.close();
	}
}
