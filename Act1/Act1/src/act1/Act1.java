//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
//La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main
package act1;

import java.util.Scanner;

public class Act1 {
public static void main(String[] args) {        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
       int num1;
       int num2;
       int opcion;
       double resultado;
       resultado= 0;
       
        System.out.println("Ingrese dos numeros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        System.out.println("1)Sumar"
                + "\n2)Restar"
                + "\n3)Multiplicar"
                + "\n4)Dividir");
        opcion= leer.nextInt();
        switch (opcion)
        {
            case 1:
               resultado = sumar(num1,num2); 
                break;
            case 2:
               resultado = restar(num1,num2);                 
                break;
            case 3:
               resultado = multiplicar(num1,num2);                 
                break;
            case 4:
               resultado = dividir(num1,num2);                 
                break;
            default:
                System.out.println("Opcion invalida");
        }
        System.out.println("El resultado es:"+ resultado );
    }
    public static int sumar(int numA,int numB)
    {
       int suma;
       suma = numA+numB;
       return suma; 
    }
    public static int restar(int numA,int numB)
    {
       int resta;
       resta = numA-numB;
       return resta; 
    }
    public static int multiplicar(int numA,int numB)
    {
       int suma;
       suma = numA*numB;
       return suma; 
    }
    public static double dividir(int numA,int numB)
    {
       double dividir;
       dividir = 0;
       if (numB!=0)
       {
            dividir = (double)numA/numB;    
       }
       else
       {
           System.out.println("El segundo numero es un 0");      
       }
       return dividir; 
    }    
}
