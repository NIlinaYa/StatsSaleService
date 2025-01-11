package ru.netology.mvnqa;

import java.util.ArrayList;
import java.util.List;

public class StatsService {
    // Метод для расчета общей суммы продаж за год
    public static int calculateTotalSales(int[] monthlySales) {
        int total = 0;
        for (int sale : monthlySales) {
            total += sale;
        }
        return total;
    }

    // Метод для расчета средней суммы продаж в месяц
    public static int calculateAverageMonthlySales(int[] monthlySales) {
        if (monthlySales.length == 0) {
            return 0; // В случае пустого массива возвращаем 0
        }

        int total = calculateTotalSales(monthlySales);
        return total / monthlySales.length;
    }

    // Метод для нахождения номера месяца с максимальной суммой продаж
    public static int findMaxMonthIndex(int[] monthlySales) {
        if (monthlySales.length == 0) {
            return -1; // Если массив пустой, возвращаем -1
        }

        int maxIndex = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] >= monthlySales[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex + 1; // Нумерация месяцев начинается с 1
    }

    // Метод для нахождения номера месяца с минимальной суммой продаж
    public static int findMinMonthIndex(int[] monthlySales) {
        if (monthlySales.length == 0) {
            return -1; // Если массив пустой, возвращаем -1
        }

        int minIndex = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] < monthlySales[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex + 1; // Нумерация месяцев начинается с 1
    }

    // Метод для подсчета количества месяцев, где продажи были ниже среднего значения
    public static int countMonthsBelowAverage(int[] monthlySales) {
        if (monthlySales.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }

        int average = calculateAverageMonthlySales(monthlySales);
        int count = 0;
        for (int sale : monthlySales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета количества месяцев, где продажи были выше среднего значения
    public static int countMonthsAboveAverage(int[] monthlySales) {
        if (monthlySales.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }

        int average = calculateAverageMonthlySales(monthlySales);
        int count = 0;
        for (int sale : monthlySales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}

