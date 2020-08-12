package f3LibretaBasica;

import java.util.Scanner;

public class ControladorBasico {


		static Scanner Leer = new Scanner(System.in);

		public static void main(String[] args) {
			
	LibretaBasica miLibreta = new LibretaBasica();
			

			int opcion;
			do {
				
				System.out.println("****Ingrese opción que desea****");
				System.out.println("<<1>> Agregrar nombre y posición");
				System.out.println("<<2>> Eliminar nombre");
				System.out.println("<<3>> Eliminar posición");
				System.out.println("<<4>> Listar libreta");
				System.out.println("<<0>> Salir");
				
				opcion=Leer.nextInt();
				
				if (opcion==1) {
					
					if ( miLibreta.quedaLugar()) {
					
				
							System.out.println("****Ingrese nombre que desea agregar****");
							String nom=Leer.next();
								if (miLibreta.existeContacto(nom)) {
									System.out.println("****El nombre ya existe****");
			
								}else	{			
									System.out.println("****Ingrese el número de la posición que desea agregrar****");
									int lugar= Leer.nextInt();
									if (miLibreta.controlDePosicion(lugar-1)) {
									miLibreta.agregarAlibreta(nom, lugar-1);
									miLibreta.listarLibreta();
									}else {
										System.out.println("****Solo puede agregrar hasta el orden 10, Intente Nuevamente****");
									}
								}
									
					
					}else {
					System.out.println("****No hay Lugar en la lista, primero borre un nombre e intente nuevamente****");
				}}
			
			
				if (opcion==2) {
					
						System.out.println("****Ingrese nombre a eliminar****");
						String nom =Leer.next();
					if (miLibreta.existeContacto(nom)) {
						miLibreta.borrarNombre(nom);
						miLibreta.listarLibreta();
						
				}
			}
		
				if (opcion==3) {
					
						System.out.println("****Ingrese la posición a eliminar****");
						int lugar =Leer.nextInt();
						if (lugar<11) {
							miLibreta.borrarPosicion(lugar-1);
							miLibreta.listarLibreta();
						}
							
							
					}
		
			if (opcion==4) {
				
						miLibreta.listarLibreta();
					
					
			}
			
			} while(opcion!=0);
			System.out.println("****NOS VEMOS****");
			Leer.close();
	}
	}


