
package spp.cbarraganc.p02.p1;
import java.util.Scanner;
/**
 *
 * @author
 * José Eduardo De Llano Barragán   A01410712   IC
 * Alberto Barnetche Suarez         A01411570   ISS
 * Carlos Barragán Carrión          A01410357   IMT
 * Carlos Miguel De León García     A01410399   IMA
 * 
 */
public class SPPCBarraganCP02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        System.out.println("Bienvenido ingese la opcion deseada");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Multiplicacion");
            Scanner kb= new Scanner(System.in);
            op = kb.nextInt();
            
            switch(op){
                case 1:
                int sumaArreglos1[][];
                int numeroFilas;
                int numeroColumnas;
                int datoCasilla1;
                int sumaArreglos2[][];
                int datoCasilla2;
                int sumaTotal;
                
                System.out.println("Ingrese el numero de filas que tendrán los arreglos");
                numeroFilas = kb.nextInt();
                System.out.println("Ingrese en numero de columnas que tendrán sus arreglos:");
                numeroColumnas = kb.nextInt(); 
                
                sumaArreglos1 = new int [numeroFilas][numeroColumnas];
                for(int i = 0; i < sumaArreglos1.length; i++){
                for(int j = 0; j < sumaArreglos1[i].length; j++){
                System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                datoCasilla1 = kb.nextInt(); 
                sumaArreglos1[i][j] = datoCasilla1; 
                    }
                }
                sumaArreglos2 = new int [numeroFilas][numeroColumnas];
                for(int i = 0; i < sumaArreglos2.length; i++){
                for(int j = 0; j < sumaArreglos1[i].length; j++){
                System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                datoCasilla2 = kb.nextInt(); 
                sumaArreglos2[i][j] = datoCasilla2; 
                        
                        
                    }
                }
                for(int i = 0; i < sumaArreglos1.length; i++){
                for(int j = 0; j < sumaArreglos1[i].length; j++){
                sumaTotal = sumaArreglos1[i][j] + sumaArreglos2[i][j];
                System.out.println("La suma de los numeros: " + sumaArreglos1[i][j]  + " y " + sumaArreglos2[i][j] + " es:" + sumaTotal);
                    }
                 }
                break; 
                
                case 2:
                int restaArreglos1[][];
                int numeroFilas2;
                int numeroColumnas2;
                int datoCasilla1Resta;
                int restaArreglos2[][];
                int datoCasilla2Resta;
                int restaTotal;
                
                System.out.println("Ingrese el numero de filas que tendrán los arreglos");
                numeroFilas2 = kb.nextInt();
                System.out.println("Ingrese en numero de columnas que tendrán sus arreglos:");
                numeroColumnas2 = kb.nextInt(); 
                restaArreglos1 = new int [numeroFilas2][numeroColumnas2];
                for(int i = 0; i < restaArreglos1.length; i++){
                for(int j = 0; j < restaArreglos1[i].length; j++){
                System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                datoCasilla1Resta = kb.nextInt(); 
                restaArreglos1[i][j] = datoCasilla1Resta; 
                    }
                }
                restaArreglos2 = new int [numeroFilas2][numeroColumnas2];
                for(int i = 0; i < restaArreglos2.length; i++){
                for(int j = 0; j < restaArreglos1[i].length; j++){
                System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                datoCasilla2Resta = kb.nextInt(); 
                restaArreglos2[i][j] = datoCasilla2Resta; 
                        
                        
                    }
                }
                for(int i = 0; i < restaArreglos1.length; i++){
                for(int j = 0; j < restaArreglos1[i].length; j++){
                restaTotal = restaArreglos1[i][j] - restaArreglos2[i][j];
                System.out.println ("La resta de los numeros: " + restaArreglos1[i][j] + "y " + restaArreglos2[i][j] + " es:" + restaTotal);
                    }
                 }
            break;                
 
                case 3:
                int mArreglos1[][];
                int numeroFilas3;
                int numeroColumnas3;
                int datoCasilla1m;
                int mArreglos2[][];
                int datoCasilla2m;
                int mTotal;
                
                System.out.println("Ingrese el numero de filas que tendrán los arreglos");
                numeroFilas3 = kb.nextInt();
                System.out.println("Ingrese en numero de columnas que tendrán sus arreglos:");
                numeroColumnas3 = kb.nextInt(); 
                mArreglos1 = new int [numeroFilas3][numeroColumnas3];
                for(int i = 0; i < mArreglos1.length; i++){
                for(int j = 0; j < mArreglos1[i].length; j++){
                System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                datoCasilla1m = kb.nextInt(); 
                mArreglos1[i][j] = datoCasilla1m; 
                    }
                }
                mArreglos2 = new int [numeroFilas3][numeroColumnas3];
                for(int i = 0; i < mArreglos2.length; i++){
                for(int j = 0; j < mArreglos1[i].length; j++){
                System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                datoCasilla2m = kb.nextInt(); 
                mArreglos2[i][j] = datoCasilla2m; 
                        
                        
                    }
                }
                for(int i = 0; i < mArreglos1.length; i++){
                for(int j = 0; j < mArreglos1[i].length; j++){
                mTotal = mArreglos1[i][j] + mArreglos2[i][j];
                System.out.println("La suma de los numeros: " + mArreglos1[i][j]  + " y " + mArreglos2[i][j] + " es:" + mTotal);
                    }
                 }
                break; 
            }
    }
}