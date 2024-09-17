/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usenumtotext;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số từ bàn phím
        System.out.print("Nhập một số nguyên không âm: ");
        long number = scanner.nextLong();
        
        // Gọi hàm chuyển đổi số thành chữ
        String result = Number.convert(number);
        
        // In kết quả
        System.out.println("Chuỗi: " + result);
        
        // Đóng Scanner
        scanner.close();
    }
}
