public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке.");
        if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке.");
//--------------------------------------------------------------
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке.");
        if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке.");
        if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
//--------------------------------------------------------------
        System.out.println("Задание 3");

        int year = 2100;
        if (year % 400 == 0 ||(year % 100!=0 && year % 4 ==0)) {System.out.println (year + " является високосным");}
            else {System.out.println (year + " не является високосным");}

//--------------------------------------------------------------
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance <20 ) deliveryDays =1;
        if (deliveryDistance >= 20 && deliveryDistance <60 ) deliveryDays =2;
        if (deliveryDistance >= 60 && deliveryDistance <100 ) deliveryDays =3;
        System.out.println("Потребуется дней: " + deliveryDays);

        //--------------------------------------------------------------
        System.out.println("Задание 5");
        int monthNumber = 12;
        String season = "";

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зимушка-зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неправильный месяц";
        }
        System.out.println(season);
    }
}