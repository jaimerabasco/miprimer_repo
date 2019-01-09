/**
* Esta clase muestra c�mo realizar bucles
* @author Lourdes Magar�n
* @version 1.0
*/
public class ALaDeUna {
	/**
	* Aqu� est� el m�todo main que muestra A la de 1... A la de 2... A la de 3....
	*/
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println("\nCon while");
		while (i<4) 			//igual que i<=3
			System.out.println("A la de " + i++ + "...");
			
		System.out.println("\nCon do..while");
		i = 1;
		do 
			System.out.println("A la de " + i++ + "...");
			while(i<4); 		//igual que i<=3
			
		System.out.println("\nCon for");
		for (i = 1; i<4; ++i)	//igual que i<=3
			System.out.println("A la de " + i + "...");
	}

}
