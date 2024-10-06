import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bilgileri al
        System.out.print("Personel Adı: ");
        String ad = scanner.nextLine();
        System.out.print("Personel Soyadı: ");
        String soyad = scanner.nextLine();
        System.out.print("Temel Maaş: ");
        double maas = scanner.nextDouble();
        System.out.print("Çalıştığı Gün Sayısı: ");
        int calismaGunu = scanner.nextInt();

        // Personel nesnesi oluştur
        Personel personel = new Personel(ad, soyad, maas, calismaGunu);

        // Sonuçları göster
        System.out.println(personel);

        scanner.close();
    }
}
