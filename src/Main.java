import java.util.*;

public class Main
{


    public static void main(String[] args)
    {


        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
      * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */

     /*   Scanner input = new Scanner(System.in);
        List<String> liste = new ArrayList<>();
        liste.add("elma");
        liste.add("armut");
        liste.add("cilek");
        liste.add("uzum");
        liste.add("kiraz");
        List<Integer> listeFiyati = new ArrayList<>();
        listeFiyati.add(10);
        listeFiyati.add(20);
        listeFiyati.add(30);
        listeFiyati.add(40);
        listeFiyati.add(50);
        List<Integer> listeKg = new ArrayList<>();
        List<String> seciliUrunListesi = new ArrayList<>();
        List<Integer> seciliUrunlerFiyatListesi = new ArrayList<>();

        musteriSecimi(liste, listeFiyati, listeKg, seciliUrunListesi, seciliUrunlerFiyatListesi);
        int toplamFiyat = kasa(listeKg, seciliUrunlerFiyatListesi);

        System.out.println("Manavdaki urunler listesi \t=\t" + liste);
        System.out.println("Manavdaki urunler Fiyat listesi \t=\t" + listeFiyati);
        System.out.println("Manavdan sectiğimiz urun listesi \t=\t" + seciliUrunListesi);
        System.out.println("Manavdan sectiğimiz urunlerin kg listesi \t=\t" + listeKg);
        System.out.println("Manavdan sectiğimiz urunlerin kg listesi \t=\t" + seciliUrunlerFiyatListesi);
        System.out.println("Aldığımız ürünlere ödediğimiz toplama para =\t" + toplamFiyat);*/


// basamak sayılarının toplamı tek sayı olana kadar sayıları toplayan kod
      /*  int sayi=9998;
        int basamakToplam=0;

        while (sayi>0){

            basamakToplam+=sayi%10;
            sayi=sayi/10;
            if (sayi==0 && basamakToplam>9)
            {
                sayi=basamakToplam;
                basamakToplam=0;
            }

        }
        System.out.println(basamakToplam);*/



      /* String ters="Ali Can mali";

       String yeniTers=ters.replaceAll("[a-z]","*");
        System.out.println(yeniTers);

       String toplam="";

        for (int i = 0; i < ters.length(); i++)
        {
            char harf=ters.charAt(i);
            if (harf>96 && harf<123)
            {
                toplam+="*";
            }else {
                toplam+=harf;
            }
        }
        System.out.println(toplam);*/


        //***top yükseklikten atılıo atıldığı yukseklikten3/4 kadar yukarı tırmanıyor
        //top bir metrenin alktına dustukten sonra aldığı yol ve yere vurma sayısı

   /*     double yükseklik=36.0;
        int yereVurma=0;
        double toplamYol=0;

        while (yükseklik>1){
            toplamYol+=yükseklik;
            yereVurma++;
            yükseklik=yükseklik*0.75;
            toplamYol+=yükseklik;
        }

        System.out.println(yereVurma+"---"+toplamYol);*/


        //1. ve 2. en buyuk sayı dizideki
     /*   int[] dizi={3,5,15,6,3,1,7,9};
        int min=dizi[0];
        int max=dizi[0];
        int secm=dizi[0];

        for (int w:dizi)
        {
            max=Math.max(max,w);
            if (w>secm && w<max)
            {
                secm=w;
            }
        }

        System.out.println(max+"--"+secm);*/


//5 sayısını listenin sonuna atma
     /*   int[] dizi={3,5,5,6,3,1,7,9};
        List<Integer> liste=new ArrayList<>();

        int[] dizi2=new int[dizi.length];
        int count=0;
        int sonIndex= dizi.length-1;

        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i]!=5)
            {
                dizi2[count++]=dizi[i];
            }else {

                dizi2[sonIndex--]=dizi[i];
            }
        }
        System.out.println(Arrays.toString(dizi2));*/



        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */



      /*  String[] arrGunler={"1. Gün Pazartesi","2. Gün Salı","3. Gün Carsamba","" +
                "4. Gün Persembe","5. Gün Cuma","6. Gün Cumartesi","7. Gün Pazar"};
        List<String> listeGunler=new ArrayList<>();
        for (String w:arrGunler)
        {
            listeGunler.add(w);
        }
        List<Double> listeGunlukKazanc=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        int gun=1;
        int counter=0;
        double kazanc=0;
        System.out.println("Lütefen 1 hafta boyunca olan gunluk kazanclarınızı giriniz");

        while (gun!=8){
            System.out.print(arrGunler[counter++]+" kazancınız = ");
            kazanc= input.nextDouble();
            listeGunlukKazanc.add(kazanc);
            gun++;
        }
        System.out.println(listeGunlukKazanc);

       double ortalama= getOrtalamaKazanc(listeGunlukKazanc);

       System.out.println(ortalama);

       getOrtalamaninUstundeKazancGünleri(listeGunler,listeGunlukKazanc,ortalama);

       getOrtalamaninAltindaKazancGünleri(listeGunler,listeGunlukKazanc,ortalama);*/


        //dizimizde tekrar etmeyenleri yazdıralım.liste kullanmadan ve liste kullnarak yapalım.
      /* int[] dizi={1,3,5,6,3,1,7,9};
       List<Integer> liste=new ArrayList<>();

        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi.length ; j++)
            {
                if (dizi[i] != dizi[j])
                {
                    if (!liste.contains(dizi[i]))
                    {
                        liste.add(dizi[i]);
                    }
                }
            }
        }
        System.out.println(liste);*/

      /*  int[] dizi={1,3,5,6,3,1,7,9};
        int[] konteynirDizi=new int[dizi.length];
        int count=0;


        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi.length ; j++)
            {
                if (isFind(konteynirDizi,dizi[j]))
                {
                    konteynirDizi[count++]=dizi[j];
                }
            }
        }
        System.out.println(Arrays.toString(konteynirDizi));*/




      /* Scanner input=new Scanner(System.in);
        String[] arrGunler={"1. Gün Pazartesi","2. Gün Salı","3. Gün Carsamba","" +
                "4. Gün Persembe","5. Gün Cuma","6. Gün Cumartesi","7. Gün Pazar"};
        List<String> gunlerListe=new ArrayList<>();

        for (String w:arrGunler)
        {
            gunlerListe.add(w);
        }

        List<Double> gunlukKazanc=new ArrayList<>();

        int gunSayisi=1;
        double kazanc=0;
        int count=0;
        System.out.println("Lütfen gunluk kazancları giriniz");

        while (gunSayisi!=8){
            System.out.print(arrGunler[count++]+" kazancın = ");
            kazanc=input.nextDouble();
            gunlukKazanc.add(kazanc);
            gunSayisi++;
        }
        System.out.println(gunlukKazanc);
        double ortalamaKzanc=Metodlar.getOrtalamaKazanc(gunlukKazanc);
        System.out.println("Bir Haftalık kazanclarının ortalaması = "+ortalamaKzanc);

      Metodlar.getOrtalamaninustundeKazanc(gunlerListe,gunlukKazanc,ortalamaKzanc);
      Metodlar.getOrtalamaninAltindaKazanc(gunlerListe,gunlukKazanc,ortalamaKzanc);*/




       /* String str="Strinbuilder4 javada* bir classdır. String oluşturmaya yarar";
        str=str.replaceAll("[^A-Za-z ]", "");
        System.out.println(str);

        String[] dizi=str.split(" ");
        for (String w:dizi)
        {
            if (w.endsWith("r"))
            {
                System.out.print(w+"");
            }
        }
        System.out.println();*/


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


//Yaş problemi
     /*   LocalDate dobTom=LocalDate.of(2011,Month.NOVEMBER,18);
        LocalDate dobAli=dobTom.minusYears(8).minusMonths(8).minusDays(13);

        LocalDate dobVeli=dobAli.plusYears(1).plusDays(15);
        System.out.println(dobAli);
        System.out.println(dobVeli);*/


        //iki kisi arasındaki gün sayısı
       /* LocalDate umit=LocalDate.of(1984,9,7);
        LocalDate cumali=LocalDate.of(1983,7,7);
        Long fark  = ChronoUnit.DAYS.between(cumali,umit);
        System.out.println(fark);*/


     /*  LocalDate currentDate=LocalDate.now();

        System.out.println(currentDate);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM/dd/yyyy");//MM/dd/yy gibi cesitli yazılıt
        String formtarih=dtf.format(currentDate);

        System.out.println(formtarih);

        LocalTime mytime =LocalTime.of(16,23,54,2345);

        DateTimeFormatter dtfff=DateTimeFormatter.ofPattern("HH:mm");//hh 24 saat sistemini "hh:mm a"4:23 AM yazdırır

        String formtime= dtfff.format(mytime);
        System.out.println(formtime);*/
//Almanya ile japanya arasındaki zaman farkı kactır.

     /*   LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime Germany=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark= ChronoUnit.HOURS.between(japan,Germany);

        System.out.println(fark);*/

        //Sabit bir tarih olustrun
       /* LocalDate mydate=LocalDate.of(2011, Month.APRIL,13);
        System.out.println(mydate);*/


//Rasgele kullabnıcı ADI OLUSTURMA KODU

   /*     Random rnd = new Random();
        Scanner scan= new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Esra");
        list.add("Sumeyra");
        list.add("Cumali");
        list.add("Ebru");
        list.add("Mehmet");

        System.out.println("Kullanici isminizi giriniz");
        String kullanici= scan.nextLine().trim();

        if(list.contains(kullanici)){
            kullanici=kullanici+ rnd.nextInt(100000);  //int sayi= (int)(Math.random()*100000)
            System.out.println("Kullanici adiniz daha once alinmistir. "+kullanici+ " bu adi kullanabilirsiniz");

        }else
            System.out.println("Kullanici adiniz basariyla olsuturulmustur."+kullanici);*/


//dolar 3,2 *4,2 ile carpılıp toplanacak kod
     /*   String[][] dizi = {{"$12", "$22", "$0"}, {"*9", "*40", "$1"}, {"*12", "$2", "$0"}};
        double toplam = 0;

        for (String[] dizi2 : dizi)
        {
            for (String str : dizi2)
            {
                if (str.contains("$"))
                {
                    str = str.replace("$", "");
                    double yenidolars = Double.parseDouble(str);
                    toplam += yenidolars * 3.2;
                }
                else if (str.contains("*"))
                {
                    str = str.replace("*", "");
                    double yeniyidiz = Double.parseDouble(str);
                    toplam += yeniyidiz * 4.2;
                }
            }
        }
        System.out.println(toplam);*/


//sekil cözum
      /*  for (int i = 1; i < 6; i++)
        {
            for (int j = 1; j < 6; j++)
            {
                if (i==1 || i==3|| i==5)
                {
                    System.out.print("A ");
                }
                else if (i==2 && j==1)
                {
                    System.out.print("T ");
                    for (int k = 2; k <5 ; k++)
                    {
                        System.out.print("Y ");

                    }
                    System.out.print("T ");
                }else if (i==4){
                    System.out.print("H ");
                }
            }
            System.out.println();*/


        //düz ucgen
       /* for (int i = 0; i < 7; i++)
        {
            for (int j = i; j < 7; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //ters ucgen
      /*  for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j < 8; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/


       /* int[] dizi = {5,7,5,11,5,3,7};
        int count=0;
        int tekrar=0;
        boolean istru=true;
        int[] yenid=new int[dizi.length];
        int[] sond=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {
            if (i!=0 && yenid[i]==i)
                continue;
            for (int j = 0; j < dizi.length; j++)
            {
                if (dizi[i]==dizi[j])
                {
                    yenid[j]=j;
                    count++;
                }
            }
            System.out.println(dizi[i]+" sayısının "+count+" tekrarı var");
            sond[tekrar++]=dizi[i];
            count=0;
        }
        System.out.println(Arrays.toString(sond));*/


        //****diziden 3 elemanı silme
    /*  int[] dizi = {5,7,51,11,10,3,1};
        int[] dizi2 = {5,3,51};
        int count=0;
        boolean istru=true;
        int[] yeniDizi=new int[dizi.length- dizi2.length];
        int[] silinecekindex=new int[dizi.length];

        for (int i = 0; i < dizi2.length; i++)
        {
            for (int j = 0; j < dizi.length; j++)
            {
                if (dizi2[i]==dizi[j])
                {
                    silinecekindex[j]=j;
                }
            }
        }
        for (int i = 0; i < dizi.length-1; i++)
        {
            if (istru)
            {
                yeniDizi[count++]=dizi[i];
                istru=false;
            }
            if (i!=silinecekindex[i])
            {
                yeniDizi[count++]=dizi[i];
            }
        }
        System.out.println(Arrays.toString(yeniDizi));*/


//listeden 3 elemanı silme
     /*   int[] dizi = {0, 7, 51, 11, 10, 3, 1};
        int[] dizi2 = {1, 3, 51};
        int count = 0;
        int[] yeniDizi = new int[dizi.length];
        int[] silinecekindex = new int[dizi.length];
        List<Integer> liste = new ArrayList<>();
        for (int sayi : dizi)
        {
            liste.add(sayi);
        }

        for (int i = 0; i < dizi2.length; i++)
        {
            if (liste.contains(dizi2[i]))
            {
                liste.remove(liste.indexOf(dizi2[i]));

            }

        }
        System.out.println(liste);*/


//strin cumlede tekrarsız bir sekilde harfin kac defa gectiği ve harf tekrasız yazdıran kod
       /* String str="arabalar";
        String toplam="";
        String konteynir="";
        int count=0;

        for (int i = 0; i < str.length(); i++)
        {
            if (toplam.contains(str.charAt(i)+""))
                         continue;
            for (int j = 0; j < str.length(); j++)
            {
                    if (str.charAt(i)==str.charAt(j))
                    {
                        toplam+=str.charAt(i);
                        count++;
                    }
            }
            System.out.println(str.charAt(i)+" harfi "+ count);
            konteynir+=str.charAt(i);
            count=0;
        }
        System.out.println(konteynir);*/



 /* Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
        Mountain Array Değil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan değer alıyorsa Mauntain Array değildir.*/

     /* int[] dizi = {0,7,51,11,10,3,1};
        List<Integer> liste = new ArrayList<>();
        for (int sayi:dizi)
        {
            liste.add(sayi);
        }
        int tepeNoktasi=0;
        boolean istru = true;

        for (int i = 0; i < liste.size()-1; i++)
        {
            if (istru && liste.get(i)>liste.get(i+1))
            {
                tepeNoktasi++;
                istru=false;
            }
            if (!istru && liste.get(i)< liste.get(i+1))
            {
                tepeNoktasi++;
            }
        }
        if (tepeNoktasi==1)
        {
            System.out.println("mountaindır");
        }else System.out.println("mountain deildir");*/



     /*   List<Integer> myList = new ArrayList<>();

        myList.add(17);
        myList.add(65);
        myList.add(15);
        myList.add(75);
        myList.add(7);
        myList.add(7);

        int counter = 0;

        for (int i = 0; i < myList.size()-1; i++)
        {

                if (myList.get(i)==myList.get(i+1))
                {
                    counter++;
                }
        }
        if (counter == 0)
        {
            System.out.println("benzersiz");
        }else System.out.println("benzerli "+counter);*/



     /*  // Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
      //     olup olmadığını kontrol ediniz.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        myList.add(10);
        int counter = 0;
        for (int i = 0; i < myList.size(); i++)
        {
            for (int j = i; j < myList.size()-1; j++)
            {
                if (myList.get(i)== myList.get(i+1))
                {
                    counter++;
                    break;
                }
            }
        }
        if (counter == 0)
        {
            System.out.println("benzersiz");
        }else System.out.println("tekrarlı hemide "+ counter+" kere");*/



    /*  //  Listede 15 veya 13 varsa, bu elemanları kaldırınız.

        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);

        for (int i = 0; i < h.size(); i++)
        {
            if (h.get(i)==15||h.get(i)==31)
            {
                h.remove(h.indexOf(h.get(i)));
                i--;
            }
        }
        System.out.println(h);*/


//sayıya cevirip farklı olanları topla dolar fiyatı 18.50 * ise 21
    /*    List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$54.45");
        myList.add("*12.99");
        myList.add("*23.60");
        double sum=0;
        double dolar=18.50;
        double yildiz=21.0;


        for (int i = 0; i < myList.size(); i++)
        {
            if (myList.get(i).contains("$"))
            {
                String k= myList.get(i).replace("$","");
                double yeni= Double.parseDouble(k);
                sum+=(yeni*dolar);
            }
            else if (myList.get(i).contains("*"))
            {
                String k1= myList.get(i).replace("*","");
                double yeni1= Double.parseDouble(k1);
                sum+=(yeni1*yildiz);
            }

        }
        System.out.println(sum);*/



        /*// Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();
        int sabit=0;
        int[] dizi= new int[sayi];

        while (sayi!=0){
            System.out.println("sayiları gir");
            int sayi2=scan.nextInt();

            dizi[sabit++]=sayi2;
            sayi--;
        }
        System.out.println(Arrays.toString(dizi));*/


       /* //aralarındaki fark en az kactır
        List<Integer> liste=new ArrayList<>();

        List<Integer> liste2=new ArrayList<>();

        liste.add(25);
        liste.add(26);
        liste.add(39);
        liste.add(7);
        liste.add(10);
        Collections.sort(liste);
        int kucuk= liste.get(1)- liste.get(0);

        for (int i = 0; i < liste.size()-1 ; i++)
        {
                if (liste.get(i+1)- liste.get(i)<kucuk)
                {
                    kucuk=liste.get(i+1)- liste.get(i);
                }
        }System.out.println(kucuk);

        for (int i = 0; i < liste.size()-1; i++)
        {
            if (liste.get(i+1)- liste.get(i)==kucuk)
            {
                liste2.add(liste.get(i+1));
                liste2.add(liste.get(i));
            }
        }
        System.out.println(liste2);*/


//BELİRLENEN BİR STRİNGİ LİSTEYE YERLEŞTİRME
      /*  List<String> harf=new ArrayList<>();

        harf.add("G");
        harf.add("S");
        harf.add("C");
        harf.add("D");
        String w="";

        while (!w.equals("Q"))
        {
            Scanner scan = new Scanner(System.in);
            w = scan.next().substring(0, 1);

            int idx = harf.indexOf(w);
            if (harf.contains(w))
            {
                harf.set(idx, "bulundu");
            }
        }
        System.out.println(harf);*/


        //maasın 1000 lira üstuyse yuzde 3 zam maasın altındaysa yuzde 7 maasından kes


      /*  List<Double> maas=new ArrayList<>();

        maas.add(2000.0);
        maas.add(500.0);
        maas.add(2500.0);
        maas.add(800.0);

        for (double sayi:maas)
        {
            int idx=maas.indexOf(sayi);
            if (sayi>=1000)
            {
                maas.set(idx,sayi*1.03);
            }else {

                maas.set(idx,sayi*0.93);
            }
        }
        System.out.println(maas);*/



      /*  //belli bir sayıdan sonraki en kucuk veya en buyuk sayıyı karsılastırarak bulma kodu
        int[][] dizi = {{3, 2, 61}, {-7, 6}, {9, 3},{8}};
        int max=dizi[0][0];
        int min=dizi[0][0];

        for (int[] w:dizi)
        {
            for (int sayi: w)
            {
                if (sayi>0)
                {
                    max=Math.max(sayi,max);
                    min=Math.min(sayi,min);
                }
            }
        }
        System.out.println(min);*/


     /*   int[] dizi = {3, -21, 61, -7, 6, 9, -9,8};
        Arrays.sort(dizi);

        int max=dizi[0];
        int min=dizi[dizi.length-1];

        //misal sayıdan sonraki en kucuk veya en buyuk sayıyı karsılastırarak bulma kodu

        for (int each:dizi)
        {
                if (each >0)
                {
                    min=Math.min(each,min);
                }
        }
        System.out.println(min);*/


        //dış dizinin ilk elemanı ile içteki dizilerin toplamını veren kod
       /* int[][] dizi = {{3, 2, 6}, {7, 6}, {9, 3},{8}};

        int toplam = 0;

        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi[i].length; j++)
            {
                toplam+=dizi[i][j];
            }
            for (int j = 0; j < dizi.length; j++)
            {
                toplam +=dizi[i][j];
                System.out.println(toplam);
                toplam=0;
                break;
            }
        }*/


        //4 soruluk bir sınavda cevap anahtarı verilmiş işaretlediklerim dogru cevap sayısı
      /*  char[][] cavaplarDizi = {{'A'}, {'B'}, {'C'},{'C'}};
        char[] diziiIsaretlediklerim={'C','B','E','C'};
        int toplam=0;
        int counter=0;
        int carpim=1;

        for (int i = 0; i < cavaplarDizi.length; i++)
        {
            for (int j = 0; j < cavaplarDizi[i].length; j++)
            {
                System.out.println(cavaplarDizi[i][j]+"="+diziiIsaretlediklerim[i]);
                if (cavaplarDizi[i][j]==diziiIsaretlediklerim[i])
                {
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.println(counter);*/


        //dış dizinin ilk elemanı ile içteki dizilerin toplamını baska diziye atan kod
     /*   int[][] dizi = {{3, 2, 6}, {7, 6}, {9, 3},{8}};
        int toplam=0;
        int[] dizison=new int[dizi.length];
        int sabit=0;

        for (int i = 0; i < dizi.length; i++)
        {
             toplam+=dizi[i][0];
            for (int j = 0; j < dizi[i].length; j++)
            {
                toplam+=dizi[i][j];
            }dizison[sabit++]=toplam;
            toplam=0;

        } System.out.println(Arrays.toString(dizison));*/

//rasgele string oluşturma
     /*   Scanner scan=new Scanner(System.in);
        String str="ajkslsi579403j";
        int sayi= scan.nextInt();
        String toplam="";
        Random rnd=new Random();
        while (sayi>0){

            toplam+=str.charAt(rnd.nextInt(0,str.length()));

            sayi--;
        }
        System.out.println(toplam);*/

        //map liste yapımı
      /* Map<String,String> liste=new HashMap<>();
        liste.put("1235","ali, fizik, 12");
        liste.put("1236","cumali, kimya, 13");
        liste.put("1237","umit, mat, 14");
        int count=0;

        System.out.println("tc"+" ".repeat(5)+"isim      bölüm      no");
        Set<Map.Entry<String,String>> yeni=liste.entrySet();

        for (Map.Entry<String,String> w:yeni)
        {
         String key=w.getKey();
         String value= w.getValue();
         String[] valueDizi=value.split(", ");

         System.out.printf("%-6s %-10s %-7s %4s",key,valueDizi[0],valueDizi[1],valueDizi[2]);
            System.out.println();
        }*/
//printf kullanımı tablo
       /* int[] dizikg={3,5,6};
        int[] dizifiyat={10,15,20};
        String[] liste={"Elma","Armut","Çilek"};

        System.out.println("ürün    Miktar   fiyatı    ");
        System.out.println("=".repeat(30));

        for (int i = 0; i < dizikg.length; i++)
        {
            System.out.printf("%-5s %4skg %8s ",liste[i],dizikg[i],dizifiyat[i]);
            System.out.println();
        }*/



//bir dizide gecen en cok gecen harfi yazdıran kod
    /*    String str = "Learning java is easy";
        String[] dizistr = str.replace(" ", "").split("");
        int count = 0;
        int enCokGecen = 0;
        String k = "";
        List<String> liste = new ArrayList<>();

        for (int i = 0; i < dizistr.length; i++)
        {
            if (!liste.contains(dizistr[i]))
                for (int j = 0; j < dizistr.length; j++)
                {
                    if (dizistr[i].equals(dizistr[j]))
                    {
                        count++;
                    }
                }
            if (enCokGecen < count)
            {
                enCokGecen = count;
                k = dizistr[i];
            }
            count = 0;
        }
        System.out.println(k);*/


//ayrıntılı yazmadım sadece cozum gun gir ondan sonraki kac gun sonra hangi gune denk gelir
     /*   Scanner input=new Scanner(System.in);
        int sayi= input.nextInt();
        String gun= input.next();
        int stringidx=0;
        String[]dizi={"pzt","sali","car","per","cum","cmts","pzr"};

        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i].equals(gun))
            {
                stringidx=i;
            }

        }

           int index=sayi%7;
           int sonidx=(index+stringidx)%7;

        System.out.println(dizi[sonidx]);*/






       /* int[][] dizi1 = {{1}, {4, 5, 6}, {8, 10},{8}};
        int[][] dizi2 = {{3, 2, 6}, {7, 6}, {9, 3}};

        int toplam = 0;
        if (dizi1.length> dizi2.length)
        {
            for (int i = 0; i < dizi2.length ; i++)
            {
                if (dizi1[i].length> dizi2[i].length)
                {
                    for (int j = 0; j < dizi2[i].length; j++)
                    {
                        toplam=dizi1[i][j]+dizi2[i][j];
                        System.out.println(toplam);
                        toplam=0;
                    }
                }else{
                    for (int j = 0; j < dizi1[i].length; j++)
                    {
                        toplam=dizi1[i][j]+dizi2[i][j];
                        System.out.println(toplam);
                        toplam=0;
                    }

                }
            }
        }

//maths metoduyla yukarıdaki kodu kısa olarak yazımı aşagıdaki kod

        int[][] dizi1 = {{1, 2, 5}, {4, 5, 6}, {8, 10},{8}};
        int[][] dizi2 = {{3, 2, 6}, {7, 6}, {9, 3}};

        int toplam = 0;
        int disUzunluklardanKisaOlani = Math.min(dizi1.length, dizi2.length);
        int icDiziAnlikUzunluk;
        for (int i = 0; i < disUzunluklardanKisaOlani; i++)
        {
            icDiziAnlikUzunluk = Math.min(dizi1[i].length, dizi2[i].length);
            for (int j = 0; j < icDiziAnlikUzunluk; j++)
            {
                toplam = dizi1[i][j] + dizi2[i][j];
                System.out.println(toplam);
            }
        }*/


//        for (int i = 0; i < dizi1.length; i++)
//        {
//            for (int j = 0; j < dizi2[i].length; j++)
//            {
//                if (dizi1[i].length>dizi2[j].length)
//                {
//
//                        toplam=dizi1[i][j]+dizi2[i][j];
//                        System.out.println(toplam);
//                        toplam=0;
//
//                }
//                else
//                {
//                        toplam=dizi1[i][j]+dizi2[i][j];
//                        System.out.println(toplam);
//                        toplam=0;
//                }
//            }
//        }


        //listeden olusturduğumuz 3elemanlı diziyi cıkarma
   /*     Scanner scan=new Scanner(System.in);

        int[] dizi={5,9,5,75,14,14};
        int count=0;
        int sabit=0;
        int sayilar=0;
        boolean istru=true;
        List<Integer> liste=new ArrayList<>();
        int yeniDizi[] = new int[3];
        int sonDizi[]=new int[dizi.length];

        System.out.println(Arrays.toString(dizi));
        while (count!=3)
        {
            System.out.println("KONTROL sayiları gir");
            sayilar = scan.nextInt();
            yeniDizi[count++] = sayilar;
        }
        System.out.println(Arrays.toString(yeniDizi));

        for (int i = 0; i < dizi.length; i++)
        {
            liste.add(dizi[i] );
        }

            for (int j = 0; j < yeniDizi.length; j++)
            {
                int idx=liste.indexOf(yeniDizi[j]);
                if (liste.contains(yeniDizi[j]))
                {
                    liste.remove(idx);
                    j--;
                }
            }

        System.out.println(liste);*/


        // Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki 0 a en yakın küçük ve en büyük öğeleri konsolda yazdırınız.

   /*     Scanner scan=new Scanner(System.in);
        System.out.println("kaç sayı gir");
        int sayi= scan.nextInt();
        int[] dizi=new int[sayi];
        int sabit=0;

        for (int i = 0; i < sayi; i++)
        {
            System.out.println("sayıları gir");
            dizi[sabit++]=scan.nextInt();
        }
        Arrays.sort(dizi);
        int buyuk=dizi[0];
        int kucuk=dizi[dizi.length-1];

        for (int i = 0; i < sayi; i++)
        {
            if (dizi[i]<0)
            {
                buyuk=Math.max(buyuk,dizi[i]);
            }else {
                kucuk=Math.min(kucuk,dizi[i]);
            }

        }
        System.out.println(buyuk+"    "+kucuk);*/


//VERİLEN BİR SAYI DİZİDE VARSA CIKARAN KOD METOD İLE
     /*   int[] dizi={5,9,5,75,14,14};
        int deger=9;
        int[] sepet=new int[dizi.length-1];
        int[] sonDizi=Metodlar.cikarDiziden(dizi,sepet,deger);

        System.out.println(Arrays.toString(sonDizi));*/


//iç dizideki son elemanlarının carpımı uzun yol
    /*    int[][] dizi3 = {{1,2,4}, {4,5}, {8,3}};
        int carpim=1;
        for (int i = 0; i < dizi3.length; i++)
        {
            for (int j = dizi3[i].length-1; j < dizi3[i].length; j++)
            {
                carpim*=dizi3[i][j];
            }
        }

        System.out.println(carpim);*/
        //coklu dizideki kısayol son elemanları carpım
     /*   int[][] dizi3 = {{1,2,4}, {4,5}, {7}};
        int carpim=1;

        for (int i = 0; i < dizi3.length; i++)
        {
            carpim*=dizi3[i][dizi3[i].length-1];
        }
        System.out.println(carpim);*/


//coklu arrayin icindeki dizileri carpıp coklu arraye atma
    /*    int[][] dizi = {{1,2,4}, {4,5}, {7}};
        int carpim=1;
        int[][] dizi3 = new int[dizi.length][1] ;

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = 0; j < dizi[i].length; j++)
            {
                carpim *= dizi[i][j];
            }
            dizi3[i][0] = carpim;
            carpim = 1;
        }
        System.out.println(Arrays.deepToString(dizi3));*/

//tekrarsız yeni dizi oluşturma
    /*    int[] dizi={5,9,5,75,14,14};
        int sabit=0;
        int[] sepet=new int[dizi.length];
        int[] yeniDizi=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {

            for (int j = i; j < dizi.length; j++)
            {

                if (dizi[i] == dizi[j])
                {
                    if (Metodlar.isvarmi(yeniDizi,dizi[i]))
                    {
                        yeniDizi[sabit++]=dizi[i];
                    }

                }
            }
        }

        System.out.println(Arrays.toString(yeniDizi));*/


//ic dizideki sayıları topla tekdizili yeni array oluştur
       /* int[][] dizi = {{1,2,3,4}, {4, 5,6}, {8, 3}};
        int[] ydizi=new int[dizi.length];
        int sabit=0;
        int toplam=0;

        for (int[] w:dizi)
        {
            for (int sayi:w)
            {
                toplam+=sayi;
            }
            ydizi[sabit++]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(ydizi));*/


//****Arrays sor metoduyla da strinleri kucukten buyuge sıralamıs en buyugu ve en kucuğu bulma
    /*   String str="Java kolaydır calısmayana ali ki";


        String[] dizi=str.split(" ");
        int kucuk=dizi[0].length();
        int buyuk=dizi[0].length();
        String kucuks="";

        Arrays.sort(dizi,Comparator.comparingInt(String::length));
        System.out.println(dizi[dizi.length-1]);

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = 1; j < dizi.length; j++)
            {
                if (dizi[i].length()<kucuk)
                {
                    kucuk=dizi[i].length();
                    kucuks=dizi[i];
                }
            }
        }
        System.out.println(kucuks);*/



        /* //tekrar etmeyenleri toplayan kod
        int[] dizi={5,9,5,75,14,14};

        List<Integer> liste=new ArrayList<>();


       for (int i = 0; i < dizi.length ; i++)
        {
            liste.add(dizi[i]);
        }

        int toplam=0;

        for (int i = 0; i < liste.size(); i++)
        {
            int sayindex=liste.indexOf(dizi[i]);
            int saylastindex=liste.lastIndexOf(dizi[i]);
            if (sayindex==saylastindex)
            {
                toplam+=dizi[i];

            }
        }
        System.out.println(toplam);*/


//tekrarsızları listeye koyma
     /*   List<Integer> liste=new ArrayList<>();
        int[] sayi={5,9,5,75,14,14};
        int toplam=0;
        int[] dizi=new int[sayi.length];
        int sabit=0;

       for (int i = 0; i < sayi.length; i++)
        {
            for (int j = 0; j < sayi.length ; j++)
            {
                if (!liste.contains(sayi[i]))
                {
                    liste.add(sayi[i]);
                }
            }

        }
        System.out.println(liste);*/

//okek bulma
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("a b c gir");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int okek=1;

        for (int i = 1; i <=a*b; i++)
        {
            if (i%a==0 && i%b==0)
            {
                okek=i;
                break;
            }
        }
        System.out.println(okek);*/


        //obeb bulma kodu
       /* Scanner scan=new Scanner(System.in);
        System.out.println("a b c gir");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int obeb=1;


        for (int i = 1; i <=b; i++)
        {
            if (a%i==0 && b%i==0)
            {
                obeb=i;
            }
        }
        System.out.println(toplam);*/


//devamı yapılmamış kok bulma işlemi formul verilecek
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("a b c gir");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();
        double delta=(b*b)-(4*a*c);

        if (delta >0)
        {
            double x1=-b+(Math.sqrt(delta))/(2*a);
            double x2=-b-(Math.sqrt(delta))/(2*a);
            System.out.println("kokler "+x1+" "+x2);
        }*/


//sayı tahmin oyunu
     /*   int tahmin=0;
        int can=5;
        int sayiTahmin=0;
        int[] tahminDizi=new int[5];

        Scanner scan=new Scanner(System.in);
        boolean isfind=true;
        Random rnd=new Random();
        int sayirnd= rnd.nextInt(15);

        while (isfind){
            System.out.print("Tahminde bulununuz : ");
            sayiTahmin= scan.nextInt();

            if (sayiTahmin>0&&sayiTahmin<15)
            {

                if (sayiTahmin!=sayirnd)
                {
                    if (sayirnd >sayiTahmin)
                    {
                        System.out.println("Büyük sayı seçin");

                    }else System.out.println("küçük sayı seçin");

                    System.out.println("Kalan hakkınız : "+--can);
                    tahminDizi[tahmin++]=sayiTahmin;

                }else {
                    tahminDizi[tahmin++]=sayiTahmin;
                    System.out.println("Bildiniz : "+tahmin+"."+"sayıda buldunuz"+" tahminiz : "+sayiTahmin);
                    System.out.println("tahminleriniz: "+Arrays.toString(tahminDizi));
                    break;
                }
            }else System.out.println("Hatalı Aralık girdiniz");
            if (can==0)
            {
                System.out.println("Kaybettiniz");
                break;
            }
        }*/





       /* String str="bugun hava cok guzel";
        String toplam="";
        boolean ishak=true;
        for (int i = 0; i < str.length (); i++)
        {
            for (int j = i; j < str.length(); j++)
            {
                String harf=str.charAt(i)+"";
                if (str.charAt(i)==str.charAt(j))
                {
                    if (isvar(toplam,harf))
                    {
                        toplam+=harf;
                    }
                }
            }
        }
        System.out.println(toplam);*/





      /*  Scanner scan=new Scanner(System.in);
        System.out.println("say gir");
        boolean issifre=true;
        int toplam=0;
        int count=0;
        int negcount=0;
        do{
            int sayi= scan.nextInt();

            if (sayi<0)
            {
                System.out.println("negatif girme");
                negcount++;
            }else if(sayi>0){
                toplam+=sayi;
                count++;
            }else {
                System.out.println("işleminiz sonlandı");
                issifre=false;
            }

        }while (issifre);

        System.out.println("saımızın toplamı : "+toplam+" girilen pozitif sayı :"+count+"negtif sayi : "+ negcount);*/

        /*Scanner scan=new Scanner(System.in);
        System.out.println("say gir");
        boolean issifre=true;
        int toplam=0;
        int count=0;

        do{
            int sayi= scan.nextInt();
            toplam+=sayi;
            if (toplam>=500)
            {
                issifre=false;
            }
            count++;

        }while (issifre);

        System.out.println("saımızın toplamı : "+toplam+" girilen sayı :"+count);*/

//şekil kodu

     /*  for (int i = 1; i < 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (i==1 && j==3 )
                {
                    System.out.print("A ");
                }
                else if (i==2 && (j==2||j==4))
                {
                    System.out.print("Y ");
                }
                else if (i==3 && (j==1||j==5))
                {
                    System.out.print("H ");
                }else System.out.print(" ");

            }System.out.println();
        }*/





        /*Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        boolean issifre=true;

        do{
            str=str.replaceAll("[ ]","");
            String kucuk=str.replaceAll("[a-z]"," ");
            String buyuk=str.replaceAll("[A-Z]"," ");


            if (!kucuk.contains(" "))
            {
                System.out.println("kucuk harf eksik");
            }
            if (!buyuk.contains(" "))
            {
                System.out.println("buyuk harf eksik");
            }

            else {
                System.out.println("eksik yok");
            }
            issifre=false;


        }while (issifre);*/


//liste sorusu ekleme cıkarma değistirme kodu
      /*  List<Integer> liste = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        boolean isthere = true;
        String mesaj = "";
        while (isthere)
        {
            System.out.print("lütfen işlem yapmak istediğiniz sayıyı giriniz : ");
            int ilkGirilen = scan.nextInt();
            isthere = ilkGirilen > 0 && ilkGirilen < 4;
            if (isthere)
            {
                System.out.print("sayi gir : ");
                int sayi = scan.nextInt();
                int sayindex = liste.indexOf(sayi);
                if (ilkGirilen == 1)
                {
                    liste.add(sayi);
                    System.out.println(mesaj + "Girmiş olduğunuz " + sayi + " listeye eklendi..");
                }
                else if (ilkGirilen == 2)
                {
                    if (liste.contains(sayi))
                    {
                        liste.remove(sayindex);
                        System.out.println("Girmiş olduğunuz " + sayi + " listeden çıkarıldı..");
                    }
                    else System.out.println("Cıkarılacak sayi yok....");
                }
                else if (ilkGirilen == 3)
                {

                    if (liste.contains(sayi))
                    {
                        System.out.print("ikinci sayiyi giriniz : ");
                        int sayi2 = scan.nextInt();

                        liste.set(sayindex, sayi2);
                        System.out.println(sayi + " ve " + sayi2 + " yer değiştirdi....");
                    }
                    else System.out.println("Listede değiştirlecek eleman yok...");
                }
            }
            else
            {
                System.out.println("hatalı bir sayi ile giris yaptınız");
                isthere = false;
            }
        }
        System.out.println(liste);*/




        /*sayımız 10 dan kucukse ve a karakterini içeriyorsa gecerli içermiyorsa gecersiz yazsın
          eger sayımız 10 dahil ve buyukse, ikinci harfi k karakteriyse gecerli degğilse gecersiz yazan kod
        */
        /*int sayi=4;

        for (int i = 0; i < sayi; i++)
        {
            for (int j = 1; j <sayi-i ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < sayi; i++)
        {
            for (int j = 0; j <i+1 ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*sayi-(2*i+3); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


       /* String isim1= "umit ozcan";

        String isim=isim1.split(" ")[0];
        String soyisim=isim1.split(" ")[1];
        isim1=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+
                soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        //String sifre=isim1.replaceAll("[a-z]","*");


        char harf='k';
        String toplam="";


        for (int i = 0; i < isim1.length(); i++)
        {
            harf=isim1.charAt(i);

            if (harf>='a'&&harf<='z')
            {
                harf='*';
            }
            toplam+=harf;

        }
        System.out.println(toplam);


        String yenisim= isim1.substring(0,1).toUpperCase()+isim1.substring(1).toUpperCase().replaceAll("[A-Za-z]","*");
        //System.out.println(yenisim);

        String str="3545 4582 1234 1245 1856";


        String kart=str.substring(0,str.length()-5).replaceAll("[0-9]","*")+str.substring(str.length()-5);*/

        // System.out.println(kart);




      /* String str= "baraklar";
        String toplam="";
        int count=0;
        for (int i = 0; i < str.length(); i++)
        {
            String c=str.substring(i,i+1);
            if (str.indexOf(c)!=str.lastIndexOf(c))
            {
                count++;
                if (!toplam.contains(c))
                {
                    toplam+=c;
                }

            }
        }
        System.out.println(toplam+"   "+count);*/

/*
        //şifremiz en az bir buyuk harf,1 sembol noktalama,1 rakam olsun,bosluk olmayacak,7 harften buyuk

        String str="Al2? .akil";

        boolean isharf=str.replaceAll("[^A-Z]","").length()>0;
        boolean issayi=str.replaceAll("[^0-9]","").length()>0;
        boolean issembol=str.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        boolean isbosluk=str.replaceAll("[^ ]","").length()>0;
        if (isbosluk &&issembol&&isharf&&issayi)
        {
            System.out.printf("harika");
        }else {
            System.out.printf("geçersiz");
        }*/


        /*String str="ali okul? Var! 12yada...";
        String sr=str.replaceAll("[^a-zA-Z ]","");
        String[] dizi=sr.split(" ");

        System.out.println(Arrays.toString(dizi));*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("mesafe gir : ");
        int mesafekm = input.nextInt();
        System.out.print("yaş gir : ");
        int yas = input.nextInt();
        System.out.print("yolculuk tip gir : ");
        int tip = input.nextInt();
        double toplam = 0;
        double mesafetoplam = (mesafekm * 0.10);
       if (mesafekm < 0 || tip < 1 || yas < 0 || tip > 2)
        {
            System.out.println("hatalı veri");
        }
        else
        {
            if (yas < 12)
            {
                mesafetoplam *= 0.50;
            }
            else if (yas > 12 && yas < 24)
            {
                 mesafetoplam *= 0.90;
            }
            else if (yas < 65)
            {
                mesafetoplam *= 0.70;
            }
            if (tip == 2)
            {
                mesafetoplam *= 0.80;
            }
        }
        System.out.println(mesafetoplam);*/






    /*    Scanner scanner = new Scanner(System.in);

        int wrongEnter = 3;
        String pasword = "1234";
        double balance = 10000;
        int amountInvest = 0;
        String number="ali";
        boolean isgiris=false;
        while (wrongEnter>0)
        {
            if (!isgiris)
            {
                System.out.print("Enter is password :");
                number = scanner.nextLine();

            }
            if (pasword.equals(number))
            {
                isgiris=true;
                System.out.println("Please log in a valid number\n1-investman money :\n2-Pull money :\n3-Process End...");
                int option = scanner.nextInt();

                if (option == 1)
                {
                    System.out.println("Please enter the amount");
                    amountInvest = scanner.nextInt();
                    balance += amountInvest;
                    System.out.println("Your new balance: " + balance);
                    System.out.println("For another process\n1-Please enter the amount\n2-Process End... ");
                    amountInvest = scanner.nextInt();
                    if (amountInvest == 2)
                    {
                        break;
                    }
                }
                else if (option == 2)
                {
                    System.out.println("Please enter the amount");
                    int amountPull = scanner.nextInt();
                    if (balance > amountPull)
                    {
                        balance -= amountPull;
                        System.out.println("Your new balance: " + balance);
                        System.out.println("For another process\n1-Please enter the amount\n2-Process End... ");
                        amountInvest = scanner.nextInt();
                        if (amountInvest == 2)
                        {
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Wrong amountpul....");
                        System.out.println("For another process\n1-Please enter the amount\n2-Process End... ");
                        amountInvest = scanner.nextInt();
                        if (amountInvest == 2)
                        {
                            break;
                        }
                    }
                }
                else if (option == 3)
                {
                    System.out.println("See You... Process End...");
                    break;
                }
                else
                {
                    System.out.println("Void Process...!");
                }
            }
            else
            {
                isgiris=false;
                System.out.println("Enter is false.....!\nRemain right " + --wrongEnter);
                if (wrongEnter == 0)
                {
                    System.out.printf("Card is Blocked!!!\nPlease You must go bank...");
                }

            }
        }*/


//girilen sayi varsa true dönen kod
      /*  Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isThere = false;
        int[] array = {2, 3, 5, 7};

        for (int i = 0; i < array.length; i++)
        {
            if (number == array[i])
            {
                isThere = true;
                break;
            }
        }
        if (isThere)
            System.out.println("evet");
        else
            System.out.println("hayır");*/




       /* Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        (Büyük/küçük harfe duyarlı değil)
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex."*/

      /*  String cumle = "Apex ıs easy. Type codes to learn apex. To earn money learn apex. ıs that to?";
        cumle = cumle.toUpperCase().replaceAll("\\p{Punct}","");
        String dizi[]=cumle.split(" ");
        String toplam = "";
        int ydizi[]=new int[dizi.length];
        int count=0;
        List<String> liste=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++)
        {
            if (i != 0 && ydizi[i] == i)
                continue;
            for (int j = i+1; j < dizi.length ; j++)
            {
                if (dizi[i].equals(dizi[j]))
                {
                    count++;
                    ydizi[j]=j;
                    if (!liste.contains(dizi[i]))
                    {
                        liste.add(dizi[i]);
                    }
                }
            }
            System.out.println(dizi[i]+"  "+count);
            count=0;
        }
        System.out.println(liste+"    "+count);*/


        /*Scanner input=new Scanner(System.in);
        String kelime= input.next();
        String kelime2= input.next();

        String[] dizi=kelime.toUpperCase().split("");
        Arrays.sort(dizi);
        String[] dizi2=kelime2.toUpperCase().split("");
        Arrays.sort(dizi2);

        
            if (kelime.length()==kelime2.length() && Arrays.equals(dizi,dizi2) )
            {
                System.out.println("Anagram");
            }
            else if (kelime.isEmpty() && kelime2.isEmpty())
            {
                System.out.println("Anag deil");
            } else {
                System.out.println("Anag deil");
            }*/


//BİR HARFİN BİR KELİMEDE GECİP GECMEDİĞİ VE KAC TANE KELİMEDE GECTİĞİ KOD

     /*   String str2="cumali besli mal kur Ul al";
        str2=str2.toUpperCase();
        String[] kro=str2.split(" ");

        System.out.println(Arrays.toString(kro));
        int count=0;

        for (int i = 0; i < kro.length; i++)
        {
            if (kro[i].contains("U"))
            {
                count++;
                System.out.println(kro[i]);
            }

        }
        System.out.println(count+" cumlede gecmektedir");*/


//l harfi olmayanları yazdıran kod
        /*String[] dizi = {"ali", "veli", "akif", "isa"};
        String harf="l";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++)
        {
            if (!dizi[i].contains(harf))
            {
                list.add(dizi[i]);
            }
        }
        String[] yenistr=new String[list.size()];

        for (int i = 0; i < yenistr.length; i++)
        {
            yenistr[i]= list.get(i);
        }
        System.out.println(Arrays.toString(yenistr));*/




      /*  String[] dizi = {"ali", "veli", "akif", "isa"};
        String harf="l";

        List<String> liste = new ArrayList<>();

        for (String str:dizi)
        {
            if (!str.contains(harf))
            {
                liste.add(str);
            }
        } System.out.println(liste);*/


       /* int[] dizi={0,2,5,3,1,7,3,2};
        Arrays.sort(dizi);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < dizi.length-1; i++)
        {
            if (dizi[i] != dizi[i+1] )
            {
                list.add(dizi[i]);
            }
        }
        if (!list.contains(dizi[dizi.length-1]))
        {
            list.add(dizi[dizi.length-1] );
        }
        int[] yenidizi=new int[list.size()];
        for (int i = 0; i < yenidizi.length ; i++)
        {
            yenidizi[i]=list.get(i);
        }
        System.out.println(Arrays.toString(yenidizi));

        int[] arr={0,2,5,3,1,7,3,2};
        Arrays.sort(dizi);

        List<Integer> liste = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (!liste.contains(arr[i]))
            {
               liste.add(arr[i]);
            }
        }
        System.out.println(liste);*/

//string bir cümledeki tekraretmeyecek sekilde harfleri yazdıran kod
     /*   String kelime = "Missisippi";
        String toplam = "";
        int[] yeni = new int[kelime.length()];

        for (int i = 0; i < kelime.length(); i++)
        {

            for (int j = 0; j < kelime.length(); j++)
            {
                if (!toplam.contains(kelime.charAt(i) + ""))
                {
                    if (kelime.charAt(i) == kelime.charAt(j))
                    {
                        toplam += kelime.charAt(i);
                    }
                }

            }

        }
        System.out.println(toplam);

        String kelime2 = "Missisippi";
        String toplam2 = "";

        for (int i = 0; i < kelime2.length(); i++)
        {
            if (!toplam2.contains(kelime2.charAt(i)+""))
            {
                toplam2+=kelime2.charAt(i);
            }
        }
        System.out.println(toplam2);*/


//diziyi sıraya sokma kod ile ve tekrar etmeyen sayıları yeni diziye atma
    /*    int[] dizi = {7, -25, 789, -25, 7, 12, -58, 99};
        int[] yeniDizi = new int[dizi.length];
        int art = 0;
        int sabit = 0;

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (dizi[i]>dizi[j])
                {
                    sabit=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=sabit;

                }
            }
        }
        System.out.println(Arrays.toString(dizi));


        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (varMi(yeniDizi,dizi[i]))
                {
                    yeniDizi[art++]=dizi[i];
                }
            }
        }

        System.out.println(Arrays.toString(yeniDizi));*/


//armstrong sayi yazan kod
        /*int toplam=0;

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int yenisayi=sayi;
        int str=0;

        while (sayi>0)
        {
            str=sayi%10;
            toplam+=str*str*str;
            sayi=sayi/10;
        }
        if (toplam == yenisayi)
        {
            System.out.println("armstron sayı");
        }else {
            System.out.println("deil");
        }*/


//kendinden önceki sayıyı toplayan kod
        /*int s1 = 0;
        int s2 = 1;
        int s3 = 1;

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        for (int i = 0; i < sayi; i++)
        {
            s1 = s2;
            s2 = s3;
            s3 = s1 + s2;
            System.out.print(s1 + " ");
        }*/


//ucgenler ve ters devamlarını yazan kod
      /*  Scanner scan=new Scanner(System.in);
        System.out.print("Sayı gir : ");
        int sayi= scan.nextInt();
        int yidiz=sayi+1;

        for (int i = 0; i < sayi; i++)
        {
            for (int j = 0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < sayi+yidiz-(2*i+2); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < sayi; i++)
        {
            for (int j = 1; j <sayi-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


       /* Scanner scan=new Scanner(System.in);
        System.out.print("Sayı gir : ");
        int sayi= scan.nextInt();
        int yidiz=sayi+1;

        for (int i = 0; i < sayi; i++)
        {
            for (int j = 0; j < sayi-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }System.out.println();
        }
        for (int i = 1; i < sayi; i++)
        {
            for (int j = 0; j <i+1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < sayi+yidiz-(2*i+2); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


//benzersizleri yazdıran kod
       /* String kelime="Hello";
        String toplam1="";

        for (int i = 0; i < kelime.length(); i++)
        {
            String k=kelime.substring(i,i+1)+"";
            if (kelime.indexOf(k)==kelime.lastIndexOf(k))
            {
                toplam1+=k;
            }

        }
        System.out.println(toplam1);*/


//bir sayıyı rakamlarını toplayan kod
       /* int sayi=1085;
        int toplam=0;

        while (sayi>0)
        {
            toplam+=sayi%10;
            sayi=sayi / 10;
        }
        System.out.println(toplam);*/


        //harften öncesine kadar kelimeyi yazdıran kod
        /*String kelime="Arkadas";
        String toplam="";

        for (int i = 0; i < kelime.length(); i++)
        {

            toplam+=kelime.charAt(i);
            if (kelime.charAt(i)=='d')
            {
                break;
            }
        }
        System.out.println(toplam);*/


        //iki yöntem ile belli bir kare şekli yazdıran kod

       /* int en = 5;
        int boy = 4;
        String toplam = "";

        for (int i = 1; i <= boy; i++)
        {
            toplam = "";
            if (i == 1)
            {
                toplam += "A ";
                for (int j = 2; j < boy; j++)
                {
                    toplam += "X ";
                }
                toplam += "A ";
                toplam += "A ";
                System.out.println(toplam);
            }
            else if (i == 2 || i == 4)
            {
                for (int j = 1; j <= en; j++)
                {
                    toplam += "A ";
                }
                System.out.println(toplam);
            }
            else
            {
                for (int j = 1; j <= en; j++)
                {
                    toplam += "X ";
                }
                System.out.println(toplam);
            }
        }

        System.out.println("--------------------------");
        String toplam1 = "";

        for (int i = 0; i < 4; i++)
        {
                if (i == 0)
                {
                    System.out.print("A ");
                    for (int k = 0; k < 2; k++)
                    {
                        System.out.print("X ");
                    }
                    System.out.print("A ");
                    System.out.print("A");
                    System.out.println();
                }

                else if (i == 2)
                {
                    for (int k = 0; k < 5; k++)
                    {
                        System.out.print("X ");
                    }
                    System.out.println();
                }
                else
                {
                    for (int k = 0; k < 5; k++)
                    {
                        System.out.print("A ");
                    }
                    System.out.println();
                }
        }*/


     /* //  Buyuk harfleri dısındakileri yıldıza ceviren kod ve string manipülasyondan yazdıran kod
        String cumle="Java Cok Guzel";
        System.out.println(cumle.replaceAll("[^A-Z ]","*"));
        String buyukHarfler="";
        char harf ;

        for (int i = 0; i < cumle.length(); i++)
        {

            harf=cumle.charAt(i);
            if (harf>='a' && harf <='z' )
            {
                harf='*';
            }
            buyukHarfler+=harf;

        }
        System.out.println(buyukHarfler);*/



      /*  //Buyuk harfleri yazdıran kod ve string manipülasyondan yazdıran kod
        String cumle="Java Cok Guzel";
        System.out.println(cumle.replaceAll("[^A-Z ]",""));
        String buyukHarfler="";
        char harf ;

        for (int i = 0; i < cumle.length(); i++)
        {

            harf=cumle.charAt(i);
            if (!(harf>='a' && harf <='z') )
            {
               buyukHarfler+=harf;
            }

        }
        System.out.println(buyukHarfler);*/


    /*   //cumleyi tersten okuma kodu
        String cumle="Jva Cok Guzel";
        String ters="";

        for (int i = cumle.length()-1; i >= 0; i--)
        {
            String harf=cumle.substring(i,i+1);
            ters+=harf;

        }
        System.out.println(ters.toUpperCase());*/
         /*int sayi = 57;
        String toplam = "";

        for (int i = 1; i < sayi; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                toplam += "java\n";
            }
            else

                toplam += i + "\n";
        }
        System.out.print(toplam + " ");*/


    }
}
