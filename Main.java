/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println(" 1 - saldo na conta\n 2 - usuario cadastrado \n 3 - transferir para o atendente");
    int num = teclado.nextInt();

if (num == 1)
{
    System.out.println("seu saldo é de 6000");
}
if (num == 2)
{
    System.out.println("usuario é yenit");
}
if(num == 3)
{
    System.out.println("transferir  para atendente");
}

	
	

	
	
	
	//System.out.println("\n soma: "+soma);
	//System.out.println("\n sub: "+sub);
	//System.out.println("\n mult: "+mult);
	//System.out.println("\n div: "+ div);
	
	teclado.close();    
	}
}
