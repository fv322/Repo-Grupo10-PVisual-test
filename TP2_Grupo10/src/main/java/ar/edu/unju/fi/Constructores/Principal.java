package ar.edu.unju.fi.Constructores;

import java.time.LocalDate;

import ar.edu.unju.fi.Constructores.Empleado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado emp1 = new Empleado();
		Empleado emp2 = new Empleado("jose",15,150);
		Empleado emp3 = new Empleado("jose2",LocalDate.of(2022, 4, 15),160);
		Empleado emp4 = new Empleado("jose3",170);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
	}

}
