package study_works;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchCollections implements Comparable <String> {

    public static void main(String[] args) {


        char first = 'A';
        int x = 1;
        String justTesting = first + String.format("%02d", x);
        System.out.println(justTesting);

        ArrayList<String> rows = new ArrayList<>();

        for (int n = 1; n <= 5; n++) {
            for (char c = 'A'; c <= 'D'; c++) {
                rows.add(String.format("%02d", n) + c);
            }
        }

        String collectionTest = "03A";
        int found = Collections.binarySearch(rows, collectionTest, null);
        System.out.println(found);


    }

    @Override
    public int compareTo(String randomString) {
        return this.compareTo(randomString); // в методе описывается процедура сравнения
    }
}
