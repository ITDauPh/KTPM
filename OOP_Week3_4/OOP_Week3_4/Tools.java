package OOP_Week3_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
    import java.util.Scanner;
public class Tools {



    public static boolean isPrime(double oneNumber){
        if (oneNumber <=1){
        return false;
        }
        for(int i = 2;i<= Math.sqrt(oneNumber);i++){
        if(oneNumber%i==0){ 
            return false;
        }
    }
        return true;
    }
    public static String nhapChuoi(String bien)
    {
        Scanner scanner=new Scanner(System.in);
        bien= scanner.nextLine();
        return bien;
    }
      public static int nhapInt(int bien)
    {
        Scanner scanner=new Scanner(System.in);
         bien= scanner.nextInt();
        return bien;
    }
      public static boolean checkDay(int date){
          if(0<date && date<32)
          {
            return true;   
          }
        return false;
      }
      public static boolean checkMonth(int date){
          if(0<date && date<13)
          {
            return true;   
          }
        return false;
      }
      public static boolean checkYear(int date){
          if(1900<date && date<9999)
          {
            return true;   
          }
        return false;
      }
    
}
