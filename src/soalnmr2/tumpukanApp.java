/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalnmr2;

/**
 *
 * @author Esti Restia Ningrum
 */
public class tumpukanApp {
     public static void main (String [] args) {
        tumpukan tumpukan= new tumpukan(10);
        tumpukan.push(47);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        long nilaitop = tumpukan.peek();
        System.out.println("nilai teratas = "+ nilaitop);
        System.out.println("Prisma Alamsyah");
        long nilaipop = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+ nilaipop);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
        
      }
        
}
}
