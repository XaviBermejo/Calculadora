/**
 * @author Xavi Bermejo Borrella
 * @since 02/02/2025
 * @version 0.3
 * */
import java.util.Scanner; 
public class Calculadora {
	private int Num1,Num2; // valors d'entrada
	private int resultat; // valors de sortida
	// Constructor 
	public Calculadora(int valor1,int valor2){
		this.setNum1(valor1);
		this.setNum2(valor2);
	}
	// getters i setters
	public int getNum1(){
		return this.Num1;
	}
	public int setNum1(int Num1){
		return this.Num1 = Num1;
	}
	public int getNum2(){
		return this.Num2;
	}
	public int setNum2(int Num2){
		return this.Num2 = Num2;
	}
	public int getResultat(){
		return this.resultat;
	}
	public int setResultat(int resultat){
		return this.resultat= resultat;
	}
	// Metodes
	public int Suma(){
		this.resultat = 0;
		this.setResultat(this.getNum1()+this.getNum2());
		return this.getResultat();
	}
	public int Resta(){
		this.resultat = 0;
		this.setResultat(this.getNum1()-this.getNum2());
		return this.getResultat();
	}
	public int Multiplicacion(){
		this.resultat = 0;
		this.setResultat(this.getNum1()*this.getNum2());
		return this.getResultat();
	}
	public static void main (String[] args) {
		System.out.println("=== CALCULADORA ===");
		Scanner sc = new Scanner(System.in);
		int N1,N2;
		System.out.print("N1 = ");
		N1 = sc.nextInt();
		System.out.print("N2 = ");
		N2 = sc.nextInt();
		
		Calculadora calc = new Calculadora(N1,N2);
		System.out.println("La suma entre "+ N1+" y "+N2+" = "+calc.Suma());
		System.out.println("La resta entre "+ N1+" y "+N2+" = "+calc.Resta());
		System.out.println("La Multiplicació entre "+ N1+" y "+N2+" = "+calc.Multiplicacion());

	}
}
