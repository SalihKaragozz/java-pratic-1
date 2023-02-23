package miniprojects.atmprojesi;
/*
   ATM
   Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
   Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
   Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
   Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
   Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
   Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
   Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,


 */

import java.util.Scanner;

public class Menü {
    public static void main(String[] args) {
    String kartNo, password;
        Scanner input = new Scanner(System.in);

        int kalanHak = 3;
        int bakiye = 5000;
        int secim;
        while (kalanHak >0){
            System.out.println("Lütfen kart numaranızı giriniz");
            kartNo = input.nextLine();
            System.out.println("lütfen passwordunuzu giriniz");
            password = input.nextLine();
            if (kartNo.equals("1234") && password.equals("123")){
                System.out.println("Merhaba  ATM Sistemine giriş yaptınız");
                System.out.println();
                do {

                    System.out.println( "1- Para yatırma\n" +
                            "2- Para Çekme \n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Para Gönderme\n" +
                            "5- Sifre Değiştirme\n" +
                            "6- Çıkış");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz ");
                    secim = input.nextInt();
                    if (secim == 1){
                        System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz : "  );
                        int para = input.nextInt();
                        bakiye += para;
                        System.out.println("işleminiz tamamlanmıştır işlem sonrası bakiyeniz :" + bakiye +"TL dir");
                        System.out.println();
                    } else if (secim == 2) {
                        System.out.println("Lütfen çekmek istediğiniz tutarı giriniz: " );
                        int para = input.nextInt();
                        if (para > bakiye){
                            System.out.println("yetersiz bakiye");
                        }else {
                            bakiye -= para;
                            System.out.println("işleminiz tamamlanmıştır işlem sonrası bakiyeniz :" + bakiye +"TL dir");
                            System.out.println();
                        }

                    } else if (secim == 3) {
                        System.out.println("Bakiyeniz : " + bakiye);
                        System.out.println();

                    } else if (secim == 4) {

                        System.out.println("Göndermek istediğiniz tutarı giriniz :");
                        int gönPara = input.nextInt();
                        bakiye -= gönPara;
                        System.out.println("işleminiz tamamlanmıştır işlem sonrası bakiyeniz :" + bakiye +"TL dir");

                    }
                }while (secim != 6);
                System.out.println("tekrar görüşmek üzere");
                break;

            }else {
                kalanHak--;
                System.out.println("Hatalı kullanıcı adı veya sifre tekrar deneyiniz");
                if (kalanHak == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                }else{
                    System.out.println("kalan hakkınız: " + kalanHak);
                }

            }


        }



    }

}
