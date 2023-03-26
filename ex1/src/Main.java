public class Main {
    public static void main(String[] args) {
        int num = 25;
        int soma = 0;

        if (num < 0) {
            System.out.println("O número digitado não é um inteiro positivo.");
            return;
        }
        int i = 1;
        while (i <= num) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos números naturais até " + num + " é " + soma);
    }
}
