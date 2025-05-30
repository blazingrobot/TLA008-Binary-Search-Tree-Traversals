package com.mycompany.treey;

import java.util.Scanner;

public class Treey {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Baon per day (0 to stop): ");
            int baon = scan.nextInt();
            scan.nextLine(); 

            if (baon <= 0) {
                System.out.print("Show all baon? (Yes/No): ");
                String answer = scan.nextLine();
                
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("All of your Baon per day: ");
                    printDescending(tree);
                    System.out.println();
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Exiting...");
                    break;
                }
            }

            tree.insert(baon);
        }
    }

    
    public static void printDescending(BinaryTree tree) {
       preorder(tree.root);
    }
}
