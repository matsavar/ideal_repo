package tr.edu.kou.gerekli;

public class Musteri {
	public static void main(String[] args) {
		//Kahve kh=new Kahve();	//Hata!. Default yapılandırıcısı private olduğu için instance oluşturulamaz
		//kh.kahveHazirla();		//Hata!
		//kh.siparis_sayisi=5;	//Hata!
		Kahve kh=Kahve.siparisGarson(6);
	}
}
