package FilmTahmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Depo {
     /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
    static Scanner scan=new Scanner(System.in);
    static List<String> film=new ArrayList<>(List.of("JOKER","INTERSTALLER"
            ,"AVATAR","HABABAM SINIFI","SONIC","TITANIC","INCEPTION","ZELIHA","AYLA","SAKAR SAKIR"));

    public static final String White = "\u001B[37m";
    public static final String Red = "\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Yellow = "\u001B[33m";
    public static final String Blue = "\u001B[34m";

}
