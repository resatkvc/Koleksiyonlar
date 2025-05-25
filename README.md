# Kitap ve Yazar Bilgilerinin Koleksiyonla Saklanması

Bu projede, bir kütüphanedeki kitaplar ile yazar bilgilerini saklamak amacıyla Java'da uygun koleksiyon yapısı seçilmiştir.

## 📌 Kullanılan Yöntem

Kitap-yazar ilişkisini saklamak için `HashMap` veri yapısı tercih edilmiştir.  
Her kitap adı, yazarıyla bire bir eşleşecek şekilde **anahtar-değer (key-value)** formatında tutulur.

## 🧠 Tercih Sebebi

- Kitap adına göre hızlı erişim sağlanabilir.
- Yalnızca tek bir yazara ait kitapların yönetimi kolaylaştırılmış olur.
- Java'nın yerleşik `Map` arayüzünü kullanan `HashMap` yapısı, esneklik ve performans açısından uygun görülmüştür.

## 🛠️ Kullanılan Metotlar

- `put()` → Kitap-yazar çifti eklemek için.
- `entrySet()` → Tüm kitap ve yazar bilgilerini dolaşmak için.
- `get()` → Belirli bir kitap adına karşılık gelen yazarı getirmek için (isteğe bağlı kullanım).

Bu yapı sayesinde, kütüphane sistemlerinde kitap-yazar verileri okunabilir, yönetilebilir ve genişletilebilir bir şekilde organize edilir.
