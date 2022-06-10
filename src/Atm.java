// Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int select;
        int money = 1500;

        // Bankada giriş yaparken hata sayımızı 3 girdik. Bakiyemizi ise 1500 girdik. İlk olarak haklarımız varken kullanıcıdan girişleri alıyoruz.

        while (right > 0) {
            System.out.println();
            System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
            userName = inp.nextLine();
            System.out.print("Lutfen Sifrenizi Giriniz : ");
            password = inp.nextLine();

            System.out.println();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Banka Hosgeldiniz ! ");

                // Eğer kullanıcı adı ve şifre doğruysa kullanıcının önüne menü geliyor ve istediğimiz işlemi seçiyoruz.

                do {
                    System.out.println();
                    System.out.println("1-Bakiye Sorgulama \n2-Para Yatirma \n3-Para Cekme \n4-Cikis Yap");
                    System.out.println();
                    System.out.print("Lutfen Yapmak Istediginiz Isleminin Numarasini Giriniz : ");
                    select = inp.nextInt();

                    // Eğer kullanıcı menüde bulunanlardan farklı sayı girerse diye burda uyarı veriyoruz.

                    if (select < 1 || select > 4) {
                        System.out.println();
                        System.out.print("Hatali Bir Tus Girdiniz. Lutfen Tekrar Deneyiniz ! ");
                        System.out.println();
                    } else {

                        // Seçeneklere göre işlemleri yaptırıyoruz.

                        switch (select) {

                            case 1:
                                System.out.println();
                                System.out.print("Bakiye Durumunuz : " + money);
                                System.out.println();
                                break;

                            case 2:
                                System.out.println();
                                System.out.print("Yatirilacak Para Miktarini Giriniz : ");
                                int newMoney1 = inp.nextInt();
                                System.out.println();
                                money += newMoney1;
                                System.out.print("Yeni Bakiyeniz : " + money);
                                System.out.println();
                                break;

                            case 3:
                                System.out.println();
                                System.out.print("Cekilecek Para Miktarini Giriniz : ");
                                int newMoney2 = inp.nextInt();

                                if (newMoney2 > money) {
                                    System.out.println();
                                    System.out.print("Bakiyeniz Yetersiz ! ");
                                    System.out.println();
                                } else {
                                    money -= newMoney2;
                                    System.out.println();
                                    System.out.print("Yeni Bakiyeniz : " + money);
                                    System.out.println();
                                }
                                break;
                        }
                    }
                } while (select != 4);

                System.out.println();
                System.out.println("Tekrar Gorusmek Uzere ! ");
                System.out.println();
                break;

            } else {

                // Kullanıcı adı ve şifre yanlış girilirse hakkımız azalıyor ve sıfıra düştüğünde hesabının bloke olduğunu ekrana yazdırıyoruz.

                right--;

                if (right != 0) {
                    System.out.print("Kullanici Adi veya Sifreniz Yanlis. Lutfen Tekrar Deneyiniz ! ");
                    System.out.println();
                    System.out.print("Kalan Hakkiniz : " + right);
                    System.out.println();
                } else {
                    System.out.print("Hesabiniz Bloke Olmustur. Lutfen Banka ile Iletisime Geciniz ! ");
                    System.out.println();
                }
            }
        }
    }
}