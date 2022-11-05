package oopOrnekPaketi;

public class Cat extends Animal
{
    static int b=10;
    public void cat(){

        System.out.println("miyavv");
    }

    @Override
    public void eat()
    {
        System.out.println("fare");
    }

    public Cat(int a)
    {
        System.out.println("kedi fare yer");
        b+=5;
    }

    public Cat()
    {
        System.out.println("kedi kafayı yedi");
        b+=10;
    }

    static  {

        System.out.println("aliii");
    }
}
