import java.util.*;

public class HolaMundo {

	public static void main (String [] args) {
	
	System.out.println ("Introduce tu nombre") ;
	
	Scanner teclado = new Scanner(System.in);

	String nombreUsuario = teclado.next();

	System.out.println("Hola Mundo " + nombreUsuario) ;
	}
}

