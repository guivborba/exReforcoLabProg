public class Main{
    public static void main(String[] args) {
        int num = 2;

        if (num < 0) {
            System.out.println("O número digitado não é um inteiro positivo.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
