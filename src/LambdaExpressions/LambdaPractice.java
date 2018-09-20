package LambdaExpressions;

import java.util.function.IntFunction;

public class LambdaPractice {

    public static void main(String[] args) {

        IntFunction incrementBy2 = x -> x + 2;
        System.out.println(incrementBy2.apply(12));
        System.out.println();
        
        // apply is executed first (x -> x); then the increment operator is applied.
        IntFunction incrementBy1 = x -> x++;
        System.out.println(incrementBy1.apply(12));
        System.out.println();
        
        // increment operator is applied first, then apply is executed
        IntFunction incrementBy1Version2 = x -> ++x;
        System.out.println(incrementBy1Version2.apply(12));
        System.out.println();
        // BE CAREFUL USING ++.  Use x = x + 1 unless the increment 
        // operation is isolated from other operations.
        
        IntFunction threeOrFour = x -> {
            if (x == 3) {
                return "three";
            } else if (x == 4) {
                return "four";
            } else {
                return "other";
            }
        };
        
        System.out.println(threeOrFour.apply(4));
        System.out.println(threeOrFour.apply(1));
        System.out.println(threeOrFour.apply(3));
        System.out.println();
        
    }
}
