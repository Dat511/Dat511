/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaipt;

/**
 *
 * @author Admin
 */
public class PTB1 {
     double a;
    double b;
    
    public void updateA(double k){
        a = k;
    }
    public void updateB(double k){
        b = k;
    }
    public void updateAB(double m, double  n){
        this.a = m;
        this.b = n;
    }
    public String sole(boolean displayResult) {
        String Result = a+"x +"+b+"=0";
        if(a==0){
            if (b == 0){
                Result += "PT vo so nghiem";
            }else{
                Result += "PT vo nghiem";
            }
        }else {
            double x = -b/a;
            Result += "\n nghiem của PT là x ="+x;
        }
            if(displayResult){
                System.out.println(Result);
            }
            return Result;
    }
    
    public String display(boolean  displayResult){
        String result =  a+"x +"+b+"=0";
        if(displayResult){
            System.out.println(result);
        }
        return result;
        
    }
    
}
