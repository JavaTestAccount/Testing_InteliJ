package study_works;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Cats Mathilda = new Cats("Mathilda", 100);
        Cats Bite = new Cats("Bite", 80);
        Cats Mohan = new Cats("Aohan", 150);
        Cats Alex = new Cats("Alexan", 150);

        ArrayList<Cats> myCats = new ArrayList<>();
        myCats.add(Mathilda);
        myCats.add(Bite);
        myCats.add(Mohan);
        myCats.add(Alex);

        System.out.println(Bite.toString());
    }
}










