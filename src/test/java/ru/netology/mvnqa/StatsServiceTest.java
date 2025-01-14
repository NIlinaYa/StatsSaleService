package ru.netology.mvnqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
        // Общая сумма продаж
    void testCalculateTotalSales() {
        // не вызываем тут метод  StatsService service = new StatsService(); - потому  что он в пакете -   см сроку 1
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedResult = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18; // проссумировали массив, по идее должно быть 180;

        long actualResult = StatsService.calculateTotalSales(monthlySales);
        assertEquals(expectedResult, actualResult);
    }

    @Test
        // Средняя сумма продаж в месяц
    void testCalculateAverageMonthlySales() {
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedResult = 15;

        long actualResult = StatsService.calculateAverageMonthlySales(monthlySales);

        assertEquals(expectedResult, actualResult);
    }

    @Test
        // Месяц с максимальной суммой продаж
    void testFindMaxMonthIndex() {
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 8;

        int actualResult = StatsService.findMaxMonthIndex(monthlySales);

        assertEquals(expectedResult, actualResult);
    }

    @Test
        // месяц с минимальной продажей
    void testFindMinMonthIndex() {
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 9;

        int actualResult = StatsService.findMinMonthIndex(monthlySales);

        assertEquals(expectedResult, actualResult);
    }


    @Test
        //количество месяцев с продажами ниже среднего
    void testCountMonthsBelowAverage() {
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 5;

        int actualResult = StatsService.countMonthsBelowAverage(monthlySales);

        assertEquals(expectedResult, actualResult);
    }


    @Test
        //количество месяцев с продажами выше среднего
    void testCountMonthsAboveAverage() {
        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 5;

        int actualResult = StatsService.countMonthsBelowAverage(monthlySales);

        assertEquals(expectedResult, actualResult);
    }


}


