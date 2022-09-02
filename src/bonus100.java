public class bonus100 {
    public static void main(String[] args) {

        int balance = 100;// исходная сумма на счету
        int x = 100; // стоимость одного бонусного рубля
        int amount = 1200;
        if (amount > 1000) {
            int bonus = amount / x;

        System.out.println( "Количество бонусных рублей: " + bonus);
        int total = amount + balance + bonus;
        System.out.println("Итоговый баланс: "+ total );}

        else {int total = amount+balance;
            System.out.println("Итоговый баланс: "+ total );}

    }
}


