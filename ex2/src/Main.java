public class Main {
    public static void main(String[] args) {
        int num = 7;

        if (num <= 1) {
            System.out.println(num + " não é um número primo.");
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}
