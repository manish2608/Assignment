/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANISH KUMAR
 */
import java.util.Scanner;
public class sum_even {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:-");
        int N=sc.nextInt();
        int EvenSum=0;
        int i;
        for(i=1;i<=N;i++)
        {
          if(i%2==0)
          {
              EvenSum=EvenSum+i;              
          }
        }
        System.out.println("Sum of even number:-"+EvenSum);
    }
}
