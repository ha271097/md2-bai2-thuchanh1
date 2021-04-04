
package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        boolean check =true;
        if(num == 1 || num == 2){
            System.out.println(" this is SNT");
        }
        else if(num<=0){
            System.out.println(" this is not SNT");
        }
        boolean checking=true;
        for( int i =2 ; i<= Math.sqrt(num) ; i++ ){
            if(num%i==0) {
                checking=false;
                break;
            }
        }
        if(checking) {
            System.out.println("this is SNT");
        }
        else {
            System.out.println("this is not SNT");
        }
    }
}



