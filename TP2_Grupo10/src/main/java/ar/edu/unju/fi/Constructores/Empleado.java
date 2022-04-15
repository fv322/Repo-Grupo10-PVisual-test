package ar.edu.unju.fi.Constructores;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private LocalDate fingreso = LocalDate.of(1900,01,01);
	private int legajo = -9999;
	private String mail;
	private int sueldo;
	private int horastrabajadas;
	
	
	
	public Empleado() { //constructor por defecto
		super();
	}
	
	public Empleado(String nombre, int legajo, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horastrabajadas = horastrabajadas;
	}

	public Empleado(String nombre, LocalDate fingreso, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.fingreso = fingreso;
		this.horastrabajadas = horastrabajadas;
	}

	public Empleado(String nombre, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.horastrabajadas = horastrabajadas;
	}
	

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fingreso=" + fingreso + ", legajo=" + legajo + ", mail=" + mail
				+ ", sueldo=" + sueldo + ", horastrabajadas=" + horastrabajadas + "]";
	}

}
