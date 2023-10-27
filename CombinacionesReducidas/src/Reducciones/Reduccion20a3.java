package Reducciones;

import java.util.Scanner;

public class Reduccion20a3 {

	public static void main(String[] args) {
		int [] numeros =new int [20];
		ingresarNumeros(numeros);
		generarCombinaciones(numeros);
	}
	private static void ingresarNumeros(int [] numerosElegidos) {
		Scanner sc = new Scanner (System.in);  
		int numero=0;  
		for (int i=0; i<numerosElegidos.length; i++) {
			System.out.println("introduce el " + (i+1) + " numero") ;
			numerosElegidos [i] = sc.nextInt(); 
		}
	}
	private static void generarCombinaciones(int[] numerosElegidos) {
        int[][] combinaciones = {
            {0, 1, 3, 5, 9, 18},
            {0, 1, 9, 11, 15, 18},
            {0, 3, 5, 9, 11, 15},
            {1, 3, 5, 11, 15, 18},
            {2, 4, 6, 12, 14, 19},
            {2, 4, 7, 8, 10, 16},
            {2, 4, 12, 13, 14, 17},
            {6, 7, 10, 13, 17, 19},
            {6, 8, 13, 16, 17, 19},
            {7, 8, 10, 12, 14, 16}
        };

        for (int i = 0; i < combinaciones.length; i++) {
            System.out.print("Combinación " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(numerosElegidos[combinaciones[i][j]] + " ");
            }
            System.out.println();
        }
    }

 
	/*private static void combinacionElegida(int [] numerosElegidos) {
		
		int [] combinacion1= {numerosElegidos[0],numerosElegidos[1],numerosElegidos[3],numerosElegidos[5],numerosElegidos[9],numerosElegidos[18]} ;
		int [] combinacion2= {numerosElegidos[0],numerosElegidos[1],numerosElegidos[9],numerosElegidos[11],numerosElegidos[15],numerosElegidos[18]} ;
		int [] combinacion3= {numerosElegidos[0],numerosElegidos[3],numerosElegidos[5],numerosElegidos[9],numerosElegidos[11],numerosElegidos[15]} ;
		int [] combinacion4= {numerosElegidos[1],numerosElegidos[3],numerosElegidos[5],numerosElegidos[11],numerosElegidos[15],numerosElegidos[18]} ;
		int [] combinacion5= {numerosElegidos[2],numerosElegidos[4],numerosElegidos[6],numerosElegidos[12],numerosElegidos[14],numerosElegidos[19]} ;
		int [] combinacion6= {numerosElegidos[2],numerosElegidos[4],numerosElegidos[7],numerosElegidos[8],numerosElegidos[10],numerosElegidos[16]} ;
		int [] combinacion7= {numerosElegidos[2],numerosElegidos[4],numerosElegidos[12],numerosElegidos[13],numerosElegidos[14],numerosElegidos[17]} ;
		int [] combinacion8= {numerosElegidos[6],numerosElegidos[7],numerosElegidos[10],numerosElegidos[13],numerosElegidos[17],numerosElegidos[19]} ;
		int [] combinacion9= {numerosElegidos[6],numerosElegidos[8],numerosElegidos[13],numerosElegidos[16],numerosElegidos[17],numerosElegidos[19]} ;
		int [] combinacion10= {numerosElegidos[7],numerosElegidos[8],numerosElegidos[10],numerosElegidos[12],numerosElegidos[14],numerosElegidos[16]} ;
		for(int i=0; i<6;i++) {
		System.out.println(combinacion1[i] + " ");
		}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion2[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion3[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion4[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion5[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion6[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion7[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion8[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion9[i] + " ");
			}
		for(int i=0; i<6;i++) {
			System.out.print(combinacion10[i] + " ");
		}
}*/
}
