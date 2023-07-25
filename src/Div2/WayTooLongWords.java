package Div2;

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i<n ; i++){
            String s = sc.next();

            if(s.length() > 10) {
                StringBuilder str = new StringBuilder();

                str.append(s.charAt(0));
                str.append(s.length() - 2);
                str.append(s.charAt(s.length() - 1));

                System.out.println(str.toString());
            }else{
                System.out.println(s);
            }
        }
    }
}
