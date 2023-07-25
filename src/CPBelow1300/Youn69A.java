package CPBelow1300;

import java.util.Scanner;

public class Youn69A {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int[][] st = new int[t][3];
            int []sum = new int[3];

            for(int i = 0 ; i<t ; i++){
                for(int j = 0 ; j<3 ; j++){
                    st[i][j] = sc.nextInt();
                    sum[j] += st[i][j];
                }
            }

            if (sum[0] == 0 && sum[1]==0 && sum[2]==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            sc.close();
        }

}
