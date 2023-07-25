package BinaryExponentional;

public class BinaryExp {

    public static void main(String[] args) {

        System.out.println(recur(2,2));


    }

    private static long recur(long a , long b){

        long ans = 1;

        while(b > 0){
            if((b&1) == 1){
                ans = ans * a;
            }
            a = a * a;
            b >>=1;
        }

        return ans;
    }

}
