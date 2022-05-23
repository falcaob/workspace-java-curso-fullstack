package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		String contenido = "Guardar en un archivo";
		
		// PARA ESCRIBIR
		// en "" nombre del archivo
		// rodear con error
		try {
			
			// inicialización del objeto de la clase FileWriter 
			FileWriter fileWriter = new FileWriter("contenido.txt");
			fileWriter.write(contenido); // esta línea es la que escribe
			fileWriter.close();	// buena práctica cerrarlo siempre		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* para que escriba más de una vez
		 * for (int i = 0; i < 5; i++) {
				// escribe en el archivo
				fileWriter.write(contenido);
			}
		 */
		
		// PARA LEER
		// importar: FILES Y PATH 
		// rodearlo con err
		try {
			String content = new String ( Files.readAllBytes( Paths.get("contenido.txt") ) );
			System.out.println(content);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	


	}
}
