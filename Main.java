import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//degiskenleri tanimliyoruz.
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner input=new Scanner(System.in);
		
		//kullanicidan degerleri aliyoruz.
		System.out.print("Matematik notunuzu giriniz: ");
		mat=input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik=input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kimya=input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce=input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		tarih=input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		muzik=input.nextInt();
		
		//ortalamayi hesapliyoruz.
		int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc= toplam/6;
		System.out.print("Ortalamanız: ");
		System.out.println(sonuc);
		
		//Ortalama 60'den büyükse sınıfı geçtiniz değilse kaldınız.
		
		String x= (sonuc>=60)?"geçtiniz":"kaldınız";
		System.out.print("Sınıfı geçme durumunuz: "+x);
	
		
		

	}

}
