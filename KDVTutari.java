import java.util.Scanner;
public class KDVTutari {
	public static void main(String[] args) {
		
		double tutar,kdvOran,kdvTutar,kdvliTutar;
		boolean kdvDegiskeni;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ücret tutarını giriniz: ");
		tutar=input.nextDouble();
		
		kdvDegiskeni=(0<tutar) &&(1000>tutar);
        kdvOran=kdvDegiskeni ? 0.18 : 0.08;
		
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		
		System.out.println("KDV'siz Tutar: "+ tutar);
		System.out.println("KDV'li Tutar " + kdvliTutar);
		System.out.println("KDV Oranı: " + kdvOran);
		System.out.println("Kdv Tutarı: " + kdvTutar);
		
		
	}
	
}
