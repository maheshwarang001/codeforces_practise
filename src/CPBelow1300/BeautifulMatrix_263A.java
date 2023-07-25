package CPBelow1300;

import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] grid = new int[5][5];

       for(int i = 0 ; i< 5 ; i++){
           for (int j = 0 ; j<5 ; j++){
               grid[i][j] = sc.nextInt();
           }
       }

       int row = -1 , col = -1;

       for(int i = 0 ; i< 5 ; i++){
           for(int j = 0; j< 5 ; j++){
               if(grid[i][j] == 1){
                   row = i;
                   col = j;
                   break;
               }
           }
       }

       int steps = Math.abs(row-2) + Math.abs(col-2);
        System.out.println(steps);
    }
}
