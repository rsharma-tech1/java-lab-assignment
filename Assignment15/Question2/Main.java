public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            result.append(i).append(",");
        }

        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }
}