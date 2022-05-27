package myapp;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {
	
	private static String sha3(String input) {
        MessageDigest crypt;
        try {
            crypt = MessageDigest.getInstance("SHA3-512");
            crypt.update(input.getBytes(StandardCharsets.UTF_8));

            byte[] bytes = crypt.digest();
            BigInteger bi = new BigInteger(1, bytes);
            String digest = String.format("%0" + (bytes.length << 1) + "x", bi);

            return digest;
        } catch (NoSuchAlgorithmException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return null;
    }

	public static void main(String[] args) {
		
		//System.out.println(sha3("hola"));
		
		// UEmail.send("pruebacore12@gmail.com", "", "", "");
		
		/*
		 * Cuenta de correo: pruebacore122a@gmail.com
			Contraseña: pepitoperez
		 */
		
		/*
		 * 1. Registrar un nuevo usuario: solicita el nombre de usuario, password y correo
			2. Autenticación
			3. Cambiar contraseña
			4. Listar usuarios
			5. Eliminar usuario
			6. Salir
		 */
		
		// pasar este objeto a todos los métodos
		Connection conexion = null; // fuera para diponibilidad para resto de métodos
		try {
			// parámtros: nombre proyecto, nombre usuario y contraseña
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp", "myapp", "myapp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Scanner keyboard = new Scanner(System.in);

		int eleccion = 6;
		
		do {

			System.out.println("---");
			System.out.println("1. Registrar nuevo usuario");
			System.out.println("2. Autenticación");
			System.out.println("3. Cambiar contraseña");
			System.out.println("4. Listar usuarios");
			System.out.println("5. Eliminar usuario");
			System.out.println("6. Salir");
			System.out.println("---");
			System.out.print("Introduzca elección: ");
			eleccion = keyboard.nextInt();
		

			if (eleccion == 1) {
				Main.resgitrarNuevoUsuario(keyboard, conexion);
			} else if (eleccion == 2) {
				Main.autenticacion(keyboard, conexion);
			} else if (eleccion == 3) {
				Main.cambiarPassword(keyboard, conexion);
			} else if (eleccion == 4) {
				Main.listarUsuarios(conexion);
			} else if (eleccion == 5) {
				Main.eliminarUsuario(keyboard, conexion);
			} else if (eleccion == 6) {
				System.out.println("Salir");
		}
		
		} while (eleccion != 6);

		keyboard.close();

	}


	private static void eliminarUsuario(Scanner keyboard, Connection conexion) {
		// TODO Auto-generated method stub
		
	}


	private static void listarUsuarios(Connection conexion) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	private static void cambiarPassword(Scanner keyboard, Connection conexion) {
		
		System.out.println("Usuario: ");
		String usuario = keyboard.next();
		
		System.out.println("Nuevo password: ");
		String nuevoPassword = keyboard.next();
		
		String sql = "SELECT password FROM usuario WHERE usuario=?";
		
		try {
			PreparedStatement instruccion = conexion.prepareStatement(sql);
			
			instruccion.setString(1, usuario);
			
			ResultSet result = instruccion.executeQuery();		
			if(!result.next()) {
				System.out.println("No existe el usuario");
				return;
			}
			
			// en este punto del programa sabemos que el usuario existe y por tanto, podemos cambiar la contraseña
			String nuevoPasswordSH3 = Main.sha3(nuevoPassword);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	private static void autenticacion(Scanner keyboard, Connection conexion) {
		/*
		 * Solicitud de datos al usuario
		 */
		
		System.out.println("Usuario: ");
		String usuario = keyboard.next();
		
		System.out.println("Password: ");
		String password = keyboard.next();
		
		try {
			
			
			String sql = "SELECT * FROM usuario WHERE usuario=? AND password=?";
			PreparedStatement instruccion = conexion.prepareStatement(sql);
			
			instruccion.setString(1, usuario);
			//instruccion.setString(2, password);
			
			ResultSet result = instruccion.executeQuery();	
			if(!result.next()) {
				System.out.println("No existe el usuario");
				return;
			}
			
			// si existe, entonces hay que comprobar las contraseñas
			String passwordGuardada = result.getString("password");
			
			if(sha3(password).equals(passwordGuardada)) {
				System.out.println("Autenticacion correcta");
			}
			else {
				System.out.println("¡Autenticación INCORRECTA!");
			}
			
			/*
			 * VULNERABLES A ATAQUES DE INYECCION SQL
			Statement instruccion = conexion.createStatement();
			
			String sql = String.format("SELECT * FROM usuario "
					+ "WHERE usuario='%s' AND password='%s'", usuario, password);
			
			ResultSet result = instruccion.executeQuery(sql);
			*/
			
			// si la autenticación es correcta, result debe devolver un registro
			// si la autenticación no es correcta, result no devuelve ningún registro
			
			// si next() devuelve true, entonces hay al menos un registro
			// si next() devuelve false, entonces no hay ningún registro
			
			/*
			if(result.next()) {
				System.out.println("¡Autenticación correcta!");
			} 
			else {	
				System.out.println("¡Autenticación INCORRECTA!");
			}
			*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
		
	}
		
	
	
	
	

	private static void resgitrarNuevoUsuario(Scanner keyboard, Connection conexion) {
		
		/*
		 * Solicitud de datos al usuario
		 */
		
		System.out.println("Usuario: ");
		String usuario = keyboard.next();
		
		System.out.println("Password: ");
		String password = keyboard.next();
		
		System.out.println("Correo: ");
		String correo = keyboard.next();
		
		
		
		/*
		 * Validación
		 */
		
		if(usuario.length() < 4) {
			System.err.println("Nombre de usuario demasiado corto");
			return;
		}
		
		if(password.length() < 8) {
			System.err.println("Password demasiado corto");
			return;
		}
		
		if(!correo.contains("@")) {
			System.out.println("No es un correo válido");
			return;
		}
		
		/*
		 * Insertar los datos del usuario en la base de datos
		 */
		
		try {
			Statement instruccion = conexion.createStatement();
			
			//String sql = "INSERT INTO usuario (usuario, password, correo VALUES ('" + usuario + "', " + password + "','" + correo + "')";
			
			String passwordSHA3 = sha3(password);
			String sql = String.format("INSERT INTO usuario (usuario, password, correo) "
					+ "VALUES ('%s', '%s', '%s')", usuario, password, correo);
			
			int registrosInsertados = instruccion.executeUpdate(sql);
			if(registrosInsertados == 1) {
				System.out.println("Usuario insertado correctamente");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
