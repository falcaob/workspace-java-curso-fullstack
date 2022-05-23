package fechas;

import java.time.LocalDateTime;

public class Ejercicio1Fechas {

	public static void main(String[] args) {
		
		/*
		 * Ejercicio: escribe un programa que obtenga la fecha y hora actual con
		 * LocalDateTime. A continuación, realizar las siguientes operaciones con la
		 * fecha:
		 * 
		 * Sumar 1 día. 
		 * Sumar 1000 milisegundo. 
		 * Restar 1 año. 
		 * Restar 1 mes.
		 */
		
		LocalDateTime ldt = LocalDateTime.now(); 
		//ldt = dt.plusDays(1);
		//ldt = dt.plusSeconds(1000);
		//ldt = dt.plusYears(1);
		//ldt = dt.minusMonths(1);
		System.out.println(ldt.plusDays(1));
		System.out.println(ldt.plusSeconds(1000));
		System.out.println(ldt.plusYears(1));
		System.out.println(ldt.plusMonths(1));
		
		

	}

}
