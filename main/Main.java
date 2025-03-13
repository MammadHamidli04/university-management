package main;

import model.person.Staff;

public class Main {
    public static void main(String[] args) throws Exception {
        Staff s = new Staff(-1, null, null);
        System.out.println(s.toString());
    }
}
