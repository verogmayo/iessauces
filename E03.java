
/*3. Realiza el pseudocódigo y la codificación en lenguaje de programación
Java de un algoritmo que solicite por teclado dos números y si son iguales
muestre por pantalla el mensaje: Los números introducidos son iguales*/



import java.util.Scanner;
 public class E03{
 
 public static void main(String[] args){
	 Scanner teclado=new Scanner(System.in);
	 
		int ent1;
		int ent2; 
		
	System.out.println("Introduce el numero 1 : ");
	ent1=teclado.nextInt();
	System.out.println("Introduce el numero 2 : ");
	ent2=teclado.nextInt();
	
	if (ent1==ent2) { /*La igualdad es == en java*/
		System.out.println("Los numeros introducidos son iguales");
		
 }
 }
 }