/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.zhugui1;

/**
 *
 * @author Ryan Zhu
 */
import java.util.Scanner;

public class InputMaster {
    public static int getInt() {
    Scanner sc = new Scanner(System.in);
    while (!sc.hasNextInt()) {
        System.out.println("Int: ");
        sc.next();
    }
    return sc.nextInt();
    }
}
