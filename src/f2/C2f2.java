package f2;

import java.util.Scanner;

public class C2f2 {

	public static void main(String[] args) {
		/*EJERCICIO 2*/
				int clave;
				 String usuarioIngre;
				 int claveIngre;
				 int nuevaClave;



				 Scanner Leer = new Scanner(System.in);
					/*(Programación estructurada)

			Escribir un programa que tenga dos vectores. 
			Uno de ellos tiene por nombre "user" y tiene almacenados
			 los valores "Daiana" , "Facundo", "Osvaldo" y "Melina".
			 
			  El otro vector se llama "pass" y tiene almacenados los
			   valores: 1234, 4321, 1122 y 3344. Debido a que son vectores
			    relacionados por el índice, el programa debe:*/

			String user [] =new String [4];
			user[0]="Daiana";
			user[1]="Facundo";
			user[2]="Osvaldo";
			user[3]="Melina";

			int pass []= new int [4];
			pass[0]=1234;
			pass[1]=4321;
			pass[2]=1122;
			pass[3]=3344;



			System.out.println("Ingrese su Usuario: ");
			usuarioIngre = Leer.next();
			System.out.println("Ingrese Password: ");
			claveIngre = Leer.nextInt();
			


			/*b)Comprobar usuario y contraseña.*/
			int i;
			boolean ban = false;

			for (i=0; i<user.length; i++) {
				if (usuarioIngre.equals(user[i])&&claveIngre==pass [i]) { 
					ban=true;
				}}
			if (ban == true) {
					/*c)Dar la bienvenida al usuario cuando el login sea exitoso.*/
					System.out.println("Usuario y contraseña son: ***C O R R E C T O S***");
					
					System.out.println(" ***BIENVENIDO***// Login ***C O R R E C T O***");
					System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
					System.out.println("<<<<Receuerde que por seguridad debe cambiar su contraseña>>>>");
					System.out.println("Si desea cambiar su contraseña precione 1, en caso contrario 0");
					int eleccion= Leer.nextInt();
						if (eleccion==1) {
							System.out.println("Ingrese su nueva clave");
							nuevaClave =Leer.nextInt();
							System.out.println("Vuelva ingresar la nueva clave");
							int nuevaClave1 = Leer.nextInt();
								if (nuevaClave==nuevaClave1) {
									System.out.println("Su clave se cambio correctamente");
										for (i=0; i<user.length; i++) {
											if (usuarioIngre.equals(user[i])) {
											
												pass[i]=nuevaClave;
												System.out.println("Su nueva contraseña es: "+pass[i]);
										}}
								}else {
									System.out.println("no coinciden la nueva clave con su confirmacion");
									System.out.println("Vuelva a intentar");
								}
							
						}else {
							System.out.println("Se aconseja que en su proxima visita cambie su clave poe seguridad. Gracias");
						}
					
					
					
				}else {
					System.out.println("Usuario y/o contraseña ***I N C O R R E C T O***");
					System.out.println("Vuelva a intentar");

				}

			
				
			}

		

	}

