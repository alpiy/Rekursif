/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmarekursif;

/**
 *
 * @author Iis
 */
public class Factorial {
    public static void main(String[] args) {
        int hasil = rekursif(4);
        System.out.print(hasil);
    }
    public static Integer rekursif(int n){
    if(n == 0 || n == 1){
    return 1;
    }else{
    return n * rekursif(n-1);
    }
    }
}

