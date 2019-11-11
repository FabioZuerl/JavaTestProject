package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.push("Fred");
        names.push("Peter");
        names.push("Michi");

        ListIterator<String> it = names.listIterator();

        names.add(2,"Felix");

        for(String s: names){
            System.out.println(s);
        }
    }
}
