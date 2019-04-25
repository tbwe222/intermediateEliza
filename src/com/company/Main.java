package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        boolean done = false;
        System.out.print("Good day. What is your problem? ");
        while(!done){
            System.out.print( "Enter your response here or Q to quit:");
            String response = scan.nextLine();
            String[] str = response.split(" ");

            if(response.equalsIgnoreCase("q")){
                done = true;

                System.out.println(">>> end");
            }
            else {
                for(int i =0; i<str.length;i++){
                    if(str[i].equalsIgnoreCase("i"))
                        str[i]="you";
                    else if (str[i].equalsIgnoreCase("me"))
                        str[i] ="you";
                    else if (str[i].equalsIgnoreCase("my"))
                        str[i] = "your";
                    else if (str[i].equalsIgnoreCase("am"))
                        str[i] = "are";
                    else
                        str[i]=str[i];
                    System.out.print(str[i] + " ");
                }
                System.out.println("?");
                done = false;

            }
        }
    }
}