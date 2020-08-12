package f3LibretaCotrolador;

import java.util.Scanner;

public class controlador {

	public static void main(String[] args) {
		Scanner Leer = new Scanner (System.in);
		Libreta miLibretita = new Libreta(10);
 		
		miLibretita.agregarAlibreta("Francisco");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Fernando");
		miLibretita.listarLibreta();		
		
		
int opcion;
do {
	System.out.println(" ");
	System.out.println("*.*.*.*.*.*.*.*.*.*.*  M E N Ú  *.*.*.*.*.*.*.*.*.*.* ");
	System.out.println(" ");
	System.out.println("..... ELIJA LA OPCIÓN QUE DESEA .....");
	System.out.println(" ");
	System.out.println("<<1>> Agregar un nombre");
	System.out.println("<<2>> Eliminar por posición");
	System.out.println("<<3>> Eliminar por nombre");
	System.out.println("<<4>> Mostrar Libreta");
	System.out.println("<<5>> Lugares Libres");
	System.out.println("<<0>> Salir");
	System.out.println(" ");
	System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
opcion= Leer.nextInt();
if (opcion==1) {
	int libres=miLibretita.posicionesLibres();
	
	
	if (libres==0) {
		int libre= miLibretita.posicionesLibres();
		System.out.println("Quedan "+ libre +" posiciones libres");
		System.out.println("No quedan lugares libres, primero borre alguno");
				
	}else {
		int libre= miLibretita.posicionesLibres();
		System.out.println("Quedan "+ libre +" posiciones libres");
		
	
			if (miLibretita.posicionesLibres()>0) {
				System.out.println("Escriba el nombre que desea agregar: ");
				String nombreAgr = Leer.next();
			
				if (miLibretita.controlRepetido(nombreAgr)) {
					
					System.out.println("El nombre que desea ingresar ya existe, intente con otro");
				}else {
					miLibretita.agregarAlibreta(nombreAgr);
					miLibretita.listarLibreta();
					miLibretita.posicionesLibres();
				System.out.println("Quedan "+ miLibretita.posicionesLibres() +" posiciones libres");
				}
			}	
	}		
}
	
if (opcion==2) {
		System.out.println("****Ingrese la posición a eliminar****");
		int lugar =Leer.nextInt();
		if (lugar<11) {
			miLibretita.borrarPosicion(lugar-1);
			miLibretita.listarLibreta();
		}
}
if (opcion==3) {
	System.out.println("****Ingrese nombre a eliminar****");
	String nom =Leer.next();
	if (miLibretita.controlRepetido(nom)) {
		miLibretita.borrarNombre(nom);
		miLibretita.listarLibreta();
	}
}
if (opcion==4) {
	miLibretita.listarLibreta();
}
if (opcion==5) {
	int libres=miLibretita.posicionesLibres();
	System.out.println("Quedan: "+ (libres)+" posiciones libres");

	
}
}while ( opcion!=0 );
System.out.println("****NOS VEMOS****");
Leer.close();
}


	}


