public class Main {
    public static void main(String[] args) {

        int account = 100;
        int refillAmount = 499;
        int bonus;
        if (refillAmount > 1_000) {
            bonus = refillAmount / 100;
            account = account + refillAmount + bonus;
        } else {
            bonus = 0;
            account = account + refillAmount;
        }

        System.out.println("Вы пополнили счет на " + refillAmount + " рублей.");
        System.out.println("Сумма бонусов составила " + bonus + " рублей.");
        System.out.println("На вашем счету " + account + " рублей.");
    }
}