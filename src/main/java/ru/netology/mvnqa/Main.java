package ru.netology.mvnqa;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Общая сумма продаж: " + StatsService.calculateTotalSales(salesData));
        System.out.println("Средняя сумма продаж в месяц: " + StatsService.calculateAverageMonthlySales(salesData));
        System.out.println("Месяц с минимальной суммой продаж: " + StatsService.findMinMonthIndex(salesData));
        System.out.println("Количество месяцев с продажами ниже среднего: " + StatsService.countMonthsBelowAverage(salesData));
        System.out.println("Количество месяцев с продажами выше среднего: " + StatsService.countMonthsAboveAverage(salesData));
        //System.out.println("Месяц с максимальной суммой продаж: " + StatsService.findMaxMonthIndex(salesData));
        List<Integer> maxMonths = StatsService.findAllMaxMonthIndices(salesData);
        System.out.print("Месяцы с максимальной суммой продаж: ");
        for (Integer month : maxMonths) {
            System.out.print(month + " "); // Выведет: 6 8
        }

    }
}
