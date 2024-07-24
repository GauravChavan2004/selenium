/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.firstproject;

/**
 *
 * @author HP
 */
public class FirstProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FirstProject a=new FirstProject();
        a.display(15);
    }
    void display(int a){
        if(a%2==0){
            System.out.println(a+" is a Even Number");
        }
        else{
            System.out.println(a+" is a Odd Number");
        }
    }
}
