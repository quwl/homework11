public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2025;
        leapYear(year);

        System.out.println("Task 2");
        int clientOs = 0;
        int clientDeviceYear = 2015;
        whatToInstall(clientOs, clientDeviceYear);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);
    }

    public static void leapYear(int i) {
        if ((i % 4 == 0 || i % 400 == 0) && i % 100 != 0) {
            System.out.println("Год " + i + " — високосный год");
        } else {
            System.out.println("Год " + i + " — не високосный год");
        }
    }

    public static void whatToInstall(int a, int b) {
        if (a == 0 && b < 2015 && b > 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (b >= 2015 && a == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            return;
        }
        if (a == 1 && b < 2015 && b > 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (b >= 2015 && a == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректный год/операционная система");
        }
    }

    public static void deliveryTime(int c) {
        if (c <= 20 && c > 0) {
            c = 1;
            System.out.println("Потребуется дней: " + c);
            return;
        }
        if (c > 20 && c <= 60) {
            c = 2;
            System.out.println("Потребуется дней: " + c);
            return;
        }
        if (c > 60 && c <= 100) {
            c = 3;
            System.out.println("Потребуется дней: " + c);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}