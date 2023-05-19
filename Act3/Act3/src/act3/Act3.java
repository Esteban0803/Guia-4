//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
//por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
//La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
//este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package act3;
import java.util.Scanner;

public class Act3 {
public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       double euros;
       String moneda; 
       int opcion;
       moneda = "";
        System.out.println("Ingrese cantidad de euros:");
        euros = leer.nextDouble();
        System.out.println("A qué desea convertirlo:"
                + "\n1)Dolares"
                + "\n2)Yenes"
                + "\n3)Libras");
        opcion = leer.nextInt();
        switch(opcion)
        {
            case 1:
                moneda = "Dolares";  
            break;
            case 2:
                moneda = "Yenes";
            break;
            case 3:
                moneda = "Libras";
                break;
            default:
                System.out.println("Opcion invalida");
        }
        convertirMoneda(euros,moneda);
    }
    public static void convertirMoneda (double euros, String moneda)
    {
        double cambioMoneda;
        cambioMoneda= 0;
        switch (moneda)
        {
            case "Dolares":
                cambioMoneda= euros * 1.28611;
                System.out.println("Se cambio de Euros a Dolares:" + cambioMoneda);
                break;
            case "Yenes":
                cambioMoneda= euros * 129.852;
                System.out.println("Se cambio de Euros a Yenes:" + cambioMoneda);                
                break;
            case "Libras":
                cambioMoneda= euros * 0.86;
                System.out.println("Se cambio de Euros a Libras:" + cambioMoneda);                
                break;                              
        }
        return;
    }
}