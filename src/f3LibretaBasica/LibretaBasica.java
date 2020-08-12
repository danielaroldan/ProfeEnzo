package f3LibretaBasica;

import java.util.Scanner;

public class LibretaBasica {
static Scanner Leer = new Scanner(System.in);
	
	String nombres[] = new String[10];

	
	
	public void agregarAlibreta(String nom, int lugar) {
		
			
			 
			 for (int i = 0; i < nombres.length ;i++) {
				 
					if (nombres[i]==(null)) {
							this.nombres[lugar] = nom;
							
					}
										
					else{
													
						System.out.println("****No se pudo agregar: "+nom+", en el lugar: "+(lugar+1)+"****");
					}	
			 }}
			
			
			 public void listarLibreta() {

				 for(int i=0;i<10;i++) {
					 if (nombres[i]==null) {
						System.out.println(i+1+") --> "+"");
					}else {
					System.out.println(i+1+") --> "+nombres[i]);
					}
				 }	
			 }
	
	
	public boolean existeContacto(String nom) {
		boolean existe=false;
		for (int  i= 0; i < nombres.length;i ++) {
			if (nombres[i]!=null && nom .equalsIgnoreCase(nombres[i]))
			{
		existe=true;
		
	}
	
		}
		return existe;}
	public void borrarNombre(String nom) {
		for (int  i= 0; i < nombres.length;i ++) {
			if (nombres[i]!=null && nom .equalsIgnoreCase(nombres[i]))
			{
		this.nombres[i] = "";
		System.out.println("****Se Borro: "+nom+ ", en el lugar: "+(nombres[i+1])+"****");
	}
	
		
}}



	public void borrarPosicion(int lugar) {
		int i=lugar;
		this.nombres[i]="";
		System.out.println("****Se Borro la posición N°: "+(lugar)+"que contenia el nombre: "+nombres[i]+"****");
	}


	



	public boolean quedaLugar() {
		
	boolean quedaLugar=false;
		for (int  i= 0; i < nombres.length;i ++) {
			if (nombres[i]==null){
				quedaLugar=true;
			}
	}return quedaLugar;
	
}


	public boolean controlDePosicion(int i) {
		boolean controlPosicion= false;
		if (i<10) {
			controlPosicion=true;
		}return controlPosicion;
		
	}}
	



