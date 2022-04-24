package oop_principles.recap;

public class TestingHuman {
    public static void main(String[] args) {

        Human alona=new Human("Alona",'F',27,"Chicago",100.0,100.0);
        System.out.println(alona);
        Human incognito=new Human(null);
        System.out.println(incognito);

        Human salli=new Human("Salli",'M',22);
        System.out.println(salli);
        alona.isFromChicago();
        salli.isFromChicago();

        Human dasha=new Human("Dasha");
        dasha.isFromChicago();


    }
}
