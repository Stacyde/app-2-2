public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int rub = 1000;
        int bonus;
        if (rub >= 1000) {
             bonus = rub / 100;
        } else {
             bonus = 0;
        }
        float sum = rub + bonus + balance;
        System.out.println("Бонус равен = " + bonus);
        System.out.println("Итоговая сумма на счету клиента = " + sum);
    }
}