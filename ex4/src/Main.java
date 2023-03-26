public class Main {
    public static void main(String[] args) {
        int num = 12;

        if (num < 0) {
            System.out.println("O número digitado não é um inteiro positivo.");
            return;
        }
        System.out.println("Os núemros pares entre 1 e o múmero digitado são:");
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
