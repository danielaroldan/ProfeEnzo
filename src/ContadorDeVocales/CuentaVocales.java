package ContadorDeVocales;

import java.util.Scanner;

public class CuentaVocales {

	public static void main(String[] args) {
		System.out.println("Este programa cuenta las vocales de una frase ingresada por el usuario");
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = ingreso.nextLine();
        int vocal = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                vocal++;
            }
            if (frase.charAt(i) == 'A') {
                vocal++;
            }
            if (frase.charAt(i) == 'e') {
                vocal++;
            }
            if (frase.charAt(i) == 'E') {
                vocal++;
            }
            if (frase.charAt(i) == 'i') {
                vocal++;
            }
            if (frase.charAt(i) == 'I') {
                vocal++;
            }
            if (frase.charAt(i) == 'o') {
                vocal++;
            }
            if (frase.charAt(i) == 'O') {
                vocal++;
            }
            if (frase.charAt(i) == 'u') {
                vocal++;
            }
            if (frase.charAt(i) == 'U') {
                vocal++;
            }

        }
        System.out.println("La frase ingresada tiene" + " " + vocal + " " + "vocales");
    }



	}

