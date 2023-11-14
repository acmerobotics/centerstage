package org.com.acmerobotics.opmodes.auto;

public class Main {
    public static void main(String[] arg){
        isTen(11);
    }
    static boolean isTen(int age){
        if(age == 10){
            System.out.print("Person is greater than ten");
        }
        return true;
    }
}
