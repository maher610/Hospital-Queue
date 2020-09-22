/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalqueuingsystem;

/**
 *
 * @author faiya
 */
public class Queue {

    int maxSize;
    int half;
    int head1;
    int tail1;
    int head2;
    int tail2;
    Patient[] arr1;
    Patient[] arr2;

    public Queue(int n) {
        maxSize = n;
        half = n / 2;
        head1 = 0;
        tail1 = 0;
        head2 = 0;
        tail2 = 0;
        arr1 = new Patient[maxSize];
        arr2 = new Patient[maxSize];
    }

    //methods inside Queue
    public boolean areBothQempty() {              //if Queues are empty, It will show 'true', otherwise shows 'false'.
        return tail1 == 0 && tail2 == 0;
    }

    public void enqueue(Patient patient) {        // Patients queuing up 
        if (tail1 <= half) {
            arr1[tail1] = patient;
            tail1++;
        } else if (tail1 > half && tail2 <= half) {
            arr1[tail1] = patient;
            arr2[tail2] = arr1[tail1 - 1];
            arr1[tail1 - 1] = arr1[tail1];
            arr1[tail1] = null;
            tail2++;
        } else if (tail2 > half && tail2 == tail1) {
            arr2[tail2] = patient;
            tail1++;
        } else if (tail2 > half && tail2 < tail1) {
            arr1[tail1 - 1] = patient;
            tail2++;

        } else {
            System.out.println("Queue is Full....");

        }
    }

    public void dequeue() {                      // Doctors treating patient 
        if (areBothQempty()) {
            System.out.println("Queue is empty....");
        } else {
            if (tail1 > maxSize - 5 && tail2 == maxSize) {
                for (int i = 0; i < tail1 - 1; i++) {
                    arr1[i] = arr1[i + 1];

                }
                arr1[tail1 - 1] = null;
                tail1--;
            } else if (tail1 == maxSize - 5 && tail2 > maxSize - 5) {
                for (int i = 0; i < tail2 - 1; i++) {
                    arr2[i] = arr2[i + 1];

                }
                arr2[tail2 - 1] = null;
                tail2--;
            } else if (tail2 < maxSize - 5 && tail2 < tail1) {
                for (int i = 0; i < tail1 - 1; i++) {
                    arr1[i] = arr1[i + 1];
                }
                arr1[tail1 - 1] = null;
                tail1--;
            } else if (tail2 != maxSize && tail2 == tail1) {
                for (int i = 0; i < tail2 - 1; i++) {
                    arr2[i] = arr2[i + 1];

                }
                arr2[tail2 - 1] = null;
                tail2--;
                for (int i = 0; i < tail1 - 1; i++) {
                    arr1[i] = arr1[i + 1];
                }
                arr1[tail1 - 1] = null;
                tail1--;
            }
        }
    }

    public void displayBothQ() {                            //Displays patients
        System.out.println("--Queue 1 ---------------- Queue 2--");
        System.out.println("");
        for (int i = 0; i < maxSize; i++) {
            System.out.println(arr1[i] + "                  " + arr2[i]);
        }
        System.out.println("-------------End of Queue-------------");
        System.out.println("");
        System.out.println("");
    }

    public void displayBothQinfo() {                        //Displays patients' info
        System.out.println("By Gender");
        System.out.println("--Queue 1 -------------- Queue 2--");
        System.out.println("");
        for (int i = 0; i < maxSize; i++) {
            System.out.println(arr1[i].getGender() + "                  " + arr2[i].getGender());
        }
        System.out.println("------------End of Queue------------");
        System.out.println("");
        System.out.println("");

        System.out.println("By Age");
        System.out.println("--Queue 1 -------------- Queue 2--");
        System.out.println("");
        for (int i = 0; i < maxSize; i++) {
            System.out.println(arr1[i].getAge() + "                  " + arr2[i].getAge());
        }
        System.out.println("------------End of Queue------------");
        System.out.println("");
        System.out.println("");

        System.out.println("By Illness");
        System.out.println("--Queue 1 ---------------- Queue 2--");
        System.out.println("");
        for (int i = 0; i < maxSize; i++) {
            System.out.println(arr1[i].getIllness() + "                  " + arr2[i].getIllness());
        }
        System.out.println("------------End of Queue------------");
        System.out.println("");
        System.out.println("");
    }
}
