package Kap16Exercise3;

import Kap16Exercise2.LinkedIntList;

public class Exercise3
{
    /*
    Write a method called isSorted that returns true if the list
    is in sorted (nondecreasing) order and returns false otherwise.
    An empty list is considered to be sorted
    */

    public static void main(String[] args)
    {
        LinkedIntListExercise3 nonSortedList = new LinkedIntListExercise3();
        nonSortedList.add(9);
        nonSortedList.add(2);
        nonSortedList.add(7);
        nonSortedList.add(12);
        nonSortedList.add(34);
        nonSortedList.add(1);

        LinkedIntListExercise3 sortedList = new LinkedIntListExercise3();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(4);
        sortedList.add(5);

        LinkedIntListExercise3 testList = new LinkedIntListExercise3();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(3);

        System.out.println("Non-sorted list: " + nonSortedList + nonSortedList.isSorted());
        System.out.println("Sorted list: " + sortedList + sortedList.isSorted());
        System.out.println("Testlist: " + testList + testList.isSorted());
    }

}
