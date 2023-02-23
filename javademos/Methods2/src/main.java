
public class main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int toplam = topla2(2,4,6,8);
		System.out.println(toplam);

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	
	public static void sil() {
		System.out.println("Silindi");
		
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");	
		
	}
	
	
	public static int topla2(int...sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
	}
	
	
	
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	
}
