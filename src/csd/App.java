package csd;

public class App {


	public static void main(String[] args) {
		java.util.Scanner kb= new java.util.Scanner(System.in) ;
		System.out.print("Birinci sayiyi giriniz:");
		int val1= Integer.parseInt(kb.nextLine());
		
		System.out.print("Ikinci sayiyi giriniz:");
		int val2= Integer.parseInt(kb.nextLine());
		
		System.out.print("Ucuncu sayiyi giriniz:");
		int val3= Integer.parseInt(kb.nextLine());
		
		System.out.printf("Ortanca sayi= %d",Find.mid(val1, val2, val3));
		kb.close();
	}

}
class Find {
	public static int mid(int a, int b, int c)
	{
		if ((a < b && a < c && b < c)|| (c < b && b <a ))
			return b;
		else if ((c < a && a < b)||(b < a && a < c && b < c))
			return a;
		else 
			return c;

	}
}
