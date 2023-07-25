package BinaryExponentional;

public class BitwiseUnique {


        public static void main(String[] args) {
            int[] nums = {3,4,1,4,2,3,2,1,5};
            System.out.println(unique(nums));
        }

        public static int unique(int[] nums) {
            int unique = 0;

            for (int i : nums) {
                unique ^= i;
            }
            return unique;
        }

}
