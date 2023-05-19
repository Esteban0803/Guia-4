//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
//de las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package act2;
import java.util.Scanner;

public class Act2 {
public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String nombre;
       String opcion;
       int edad;     
       do
       {
        System.out.println("Ingrese Nombre:");
        nombre = leer.next();
        System.out.println("Ingrese edad:");
        edad = leer.nextInt();
        imprimirDatos(nombre,edad);
                       
        System.out.println("Desea ingresar otra persona?:S|N");
        opcion = leer.next(); 
       
        while (!opcion.equalsIgnoreCase("S")&&!opcion.equalsIgnoreCase("N"))
        {
            System.out.println("Opcion invalida.Desea ingresar otra persona?:S|N");
            opcion = leer.next();                
        }
        if (opcion.equalsIgnoreCase("N"))
        {
            break;
        }
       }while(!opcion.equalsIgnoreCase("S"));
    }
public static void imprimirDatos(String nombre,int edad)
    {
        System.out.println("El nombre ingresado es:" + nombre
        +"\nLa edad ingresada es:"+edad);       
        if (edad<18)
        {
            System.out.println("Persona menor de edad");
        }
        else
        {
            System.out.println("Persona mayor de edad");
        }
        return;
    }
}