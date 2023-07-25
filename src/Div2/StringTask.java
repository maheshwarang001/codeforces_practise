package Div2;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toLowerCase();

        StringBuilder str = new StringBuilder();
        for(char ch : word.toCharArray()){

            if(ch!='a' && ch!='o' && ch!='y' && ch!='e' && ch!='u' && ch!='i'){
                str.append(".");
                str.append(ch);
            }
        }
        System.out.println(str.toString());

        sc.close();
    }
}
