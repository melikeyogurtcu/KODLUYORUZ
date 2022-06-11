import java.util.Scanner;
public class BolumAlgoritmasi {

	public static void main(String[] args) {
		int k;
		int toplam=0;
		int adet=0;
		double sonuc;
		Scanner giris = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		k = giris.nextInt();
		
		for(int i=0;i<=k;i++) {
			if(i%3==0&&i%4==0) {
				toplam+=i;
				adet++;
				
			}
		}
			sonuc = toplam/(adet-1);
			System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması  :"+sonuc);
			giris.close();
		}
		
		
		

	}


