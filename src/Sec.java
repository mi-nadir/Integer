public class Sec {
    public static void main(String[] args) {
        int second = 50000333;
        int days = second / (60*60*24);
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.println("Дней: "+days);
        System.out.println("Часов: "+hours);
        System.out.println("Минут: "+minutes);
        System.out.println("Секунд: "+second);
    }
}
