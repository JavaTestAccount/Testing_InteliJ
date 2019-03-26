package study_works;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "DDDD");
        addInOrder(placesToVisit, "EEEE");
        addInOrder(placesToVisit, "AAAA");
        addInOrder(placesToVisit, "CCCC");
        addInOrder(placesToVisit, "BBBB");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator(); // what`s that?
        while (i.hasNext()) {
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // what`s that?

        while (stringListIterator.hasNext()) {
            int comparasion = stringListIterator.next().compareTo(newCity); // how does "CompareTo" works?
            if (comparasion == 0) {
                System.out.println(newCity + " is already exist");
                return false;
            } else if (comparasion > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparasion < 0) {
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
