public class StringCount {
    public static String stringCount() {
        StringBuilder string = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            string.append(i).append("Hello");
        }
        return string.toString();
    }

    public static void main(String[] args) {
        String result = stringCount();
        System.out.println(result.substring(100, 175));
    }
}