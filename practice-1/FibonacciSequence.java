public class FibonacciSequence {
  public static void main(String[] args) {
    int target = 5;
    if (target >= 0) {
      int result = calcurationFibonacciSequence(target);
      System.out.println(result);
    }else {
      System.out.println("負の数は指定できません");
    }
  }
  public static int calcurationFibonacciSequence(int target) {
    if (target == 0) {
      return 0;
    }else if (target == 1) {
      return 1;
    }else {
      int num1 = 0;
      int num2 = 1;

      for (int i = 3; i < target + 1; i ++) {
        int tmp = num1;
        num1 = num2;
        num2 = tmp + num2;
      }
      return num2;
    }
  }
}