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
public class Patient {

    int index;
    int age;
    String gender;
    String illness;

    public Patient() {
        this.index = 9999;
        this.age = 200;
        this.gender = "Unknown";
        this.illness = "Unknown";
    }

    public Patient(int index, int age) {
        this.index = index;
        this.age = age;
        this.gender = "Unknown";
        this.illness = "Unknown";
    }

    public Patient(int index, int age, String genderorillness) {
        this.index = index;
        this.age = age;
        if (genderorillness.length() > 1) {
            this.illness = genderorillness;
            this.gender = "Unknown";
        } else {
            this.gender = genderorillness;
            this.illness = "Unknown";
        }
    }

    public Patient(int index, int age, String gender, String illness) {
        this.index = index;
        this.age = age;
        this.gender = gender;
        this.illness = illness;
    }

    public Patient(int index) {
        this.index = index;
        this.age = 200;
        this.gender = "Unknown";
        this.illness = "Unknown";
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "Patient " + index;
    }

}
