package FicherosBinarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero14_RandomAccessFile {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fichero = new RandomAccessFile("FAleatorio.dat", "rw");


        String a = "Hola Mundo";

        // Escribir el String
        fichero.writeUTF(a);

        // Mover el puntero al final del archivo
        //fichero.seek(fichero.length());

        // Imprimir la posición actual del puntero
        System.out.println("Posicion actual del puntero del fichero: " + fichero.getFilePointer()+"\n"+"tamaño: "+fichero.length());
        fichero.seek(12);

        // Escribir la nueva cadena después de la cadena existente
        String saludo = "Soy Sergio";
        fichero.writeUTF(saludo);

        // Mover el puntero al inicio y leer la cadena completa
        fichero.seek(0);
        System.out.println(fichero.readUTF());

        fichero.close();
    }
}
