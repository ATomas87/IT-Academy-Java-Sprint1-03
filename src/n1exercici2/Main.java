package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ListIterator<Integer> iterator = integers.listIterator(integers.size());

        List<Integer> integersReverse = new ArrayList<>();
        while (iterator.hasPrevious()) {
            integersReverse.add(iterator.previous());
        }

        System.out.println("Lista de enteros inicial:");
        for (Integer integer : integers){
            System.out.print(integer + " ");
        }

        System.out.println();
        System.out.println("Lista de enteros invertida:");
        for (Integer integer : integersReverse){
            System.out.print(integer + " ");
        }
    }
}
