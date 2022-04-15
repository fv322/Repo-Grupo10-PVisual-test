package ar.edu.unju.fi.Objeto;

import java.time.LocalDate;
import ar.edu.unju.fi.Objeto.Empleado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Empleado emp= new Empleado("Luis",LocalDate.of(2022, 4, 15),1987,"Luis@gmail.com",180);
			
//			System.out.println(emp.getNombre());
//			System.out.println(emp.getFingreso());
//			System.out.println(emp.getLegajo());
//			System.out.println(emp.getMail());
//			System.out.println(emp.getHorastrabajadas());
//			System.out.println(emp.getSueldo());
			System.out.println(emp);
		}
}


