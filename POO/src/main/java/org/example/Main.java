package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int suma = suman(10);
        System.out.println(suma);

    }
    public static int suman(int n){
        if(n<1){
            return 0;

        }else {
            return  n + suman(n -1);
        }
    }
}
