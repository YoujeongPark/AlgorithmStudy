import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        for(int l =0 ; l<b ; l++ ){

            for(int m =0; m<a ; m++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }

}