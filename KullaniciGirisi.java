import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		
		String userName,password,newPassword;
		int cevap;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınızı giriniz: ");
		userName = input.nextLine();
		System.out.print("Şifrenizi giriniz: ");
		password = input.nextLine();
		
		if(userName.equals("patika")&& password.equals("java123")){
			System.out.println("Başarılı giriş yaptınız.");
			
		}
		else {
			System.out.println("Bilgileriniz hatalı!\nŞifrenizi değiştirmek ister misiniz?");
			System.out.println("Değiştirmek istiyorsanız 1'e istemiyorsanız 2'ye basınız.");
			
			cevap = input.nextInt();
			switch(cevap) {
			case 1:
				System.out.print("Yeni şifrenizi giriniz: ");
				Scanner inp = new Scanner(System.in);
				newPassword = inp.nextLine();
				if(newPassword.equals("java123")) {
					System.out.println("Şifre oluşturulamadı!Lütfen eski şifrenizden farklı bir şifre ile tekrar deneyin. ");
					
				}
				else {
					System.out.println("Yeni şifreniz başarılı bir şekilde oluşturuldu.");
					password = newPassword;
					
				}
				break;
			case 2:
				System.out.print("Tekrar giriş yapmayı denemek için sayfayı yenileyebilirsiz");
				break;
				   
				
			
			}
			
		}

		
	}

}
