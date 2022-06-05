import java.util.Scanner;
public class SinifiGecmeDurumu {

	public static void main(String[] args) {
		double mat,fizik,turkce,kimya,muzik;
		double toplam = 0;
		int ders = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = input.nextDouble();
		if (mat <0 || mat>100 )
        {
            System.out.println("Matematik notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+mat;
            ders +=1;
        }
		
		System.out.print("Fizik notunuz: ");
		fizik = input.nextDouble();
		if (fizik <0 || fizik>100 )
        {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+fizik;
            ders +=1;
        }
		
		System.out.print("Türkçe notunuz: ");
		turkce = input.nextDouble();
		if (turkce <0 || turkce>100 )
        {
            System.out.println("Türkçe notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+turkce;
            ders +=1;
        }
		
		System.out.print("Kimya notunuz: ");
		kimya = input.nextDouble();
		if (kimya <0 || kimya>100 )
        {
            System.out.println("Kimya notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+kimya;
            ders +=1;
        }
		
		System.out.print("Müzik notunuz: ");
		muzik = input.nextDouble();
		if (muzik <0 || muzik>100 )
        {
            System.out.println("Müzik notunuz 0 ile 100 arasında olmadığı için ilave edilmemiştir.");
        }
        else
        {
            toplam = toplam+muzik;
            ders +=1;
        }
		if (ders<1)
        {
            System.out.println("En az 1 ders ortalamasını doğru şekilde girmelisiniz.");
        }
        else
        {
		
		double ortalama = toplam/ders;
		if(ortalama<55) {
			System.out.println("Sınıfta kaldınız!Ortalamanız: "+ortalama);
		
		}
		else {
			System.out.println("Tebrikler,sınıfı geçtiniz!Ortalamanız: "+ortalama);
			
		}
		

	}

}
}
