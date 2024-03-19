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

System.out.println("digite o valor do mes 1: ");
int m1 = teclado.nextInt();

System.out.println("digite o valor do mes 2: ");
int m2 = teclado.nextInt();

System.out.println("digite o valor do mes 3: ");
int m3 = teclado.nextInt();

	
	System.out.println("digite o estoque atual: ");
	int ea = teclado.nextInt();
	
	System.out.println("digite o lote de reposição: ");
	int lr = teclado.nextInt();
	
	System.out.println("digite o tempo de reposição: ");
	int tr =  teclado.nextInt();


double vmd;	
double emin;	
double emax;	
	
vmd= ((m1 + m2+ m3)/3)/25;

emin= (tr * vmd);

emax= (lr + emin);
	
	System.out.println("vmd: "+vmd);
	System.out.println("emin: "+emin);
	System.out.println("emax: "+emax);
	

	
	teclado.close();    
	}
}
