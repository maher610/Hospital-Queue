/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalqueuingsystem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class Main {

    public static void main(String[] args) {
        Random inf = new Random();                  //for generating patient info.
        Scanner in = new Scanner(System.in);        //for getting the number of patients from the User.

        System.out.print("Number of Patients: ");
        int p = in.nextInt();

        String illnessnames[] = {"Flu", "Headache", "Cough", "Fever", "Injury"};
        String g[] = {"M", "F"};
        Queue p1 = new Queue(p / 2);                  //Size of one queue.
        for (int i = 1; i <= p; i++) {              //Loop for adding patients and their information in the queue
            p1.enqueue(new Patient(i, inf.nextInt(101),
                    g[inf.nextInt(g.length)],
                    illnessnames[inf.nextInt(illnessnames.length)]));
        }

        p1.displayBothQ();

        System.out.println(p1.areBothQempty());
        System.out.println("");

        p1.displayBothQinfo();

        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();
        p1.dequeue();
        p1.displayBothQ();

        p1.dequeue();

        System.out.println(p1.areBothQempty()); 

    }
}
