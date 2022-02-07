//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String yearExp = sc.next();
        String cuisine = sc.next();

        // put your code here
        System.out.println("The form for " + name
                + " is completed. We will contact you if we need a chef who cooks " + cuisine
                + " dishes and has " + yearExp + " years of experience.");
    }
}
