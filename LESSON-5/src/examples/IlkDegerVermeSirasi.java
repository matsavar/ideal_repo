package examples;

class Hayvan {
	public Hayvan() {
		System.out.println("Hayvan yapılandırıcısı");
	}
}

class Yarasa extends Hayvan {
	public Yarasa() {
		System.out.println("Yarasa yapılandırıcısı");
	}
}

class UcanYarasa extends Yarasa {
	public UcanYarasa() {
		System.out.println("UcanYarasa yapılandırıcısı");
	}
}

public class IlkDegerVermeSirasi {

	public static void main(String[] args) {

		UcanYarasa uy = new UcanYarasa();

	}

}
