package oopOrnekPaketi;

public class AnimalRunner
{


    public static void main(String[] args)
    {

        /*ınheritence sayesinde code tekrarından kurtuluruz
        code tamiri kolay olur
        chid classları daha atomik yaparız.hızlı calışır
        bir classı baska bir clasın child clası yapmak icin extends
        keyword kullanılır ilk yazılan child
        ikincisi parent olur
        child class objectleri parent classlardaki metod ve verıableri
        kullanabilir.
        parentler chid classdaki metod ve variableri neden kullansın kullanamazlar
        object class her classınn parentıdır.
        java da OBJECTCLASS haric her claasın parentı vardır.
        metodlar ordan gelior.
        bir metod veya variable private ise chidda inherit edilemez

        bir metod veya variable protected ise chidda inherit edilir.
        protected ile baska bir packege da bulunan child claaslar tarafından kullanılabilir
       defaulttta bulunan metod variablellar chid claasslar tarafından kullanılabilir
      defaultta packege dısına cıkılınca kullanılamaz.inherit edilemez
      apartman gibi olan inheritenslara genelden özele multilevel inheritence denir
       agac ginbi dallanıp budaklanıyorsa bir parent birden fazla chid varsa hireachil (hiyararjik) inheritence denir


       */


        int a=3;
        Cat c1=new Cat(a);
        Cat c2=new Cat();
        c1.eat();
        c2.eat();
        System.out.println(Cat.b);



    }
}
