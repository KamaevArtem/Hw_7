public class Main {
    public static void main(String[] args) {
        //Задача 1
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000){
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей" );
        }
        //Задача 2
        int numberOne = 0;
        while (numberOne < 10){
            numberOne++;
            System.out.print(numberOne + " ");
        }
        System.out.println();
        for (i = 10; i>0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача 3
        int y = 12_000_000;
        int birthRatePer = 17;
        int mortalPer = 8;
        int year = 2024;
        int ratioPopulation = 1000;
        for (int yearNow = year; yearNow < year + 10; yearNow++ ){
            y = y + ((y / ratioPopulation) * birthRatePer) - ((y / ratioPopulation) * mortalPer);
            System.out.println("Год " + yearNow + ", численность населения составляет " + y);
        }
        //Задача 4
        int percentContribution = 7;
        int contribution = 15_000;
        int month = 0;
        while (contribution < 12_000_000){
            month++;
            contribution = contribution + contribution/100*percentContribution;
            System.out.println("Месяц " + month + ", сумма накоплений " + contribution);
        }
        //Задача 5
        contribution = 15_000;
        month = 0;
        while (contribution < 12_000_000){
            month++;
            contribution = contribution + contribution/100*percentContribution;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений " + contribution);
            }
        }
        System.out.println("Месяц " + month + ", сумма накоплений " + contribution);
        //Задача 6
        contribution = 15_000;
        month = 0;
        int quantityMonthInYear = 12;
        int quantityYear = 9;
        int quantityTotalMonth = quantityMonthInYear * quantityYear;
        while (month <= quantityTotalMonth){
            month++;
            contribution = contribution + contribution/100*percentContribution;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений " + contribution);
            }
        }
        //Задача 7
        int friday = 5;
        while (friday <=31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        //Задача 8
        int yearCount = 0;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        while (yearCount <= yearAfter){
            yearCount += 79;
            if (yearCount >= yearBefore){
                System.out.println(yearCount);
            }
        }


    }
}