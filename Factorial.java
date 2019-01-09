/**
* Calcula el factorial de un número introducido por teclado (con los tres bucles)
* @author Lourdes 
* @version 1.0
*/
public class Factorial {
	public static void main(String[] args) {
		int i, num; 
		double factorial = 1;
		
		System.out.println("Dame un entero positivo: ");
		//El número ha de positivo
		do
			num = Teclado.LeeEntero();
		while (num<0);
		
		for (i=num; i>0;i--)
			factorial *= i;
		
		System.out.println("El factorial de "+num+" con for es " + factorial);
		
		i = num;
		factorial = 1;
		while (i>0)
			factorial *= i--;
		
		System.out.println("El factorial de "+num+" con while es " + factorial);
		
		i = num;
		factorial = 1;
		if (num!=0)
			do 
				factorial *= i--;
			while (i > 0);
		System.out.println("El factorial de "+num+" con do..while es " + factorial);
		
	}
}
