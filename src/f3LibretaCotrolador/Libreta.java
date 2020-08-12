package f3LibretaCotrolador;

public class Libreta {
	int cantidadRegistros;
	String nombres[];
	 boolean libre;
	public Libreta(int cantidadRegistros) {
		System.out.println("Se ha instanciado una Libreta");
		this.cantidadRegistros = cantidadRegistros;
		nombres = new String[cantidadRegistros];
	}

	public boolean quedaLugar() {
		System.out.println("--quedaLugar() -->[Libreta]");	
 
		boolean respuesta = false;

		for(int i=0 ; i<this.cantidadRegistros ; i++) {

			if(this.nombres[i] == null) {
				System.out.println("cambio a verd hay ="+i);
				
				respuesta = true;
			}
			System.out.println("Quedan: "+(i-1)+" lugares libres");
		}
		System.out.println("<--respuesta "+respuesta+" --[Libreta]");
	
		return respuesta;
	}
	
	public boolean agregarAlibreta(String nom) {
		System.out.println("--agregarAlibreta(String nom)-->[Libreta]");
		boolean lugar = this.quedaLugar();
		System.out.println("lugar= "+lugar);
		
		if(lugar) {
			int i = -1;
			do {
				i++;
			}while(nombres[i] != null);	
			this.nombres[i] = nom;			
		}

		System.out.println("<--bool lugar --[Libreta]");		
		return lugar;
	}
	
	public void listarLibreta() {
		System.out.println("--listarLibreta() -->[Libreta]");
		
		for(int i=0;i<cantidadRegistros;i++) {
			if (nombres[i]==null) {
				System.out.println(i+1+") --> "+"");
			}else {
			System.out.println(i+1+") --> "+nombres[i]);
			}
		}
	}
	
	public int posicionesLibres() {
		int libre1 = 0;
		for (int i = 0; i < nombres.length; i++) {
			
			if(nombres[i] == null|| nombres[i] == "") {
				libre1 ++ ;
			
			}
		}
		return (libre1);	

	}
	
	public boolean controlRepetido(String nombreAgr) {
		boolean existe=false;
		for (int i = 0; i < this.cantidadRegistros ; i++) {
			
			System.out.println(nombres[i]);
			if (nombreAgr.equalsIgnoreCase(nombres[i])) {
			
		existe= true;
	}
		System.out.println("existe: "+existe);
	}System.out.println("existe: "+existe);
		return existe;}

	public void borrarPosicion(int i) {
		int lugar=i;
		System.out.println("****Se Borro la posición N°: "+(lugar+1)+" que contenia el nombre: "+nombres[i]+"****");
		this.nombres[i]="";
		
		
	}

	public void borrarNombre(String nom) {
		for (int  i= 0; i < nombres.length;i ++) {
			if (nombres[i]!=null && nom .equalsIgnoreCase(nombres[i]))
			{
		this.nombres[i] = "";
		System.out.println("****Se Borro: "+nom+ ", en el lugar: "+"****");
			}
	}
	
}}
	







