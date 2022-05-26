package clasejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {
	
	public static void main(String[] args) {

		Connection conexion = null;
		
		try {
			/*
			 * subprotocolo: mysql host: localhost puerto: 3306 base de datos: banco
			 * usuario: banco contraseña: banco
			 */
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			
			// crear un objeto de tipo Statement
			Statement instruccion = conexion.createStatement();
			
			/*
			 * SELECT
			 */
			String sql = "SELECT * FROM gestor";
			
			// aquí se realiza la consulta
			ResultSet resultados = instruccion.executeQuery(sql);
			
			// para pedir datos a NEXT
			// mientras que haya resultados (next devuelve true), sigo iterando
			while(resultados.next()) {
				// para obtener el id
				int id = resultados.getInt("id");
				String usuario = resultados.getString("usuario");
				System.out.println(usuario);
			}
			
			
			/*
			 * INSERT INTO, UPDATE Y DELETE
			 */
			
			/*
			for(int i=0; i<1000; i++) {
				
				String sql = "INSERT INTO gestor (usuario, password, correo) VALUES ('gestor" + i  + "',"
						+ " 'gestor" + i + "', 'gestor10@correo.com')";
				
				int resgistroInsertados = instruccion.executeUpdate(sql);
				
			}
			*/
			
			//String sql = "INSERT INTO gestor (usuario, password, correo) VALUES ('gestor1', 'gestor1', 'gestor1@correo.com')";
			
			
			// aquí insertamos los datos del nuevo gestor
			
			
			//System.out.println("Se han insertado " + resgistroInsertados + " registros");
			
//			// muestra información del tipo de sistema de base de datos (MySQL)
//			System.out.println("Base de datos: " + conexion.getMetaData().getDatabaseProductName());
//
//			// muestra información sobre la versión del sistema de base de datos
//			// (5.5.5-10.4.11-MariaDB)
//			System.out.println("Versión: " + conexion.getMetaData().getDatabaseProductVersion());
//
//			// muestra información del diver MySQL (MySQL Connector/J)
//			System.out.println("Driver: " + conexion.getMetaData().getDriverName());
//
//			// muestra información de la versión del driver MySQL
//			// (mysql-connector-java-8.0.18)
//			System.out.println("Versión del driver: " + conexion.getMetaData().getDriverVersion());
//
//			// cerrar la conexión a la base de datos
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		// el bloque de finally se ejecuta siempre, falle o no falle el bloque del try
		finally {
			if(conexion != null) {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}

	}

}
