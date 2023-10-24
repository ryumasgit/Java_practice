public class SheepCount {
    public static String sheepCount() {
        StringBuilder sheep = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sheep.append(i).append("SHEEP");
        }
        return sheep.toString();
    }

    public static void main(String[] args) {
        String result = sheepCount();
        System.out.println(result.substring(55555, 55575));
    }
}