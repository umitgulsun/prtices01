package ornek;

public class LocalDateOrnek
{
    public static void main(String[] args)
    {

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



    }
}
