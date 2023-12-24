import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Text;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

public class _03_Main {
    // Método principal "main" que puede lanzar excepciones de tipo IOException y ClassNotFoundException
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Crear una instancia de la clase XStream
        XStream x = new XStream();

        // Agregar permisos específicos a la instancia de XStream
        x.addPermission(NoTypePermission.NONE);
        x.addPermission(NullPermission.NULL);
        x.addPermission(PrimitiveTypePermission.PRIMITIVES);

        // Definir un array de clases que XStream está autorizado a utilizar
        Class[] clases = { _02_Ejercicio_Pais.class, _02_Ejercicio_ListaPaises.class };
        x.allowTypes(clases);

        // Permitir el uso de clases que pertenecen al paquete "com.your.package"
        x.allowTypesByWildcard(new String[] { "com.your.package.*" });

        // Asignar alias a las clases para que XStream pueda identificarlas en el archivo XML
        x.alias("Paises", _02_Ejercicio_ListaPaises.class);
        x.alias("Pais", _02_Ejercicio_Pais.class);

        // Configurar una colección implícita en la clase _02_Ejercicio_ListaPaises
        x.addImplicitCollection(_02_Ejercicio_ListaPaises.class, "Pais");

        // Crear un flujo de entrada desde el archivo "Paises.xml"
        FileInputStream fis = new FileInputStream("Paises.xml");

        // Deserializar el contenido del archivo XML en un objeto de la clase _02_Ejercicio_ListaPaises
        _02_Ejercicio_ListaPaises listaObj = (_02_Ejercicio_ListaPaises) x.fromXML(fis);

        // Iterar sobre la lista de países e imprimir información sobre cada uno
        for (_02_Ejercicio_Pais pais : listaObj.getPais()) {
            System.out.println("Nombre: " + pais.getNombre());
            System.out.println("Presidente: " + pais.getPresidente());
            System.out.println("PIB: " + pais.getPib());
            System.out.println("Coeficiente Gini: " + pais.getCoeficiente());
            System.out.println("----------------------");
        }
    }
}