package examples;

public class Tost {
	int sayi;
	String malzeme;

	public Tost() {
		this(5);
		// this(5,"sucuklu"); // Hata! iki this kullanılamaz.
		System.out.println("parametresiz yapilandirici");
	}

	public Tost(int sayi) {
		this(sayi, "sucuklu"); // Başka bir yapılandırıcı çağırılacaksa,
								// yapılandırıcı yordamın ilk satırında
								// çağırılmalı
		this.sayi = sayi;
		System.out.println("Tost ( int sayi )");
	}

	public Tost(int sayi, String malzeme) {
		this.sayi = sayi;
		this.malzeme = malzeme;
		System.out.println("Tost ( int sayi, String malzeme)");
	}

	public void siparisGoster() {
		// this(5,"Kasarli"); // Hata! sadece yapılandırıcılarda kullanılır.
		System.out.println("Tost sayisi = " + sayi + ", malzeme = " + malzeme);
	}

	public static void main(String[] args) {

		Tost t = new Tost();
		t.siparisGoster();

	}

}

/*
 * Bir yapılandırıcı this ifadesi ile diğer bir yapılandırıcıyı çağırırken dikkat edilmesi gereken kurallar aşağıdaki gibidir:
 * Yapılandırıcılar içerisinde this ifadesi ile herzaman başka bir yapılandırıcı çağrılabilir.
 * Yapılanırıcı içerisinden, diğer yapıladnırıcıyı çağırırken this ifadesi her zaman ilk satırda yazılmalıdır.
 * Yapılandırıcılar içerisinde birden fazla this ifadesi ile başka yapılandırıcı çağrılamaz.
 * 
 * Çıktı :
Tost ( int sayi, String malzeme)
Tost ( int sayi )
parametresiz yapilandirici
Tost sayisi = 5, malzeme = sucuklu
 * 
 */