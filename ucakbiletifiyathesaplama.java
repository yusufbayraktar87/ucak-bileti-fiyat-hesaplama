import java.util.Scanner;

public class ucakbiletifiyathesaplama {
    public static void main(String[] args) {

        //Uçak bileti fiyat hesaplama
        /* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
         Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */

        int km, yas, yolculukTipi;
        double f1, tutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi kilometre cindinden giriniz : ");
        km = inp.nextInt();
        System.out.print("Yasinizi giriniz : ");
        yas = inp.nextInt();
        System.out.print(" 1-Tek Yon\n 2-Gidis-donus\n Yolculuk tipini giriniz : ");
        yolculukTipi = inp.nextInt();

        f1 = km * 0.10;

        if (yolculukTipi == 1 && km >0) {
            if (yas < 12) {
                tutar = f1 * 0.5 * yolculukTipi;
                System.out.println("Toplam tutariniz : " + tutar);
            } else if (yas >= 12 && yas <= 24) {
                tutar = f1 * 0.9 * yolculukTipi;
                System.out.println("Toplam tutariniz : " + tutar);
            } else if (yas > 65) {
                tutar = f1 * 0.7 * yolculukTipi;
                System.out.println("Toplam tutariniz : " + tutar);
            } else System.out.println("Toplam tutariniz : " + f1);

        } else if (yolculukTipi == 2 && km >0) {
            if (yas < 12) {
                tutar = f1 * 0.5 * yolculukTipi * 0.8;
                System.out.println("Toplam tutariniz : " + tutar);
            } else if (yas >= 12 && yas <= 24) {
                tutar = f1 * 0.9 * yolculukTipi * 0.8;
                System.out.println("Toplam tutariniz : " + tutar);
            } else if (yas > 65) {
                tutar = f1 * 0.7 * yolculukTipi * 0.8;
                System.out.println("Toplam tutariniz : " + tutar);
            } else System.out.println("Toplam tutariniz : " + f1);

        } else System.out.println("Hatali giris yaptiniz!");
    }
}