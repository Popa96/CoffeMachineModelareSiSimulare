package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeMachine coffeMachine=new CoffeMachine();

	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("************Buna ziua***************");
        System.out.println("Introduceti credit: ");
        int i=0;
        while(i<=10)
        {
            i++;
            coffeMachine.executeTransition(in.next());
        }

    }
}
