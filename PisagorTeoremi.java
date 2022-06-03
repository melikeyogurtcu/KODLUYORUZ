import java.util.Scanner;

public class PisagorTeoremi {
	public static void main(String[] args) {
		//Bu program üç kenarını da kullanıcıdan aldığı üçgenin alanını hesaplar.
		/*Üçgenin çevresi=2u
		 * u=(a+b+c)/2
		 * Alan*Alan=u*(u-a)*(u-b)*(u-c)
		 */
		
		
		double a,b,c,alan,u;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Birinci kenarı giriniz: ");
		a = input.nextInt();
		System.out.print("İkinci kenarı giriniz: ");
		b = input.nextInt();
		System.out.print("Üçüncü kenarı giriniz: ");
		c = input.nextInt();
		
		u = (a+b+c) / 2;
		alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.print("Alan: " + alan);
		
		
		
	
		/* //Bu program iki kenarı verilen üçgenin hipotenüsünü hesaplar.
		 * 
		 * 
		int kenar1,kenar2;
		double kenar3;
		 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Birinci kenarı giriniz: ");
		kenar1 = input.nextInt();
		System.out.print("İkinci kenarı giriniz: ");
		kenar2 = input.nextInt();

		kenar3 = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		System.out.print("Hipotenüs: "+ kenar3);
	
        */
	}
}