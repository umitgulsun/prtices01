package amiralBatti;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GemiRunner
{
    public static int[][] gemilerYerlesTablo(int[][] haritas)
    {
        Random rnd = new Random();
        int gemiKonum = rnd.nextInt(0, 2);
        int randomYatay = rnd.nextInt(0, 8);
        int randomDikey = rnd.nextInt(0, 8);
        int gemiUzunluk = 3;
        boolean isilkCiksin = true;

        while (isilkCiksin)
        {
            if (haritas[randomDikey][randomYatay] != 1)
            {
                for (int i = 0; i < gemiUzunluk; i++)
                {
                    haritas[randomDikey][randomYatay] = 1;
                    isilkCiksin=false;
                    if (gemiKonum == 0)
                    {
                        randomYatay++;
                    }
                    else if (gemiKonum == 1)
                    {
                        randomDikey++;
                    }
                }
            }else {
                 gemiKonum = rnd.nextInt(0, 2);
                 randomYatay = rnd.nextInt(0, 8);
                 randomDikey = rnd.nextInt(0, 8);

            }

        }

        gemiKonum = rnd.nextInt(0, 2);
        randomYatay = rnd.nextInt(0, 7);
        randomDikey = rnd.nextInt(0, 7);
        int ucakGemiUzunluk = 4;
        boolean isCiksin = true;


        while (isCiksin)
        {
            if ((haritas[randomDikey][randomYatay] != 1 && haritas[randomDikey][randomYatay + 1] != 1 && haritas[randomDikey][randomYatay + 2] != 1) ||
                    (haritas[randomDikey][randomYatay] != 1 && haritas[randomDikey + 1][randomYatay] != 1 && haritas[randomDikey + 2][randomYatay] != 1))
            {
                for (int i = 0; i < ucakGemiUzunluk; i++)
                {
                    isCiksin = false;
                    haritas[randomDikey][randomYatay] = 1;
                    if (gemiKonum == 0)
                    {
                        randomYatay++;
                    }
                    else if (gemiKonum == 1)
                    {
                        randomDikey++;
                    }
                }
            }
            else
            {
                gemiKonum = rnd.nextInt(0, 2);
                randomYatay = rnd.nextInt(0, 7);
                randomDikey = rnd.nextInt(0, 7);
            }
        }

        return haritas;
    }

    static void tabloGetir(int[][] tablo)
    {

        for (int i = 0; i < tablo.length; i++)
        {
            for (int j = 0; j < tablo[i].length; j++)
            {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] tablo = new int[10][10];
        int secimHakki = 1;
        int x = 0;
        int y = 0;
        int vurus = 1;
        int secim = 0;
        int hataliSecimCount = 1;
        boolean istrue = true;


        int[][] haritaGorunum = gemilerYerlesTablo(tablo);
        tabloGetir(haritaGorunum);

        System.out.println("bat??rmak istedi??iniz gemiyi bulmak icin l??tfen 0 ile 10 aras??nda iki koordinat seciniz");

        while (istrue)
        {
            System.out.print("birinci koordinat = ");
            x = scan.nextInt();
            System.out.print("ikinci koordinat = ");
            y = scan.nextInt();

            if ((x > -1 && x < 10) && (y < 10 && y > -1))
            {
                while (istrue)
                {
                    if (tablo[x][y] == 1)
                    {
                        tablo[x][y] = -1;
                        System.out.println("yatay m?? yoksa dikey mi devam edeceksiniz\nYatay sa?? taraf i??in '1' e bas??n\n" +
                                "Yatay sol i??in '2' e bas??n\nDikey yukar?? i??in '3' e bas??n\nDikey asag?? i??in '4' e bas??n");
                        secim = scan.nextInt();
                        if (secim == 1)
                        {
                            y++;
                            ++vurus;
                        }
                        else if (secim == 2)
                        {
                            y--;
                            ++vurus;
                        }
                        else if (secim == 3)
                        {
                            x--;
                            ++vurus;
                        }
                        else if (secim == 4)
                        {
                            x++;
                            ++vurus;
                        }
                        else
                        {
                            System.out.println("hatal?? secim");
                            ++hataliSecimCount;
                            break;
                        }
                    }
                    else if (hataliSecimCount == 15)
                    {
                        System.out.println("Hakk??n??z bitti");
                        istrue = false;
                        break;
                    }
                    else
                    {
                        System.out.println("yanl???? koordinat girdiniz...");
                        ++hataliSecimCount;
                        break;
                    }
                    if (vurus == 7)
                    {
                        tablo[x][y] = -1;
                        System.out.println("tebrikler kazand??n??z...");
                        tabloGetir(haritaGorunum);
                        istrue = false;
                    }
                }
            }
            else System.out.println("Koordinat aral?????? d??????nda bir aral??k secemezsiniz!..." +
                    "\nL??tfen 0-10 aras??nada bir koordinat giriniz... ");

        }


    }
}
