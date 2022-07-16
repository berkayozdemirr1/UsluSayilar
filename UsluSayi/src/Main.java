import java.util.Scanner;

/** 2^-2 = 1/4 OLDUĞU İÇİN YANİ NEGATİF KUVVETLERDE SONUÇ KESİRLİ SAYI OLDUĞU İÇİN
 KULLANICININ NEGATİF KUVVETLERİ KULLANMASINA İZİN VERMEYİP TEKRAR DENEMESİNİ İSTEDİM.
 BUNU DO-WHİLE DÖNGÜSÜ İLE YAPTIM. ÖNCELİKLE DO İLE İLK ÇALIŞACAK YAPIYI OLUŞTURDUM.
 DAHA SONRA EĞER KUVVET KISMINA NEGATİF BİR SAYI GİRİLMESİ HALİNDE UYARI VERMESİNİ VE
 KUVVETİN POZİTİF BİR DEĞER GİRİLMESİNİ İSTEDİM. POZİTİF DEĞER GİRİLENE KADAR BU DÖNGÜNÜN
 TEKRARLANMASINI SAĞLADIM. POZİTİF DEĞER GİRİLDİĞİNDE İSE WHİLE KOŞULU FALSE OLACAĞI İÇİN
 DÖNGÜ BİTECEK VE FOR DÖNGÜSÜNE GEÇECEK. FOR DÖNGÜSÜNDE İSE KURALI YAZIP EKRANA SONUÇ VERMESİNİ SAĞLADIM.

 **/

public class Main {
    public static void main(String[] args) {
        int s, k, toplam = 1;

        do {
            Scanner deger1 = new Scanner(System.in);
            System.out.print("Tabani Giriniz : ");
            s = deger1.nextInt();

            Scanner deger2 = new Scanner(System.in);
            System.out.print("Kuvveti Giriniz : ");
            k = deger2.nextInt();

            if (k<0) System.out.println("Kuvvet pozitif olacak sekilde tekrar deneyiniz.");

        } while (k < 0);

        for (int i = 1; i <= k; i++) {
            toplam = toplam * s;
        }
        System.out.print("Sonuc : " + toplam);
    }
}
