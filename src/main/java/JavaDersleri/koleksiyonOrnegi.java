package JavaDersleri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class koleksiyonOrnegi {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturma
        Scanner scanner = new Scanner(System.in);
        // HashMap oluşturma
        HashMap<String, String> kutuphane = new HashMap<>();

        // Örnek kitapları ekleme
        kutuphane.put("Tutunamayanlar", "Oğuz Atay");
        kutuphane.put("Kürk Mantolu Madonna", "Sabahattin Ali");
        kutuphane.put("İnce Memed", "Yaşar Kemal");

        // Menü gösterimi
        System.out.println("1. Kitap Ekle");
        System.out.println("2. Kitap Ara");
        System.out.println("3. Kitapları Listele");
        System.out.println("4. Çıkış");
        System.out.print("Seçiminiz: ");

        int secim = scanner.nextInt();
        scanner.nextLine(); // Buffer temizleme

        switch (secim) {
            case 1:
                // Yeni kitap ekleme
                System.out.print("Kitap adı: ");
                String kitapAdi = scanner.nextLine();

                System.out.print("Yazar adı: ");
                String yazar = scanner.nextLine();

                // HashMap'e yeni kitabı ekliyoruz
                kutuphane.put(kitapAdi, yazar);
                System.out.println("Kitap eklendi!");
                scanner.close();
                return;

            case 2:
                // Kitap arama
                System.out.print("Aranacak Kitap Adı: ");
                String arananKitap = scanner.nextLine();

                if (kutuphane.containsKey(arananKitap)) {
                    System.out.println("Yazar: " + kutuphane.get(arananKitap));
                } else {
                    System.out.println("Kitap Bulunamadı!");
                }
                scanner.close();
                return;

            case 3:
                // Kitapları listeleme
                System.out.println("\nKütüphanedeki Kitaplar:");
                for (Map.Entry<String, String> kitap : kutuphane.entrySet()) {
                    System.out.println("Kitap: " + kitap.getKey() + " - Yazar: " + kitap.getValue());
                }
                scanner.close();
                return;

            case 4:
                System.out.println("Program bitti.");
                scanner.close();
                return;

            default:
                System.out.println("Geçersiz Seçim!");
        }
    }
}