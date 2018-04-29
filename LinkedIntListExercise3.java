package Kap16Exercise3;

import java.util.NoSuchElementException;

public class LinkedIntListExercise3
{
// Simple first version of LinkedIntListExercise5 with just a constructor
// and methods for add and toString.
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntListExercise3() {
        front = null;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    private ListNode nodeAt(int index)
    {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Metoden til opgave 1
    public void set(int index, int value)
    {
        ListNode current = nodeAt(index);
        current.data = value;
    }

    // Metoden til opgave 2
    public int max(LinkedIntListExercise3 list)
    {
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            int max = front.data;
            ListNode current = front.next;

            while (current != null)
            {
                if (current.data > max)
                {
                    max = current.data;
                }
                current = current.next;
            }
            return max;
        }
    }

    //Metode til opgave 3
    public boolean isSorted()
    {
        boolean tempBoolean = true;

        ListNode current = front;
        ListNode temp = current.next;

        while (current.next != null)
        {
            if (current.data > temp.data)
            {
                tempBoolean = false;
            }
            current = temp;
            temp = current.next;
        }
        return tempBoolean;
    }
}


