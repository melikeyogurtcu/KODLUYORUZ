import java.util.Scanner;;
public class Ciftve4unkatlari {
	/*Bu program  tek bir sayı girilene kadar kullanıcıdan girişleri kabul eder 
	 * ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp 
	 * ekrana basar.
	 * */

	public static void main(String[] args) {
		
		int x;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Sayı giriniz: ");
			x = input.nextInt();
			if(x%2==0 && x%4==0 ) {
				total +=x;
			}
			
			
			
			
		}while(x>0);
		System.out.println("Toplam: "+total);
		input.close();

	}

}
