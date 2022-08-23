public class Main {
    public static void main(String[] args) {
        //Exercise 1
        byte clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Exercise 2
        byte clientOS2 = 0;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS2 == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS2 == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(clientOS2 == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Exercise 3
        int year =2500;
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear)
        {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Exercise 4
        int deliveryDistance = 59;
        if(deliveryDistance <20){
            System.out.println("Потребуется 1 день");
        }else if(deliveryDistance >=20 && deliveryDistance <60){
            System.out.println("Потребуется 2 дня");
        }else if(deliveryDistance >=60 && deliveryDistance <100){
            System.out.println("Потребуется 3 дня");
        }

        //Exercise 5
        byte monthNumber = 16;

        switch (monthNumber) {
            case (12):
            case (1):
            case (2):
                System.out.println("Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Осень");
                break;
            default:
                System.out.println("неверное значение месяца");
                break;
        }

        //DOP Exercise 1
        int age = 19;
        int salary = 108000;
        int ageCount = 0;
        int salaryCount = 0;
        if (age >= 23){
            ageCount = 3 * salary;
        }else{
            ageCount = 2 * salary;
        }
        if (salary >= 80000){
            salaryCount = (int) (1.5 * ageCount);
        }else if(salary >= 50000){
            salaryCount = (int) (1.2 * ageCount);
        }else{
            salaryCount = ageCount;
        }

        System.out.println("«Мы готовы выдать вам кредитную карту с лимитом "+salaryCount+" рублей».");

        //Dop Exercise 2
        int age2 = 31;
        int salary2 = 81000;
        int wantedSum = 330000;
        float basePer = 10f;
        int monthCredit = 12;

        if (age2 < 23){
            basePer = basePer + 1;
        }else if (age2 < 30){
            basePer = basePer + 0.5f;
        }
        if(salary2 > 80000){
            basePer = basePer - 0.7f;
        }
        float monthPay = (wantedSum+ (wantedSum * basePer / 100)) / 12;
        float monthPaySalary = salary2 / 2;
        if(monthPaySalary >= monthPay){
            System.out.println("Максимальный платеж при ЗП "+salary2 +" равен "+ monthPaySalary+" рублей. Платеж по кредиту "+ monthPay+" рублей. Одобрено.");
        }else{
            System.out.println("Максимальный платеж при ЗП "+salary2 +" равен "+ monthPaySalary+" рублей. Платеж по кредиту "+ monthPay+" рублей. Отказанно.");
        }

    }
}