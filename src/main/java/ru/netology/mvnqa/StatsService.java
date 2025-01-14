package ru.netology.mvnqa;

import java.util.ArrayList;
import java.util.List;

//переменную определяем как long, в int массивы могут не поместиться
public class StatsService {
    // Метод для расчета общей суммы продаж за год
    public static long calculateTotalSales(long[] monthlySales) {
        long total = 0;
        for (long sale : monthlySales) { //  запись для цикла  по i
            total += sale;
        }
        return total;
    }

    // Метод для расчета средней суммы продаж в месяц
    public static long calculateAverageMonthlySales(long[] monthlySales) {
        if (monthlySales.length == 0) {
            return 0; // В случае пустого массива возвращаем 0
        }
        long total = calculateTotalSales(monthlySales); //вызвали метод описанный выше
        return total / monthlySales.length;
    }

    // Метод для нахождения номера месяца с максимальной суммой продаж
    public static int findMaxMonthIndex(long[] monthlySales) { //номер месяца можно уместить в int, а массив надо упаковывать в long
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
    public static int findMinMonthIndex(long[] monthlySales) {
        if (monthlySales.length == 0) {
            return -1; // Если массив пустой, возвращаем -1
        }

        int minIndex = 0; // номер месяца с минимальными продажами
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] <= monthlySales[minIndex]) { // ставим <=  если  нужно найти  именно последний месяц.  если нужен  первый месяц, то ставим строгое неравенство <, найдет похожий или меньшее значение,  запомнит его номер в массиве
                minIndex = i;
            }
        }
        return minIndex + 1; // Нумерация месяцев начинается с 1
    }

    // Метод для подсчета количества месяцев, где продажи были ниже среднего значения
    public static int countMonthsBelowAverage(long[] monthlySales) {
        if (monthlySales.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }

        long average = calculateAverageMonthlySales(monthlySales);
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] < average) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета количества месяцев, где продажи были выше среднего значения
    public static long countMonthsAboveAverage(long[] monthlySales) {
        if (monthlySales.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }

        long average = calculateAverageMonthlySales(monthlySales);
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] > average) {
                count++;
            }
        }
        return count;
    }
}

