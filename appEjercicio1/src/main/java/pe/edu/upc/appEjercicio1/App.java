package pe.edu.upc.appEjercicio1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in); /*creando un objeto*/
    	
    	int numero;
    	
    	//wrapper (clases envolventes) -> Casting
    	Double valores = new Double(13);
    	
    	String[] arrNombres = new String[3];
    	
        System.out.println( "Hello World!" );
        
        for (int i = 0; i < arrNombres.length; i++) 
        {
        	System.out.println( "Nombre"+(i+1));
        	arrNombres[i] = s.nextLine();
		}
    }
}
