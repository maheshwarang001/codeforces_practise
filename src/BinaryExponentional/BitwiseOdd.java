package BinaryExponentional;

public class BitwiseOdd {

    public static void main(String[] args) {

        int x = 37;

        if ((x & 1) == 1) {
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
