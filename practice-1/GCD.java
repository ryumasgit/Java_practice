import java.util.ArrayList;
import java.util.List;

public class GCD {
    public static void main(String[] args) {
        int target1 = 654;
        int target2 = 754;

        int maxNum = findGCD(target1, target2);
        if (maxNum != -1) {
          System.out.println(maxNum);
        }else {
          System.out.println("公約数はありません");
        }
    }

    public static int findGCD(int target1, int target2) {
        List<Integer> divisors = new ArrayList<>();

        int minNum = Math.min(target1, target2);

        for (int i = 2; i <= minNum; i++) {
            if (target1 % i == 0 && target2 % i == 0) {
                divisors.add(i);
            }
        }

        if (divisors.isEmpty()) {
            return -1;
        }

        return java.util.Collections.max(divisors);
    }
}