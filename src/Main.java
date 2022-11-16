import java.util.Scanner;  //projemize kullanıcıdan veri alabilmek için scanner  kütüphanesini dahil ediyoruz.
public class Main {
    public static void main(String[] args) {

     Scanner girdi=new Scanner(System.in);

     double kenar1,kenar2,kenar3;
        System.out.print("Üçgenin birinci kenarını giriniz:");
        kenar1=girdi.nextInt();
        System.out.print("Üçgenin ikinci kenarını giriniz:");
        kenar2=girdi.nextInt();
        System.out.print("Üçgenin üçüncü kenarını giriniz:");
        kenar3=girdi.nextInt();

        double u,cevre,alan;
        u=(kenar1+kenar2+kenar3)/2;

        alan=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.print("Üçgenin alanı:"+Math.sqrt(alan));
    }
}