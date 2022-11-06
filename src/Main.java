import java.util.*;

public class Main
{


    public static void main(String[] args)
    {


        //Strinbuilder javada bir classdır.String oluşturmaya yarar
        //String class varken niçin strin buiderar ihtiyac duyarız
        //string ınmutable classdır.ama biz bazen mutable strinlere
        //ihtiyac duyarız. stringbuılder bize mutable string verir.
        //ımmutable classlarda var olan deger değiştirilemez.siz varolan degeri değiştirmek istediğinizde
        //yeni bir variable  yeni degerle oluşturulur eski variablin pointera döndürülür
        //Eger bir variableı hicbnir pointer göstermiyorsa garbage collector tarafından silinir.
        //mutable classlarda var olan deger değiştirilebilir

       /* String str="java";

        str="Super java";//yeni adresi superjava olur.heap te digeri yani java tutulur.ama stackte tutulan adres oraya yönlendirir
        System.out.println(str);
        StringBuilder strb=new StringBuilder("Java");//1.yol
        strb=new StringBuilder("super java");//strinbuilder da var olan string direk değiştirilir heapten değistirir

        StringBuilder strb3=new StringBuilder(); //2. yol
        strb3.append("java");
        strb3.append(" is easy");
        strb3.append(" learn").append(" java earn money");
        System.out.println(strb3);
        StringBuilder strb4=new StringBuilder();
        strb3.append("cat");
        int sayi=strb3.length();
        int kapazite =strb3.capacity();//16 yazar 1 kapazite 16 dır.18 karakterliyse var olamnın 2 katının 2 fazlası gelir 34 yazar

        strb3.setCharAt(2,'r');//index 2 yi r ye değigtir
        System.out.println(strb3);

        strb3.delete(7,12);//7 den baslar 12 ye kadar sil
        System.out.println(strb3);
        strb3.reverse();//ters
        System.out.println(strb3);

        String abc="java";
        abc.replace("a","i");//atama pılmadığından strıng buılder gibi deildir.bu durum immutabledir
        System.out.println(abc);

        strb3.insert(3,"xxx");
        System.out.println(strb3);*/



    }
}
