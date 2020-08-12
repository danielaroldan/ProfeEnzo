package f2;

import java.util.Scanner;

public class F2E1 {

	public static void main(String[] args) {
		String oracion;
		Scanner Leer =new Scanner(System.in);
		String user [] =new String [4];
		System.out.println("Este programa permite al usuario ingresar 4 oraciones y luego las muestra en pantalla");
		
		for (int i  = 0; i < user.length;i ++) {
			System.out.println("ingrese una oración:");
			oracion=Leer.nextLine(); 
			user[i]=oracion;
			
			}
		for (int j = 0; j < user.length; j++) {
			System.out.println("oracion "+(j+1)+": "+ user[j]);
	
	}
	

	}}
