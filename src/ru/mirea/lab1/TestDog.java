package ru.mirea.lab1;

public class TestDog
{
    public static void main (String [] args)
    {
        Dog d1 = new Dog("Bobik", 2);
        Dog d2 = new Dog("Sharik",7);
        Dog d3 = new Dog("Max");
        d3.setAge(2);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}

