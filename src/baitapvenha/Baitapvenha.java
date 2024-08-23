/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapvenha;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Baitapvenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a= ");
        int a = sc.nextInt();
        System.out.println("Nhap so b= ");
        int b = sc.nextInt();
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a/b= "+((double)a/b));
        System.out.println("a%b="+(a%b));
    }
    
}
