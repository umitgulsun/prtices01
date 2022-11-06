package ornek;

public class Loops_If_StringManipulasyonPratikler
{
    public static void main(String[] args)
    {

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
