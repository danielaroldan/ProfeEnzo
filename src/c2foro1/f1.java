package c2foro1;

import java.util.Scanner;

public class f1 {

	public static void main(String[] args) {
Scanner IngDatos = new Scanner (System.in);
	
		
		int Datos []=new int[5];
		int Control []=new int[5];
			
			for (int i=0; i< 5; i++) {
				System.out.println("Ingrese un valor numérico entero: ");
				int Num=IngDatos.nextInt();
				for (int j = 0; j < Control.length; j++) {
					Control[j]= Num;
				}
				
				for (int k= 0; k < Datos.length; k++) {
				
					
					if (Num %7!= 0) {
						Datos[i]= Num;
					}
				}
			}
	
		
	for (int i = 0; i < 5; i++) {
		System.out.println("Posición: "+i+" "+"Numero: "+ Datos[i]);
		}
	
	IngDatos.close();
	}
			
	}
	
		    
