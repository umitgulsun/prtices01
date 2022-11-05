import java.util.*;

public class Metodlar
{



    static boolean isvarmi(int dizi[], int sayi)
    {
        for (int each : dizi)
        {
            if (each == sayi)
            {
                return false;
            }

        }return true;


    }


    public static int[] cikarDiziden(int[] diziv, int[] ydizi,int sayi){
        ydizi=new int[diziv.length-1];
        int sabit=0;

        for (int w:diziv)
        {
            if (w == sayi)
            {
                continue;
            }
            ydizi[sabit++]=w;
        }
        return ydizi;
    }

    public static int[] eksikDizi(int[] dizi){
        int sabit=0;
        int[] sepet=new int[dizi.length];
        int[] yeniDizi=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {    if (i!=0&&sepet[i]==i)
            continue;
            for (int j = i; j < dizi.length; j++)
            {

                if (dizi[i] == dizi[j])
                {
                    sepet[j]=j;

                }
            }yeniDizi[sabit++]=dizi[i];
        }
        return yeniDizi;
    }
    static boolean esitMi(int sayi1,int sayi2)
    {
            if (sayi1==sayi2)
            {
                return false;
            }

        return true;
    }

    public static void ciftleri10olaniYzadir(int[] dizi){

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (dizi[i]+dizi[j]==10)
                {
                    System.out.println(dizi[i]+" + "+dizi[j]+" =10");
                }
            }
        }



    }
    public static void azaltma(int sayi){


        while (sayi>0){

            if (sayi%2==0)
            {
                System.out.print(sayi+" ");
            }

            sayi--;
        }
    }
    public static void rasgele(int a, int b)
    {
        Random rnd = new Random();
        int counterA=0;
        int counterB=0;
        for (int i = 0; i < 1000; i++)
        {
            int sayi=rnd.nextInt(0,1000);
            if (sayi==a)
            {
                counterA++;
            }
            else if (sayi==b)
            {
                counterB++;
            }

        }
        System.out.println(a+" sayisi "+counterA+"---"+b+" sayısı "+counterB);
    }

    public static double getOrtalamaKazanc( List<Double> kazanclistesi){


        double ortalama=0.0;
        for (double w:kazanclistesi)
        {
            ortalama+=w;
        }
        return  ortalama/kazanclistesi.size();
    }
    public static void getOrtalamaninustundeKazanc(List<String> listegunler, List<Double> kazanclistesi, double ortalama){

        List<String> listeGunSon=new ArrayList<>();
        for (int i = 0; i < kazanclistesi.size(); i++)
        {
            if (ortalama< kazanclistesi.get(i))
            {
             listeGunSon.add(listegunler.get(i));
            }
        }
        System.out.println("Günlük kazancın ortalamanın üstündeki gunlerin listesi\n"+listeGunSon);
    }

    public static void getOrtalamaninAltindaKazanc(List<String> listegunler, List<Double> kazanclistesi, double ortalama){

        List<String> listeGunSon=new ArrayList<>();
        for (int i = 0; i < kazanclistesi.size(); i++)
        {
            if (ortalama> kazanclistesi.get(i))
            {
                listeGunSon.add(listegunler.get(i));
            }
        }System.out.println("Günlük kazancın ortalamanın altındaki gunlerin listesi\n"+listeGunSon);
    }
    static void musteriSecimi(List<String> liste, List<Integer> listeFiyati, List<Integer> listeKg, List<String> sonUrun, List<Integer> listesonfiyat)
    {
        String urun = "";
        Scanner input = new Scanner(System.in);
        while (!urun.equalsIgnoreCase("Q"))
        {
            System.out.print("lütfen ürün giriniz veya çıkmak için 'Q' ya basınız : ");
            urun = input.next();

            if (liste.contains(urun) && !urun.equalsIgnoreCase("Q"))
            {
                System.out.print("Lütfen almak isteginiz urunun kg mını giriniz : ");
                int kg = input.nextInt();
                sonUrun.add(urun);
                listeKg.add(kg);
                int urunidx = liste.indexOf(urun);
                listesonfiyat.add(listeFiyati.get(urunidx));
            }else System.out.println("hatalı ürün ismi girdiniz");
        }
    }

    static int kasa(List<Integer> listeKg, List<Integer> listefiyat)
    {
        int toplam = 0;
        for (int i = 0; i < listeKg.size(); i++)
        {
            toplam += listeKg.get(i) * listefiyat.get(i);
        }
        return toplam;
    }


}
