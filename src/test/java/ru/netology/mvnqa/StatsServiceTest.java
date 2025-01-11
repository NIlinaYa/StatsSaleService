package ru.netology.mvnqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
        // Общая сумма продаж
    void testCalculateTotalSales() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 180;

        int actualResult = StatsService.calculateTotalSales(monthlySales);
        assertEquals(expectedResult, actualResult);
    }

    @Test
        // Средняя сумма продаж в месяц
    void testCalculateAverageMonthlySales() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 15;

        int actualResult = StatsService.calculateAverageMonthlySales(monthlySales);

        assertEquals(expectedResult, actualResult);
    }

    @Test
        // Месяц с максимальной суммой продаж
    void testFindMaxMonthIndex() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 8;

        int actualResult = StatsService.findMaxMonthIndex(monthlySales);

        assertEquals(expectedResult, actualResult);
    }

    @Test
        // месяц с минимаьной продажей
    void testFindMinMonthIndex() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 9;

        int actualResult = StatsService.findMinMonthIndex(monthlySales);

        assertEquals(expectedResult, actualResult);
    }


    @Test
        //количество месяцев с продажами ниже среднего
    void testCountMonthsBelowAverage() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 5;

        int actualResult = StatsService.countMonthsBelowAverage(monthlySales);

        assertEquals(expectedResult, actualResult);
    }


    @Test
        //количество месяцев с продажами выше среднего
    void testCountMonthsAboveAverage() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 5;

        int actualResult = StatsService.countMonthsAboveAverage(monthlySales);

        assertEquals(expectedResult, actualResult);
    }


}


