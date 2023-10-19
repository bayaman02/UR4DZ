import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
ArrayList<String> listA = new ArrayList<>();
ArrayList<String> listB = new ArrayList<>();
ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String a;
        for (int i = 0; i <5 ; i++) {
            a = scanner.nextLine();
            listA.add(a);

        }
        System.out.println(listA);
        for (int i = 0; i < 5; i++) {
            a=scanner.nextLine();
            listB.add(a);
        }
        System.out.println(listB);
        Collections.reverse(listB);
        System.out.println(listB);
        int num= 1;
        for (int i = 0; i <listA.size() ; i++) {
            listC.addAll(i,Collections.singleton(listA.get(i)));
        }
        for (int j = 0; j < listB.size(); j++) {
            listC.addAll(num,Collections.singleton(listB.get(j)));
            num += 2;
        }
        System.out.println(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);




    }

}































  ArrayList<String> names = new ArrayList<>();
        names.add("Allan");
                names.add("Ali");
                names.add("Amir");
                System.out.println(names);

                if (names.contains("Amir")) {
                System.out.println("da est");
                } else
                System.out.println("netu");
                names.clear();

                if (names.isEmpty()) {
                System.out.println("da pustoy " + names.size());
                } else {
                System.out.println("net ne pustoy " + names.size());
                }
                names.add("Alex");
                names.add("Aman");
                names.add("Alim");
                System.out.println(names);
                ArrayList<String> names1 = new ArrayList<>();
        names1.add("Karim");
        names1.add("Kiril");
        names1.add("Kamil");
        System.out.println(names1);
        names.addAll(names1);
        System.out.println(names);
        names.removeAll(names1);
        System.out.println(names);
        for (int i = 0; i < names1.size(); i++) {
        System.out.println(names1.get(i));
        }
        ArrayList<String> names3 = new ArrayList<>();
        names3.add("Batyrxan");
        names3.add("Amirxan");
        names3.add("Kante");
        System.out.println();
        System.out.println(names3);

        Collections.sort(names3);
        System.out.println("После сортировки");
        System.out.println(names3);
        Collections.reverse(names3);
        System.out.println("После сортировки");
        System.out.println(names3);
        Collections.shuffle(names3);
        System.out.println("После сортировки");
        System.out.println(names3);
        Men men = new Men("bbbbb", 2);
        Men men2 = new Men("ccccc", 1);
        Men men3 = new Men("aaaaa", 3);
        System.out.println("-----------------");
        ArrayList<Men> mens = new ArrayList<>();
        mens.add(men);
        mens.add(men2);
        mens.add(men3);
        System.out.println(mens);
        mens.sort(Comparator.comparing(Men::getAge));

        System.out.println(mens);

   */
