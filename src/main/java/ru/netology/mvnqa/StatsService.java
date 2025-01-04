package ru.netology.mvnqa;
import java.util.ArrayList;
import java.util.List;

public class StatsService {
        // Метод для расчета общей суммы продаж за год
        public static double calculateTotalSales(double[] monthlySales) {
            double total = 0;
            for (double sale : monthlySales) {
                total += sale;
            }
            return total;
        }

        // Метод для расчета средней суммы продаж в месяц
        public static double calculateAverageMonthlySales(double[] monthlySales) {
            if (monthlySales.length == 0) {
                return 0; // В случае пустого массива возвращаем 0
            }

            double total = calculateTotalSales(monthlySales);
            return total / monthlySales.length;
        }

        // Метод для нахождения номера месяца с максимальной суммой продаж
        public static int findMaxMonthIndex(double[] monthlySales) {
            if (monthlySales.length == 0) {
                return -1; // Если массив пустой, возвращаем -1
            }

            int maxIndex = 0;
            for (int i = 1; i < monthlySales.length; i++) {
                if (monthlySales[i] > monthlySales[maxIndex]) {
                    maxIndex = i;
                }
            }
            return maxIndex + 1; // Нумерация месяцев начинается с 1
        }

    // Метод для нахождения номеров месяцев с максимальной суммой продаж
    public static List<Integer> findAllMaxMonthIndices(double[] monthlySales) {
        if (monthlySales.length == 0) {
            return new ArrayList<>(); // Если массив пустой, возвращаем пустой список
        }

        double maxValue = monthlySales[0];
        List<Integer> maxIndices = new ArrayList<>();

        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] > maxValue) {
                maxValue = monthlySales[i]; // Обновляем максимальное значение
                maxIndices.clear(); // Очищаем список, так как нашли новый максимум
                maxIndices.add(i + 1); // Добавляем текущий индекс в список
            } else if (monthlySales[i] == maxValue) {
                maxIndices.add(i + 1); // Если равенство, добавляем еще один индекс
            }
        }

        return maxIndices;
    }

        // Метод для нахождения номера месяца с минимальной суммой продаж
        public static int findMinMonthIndex(double[] monthlySales) {
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
        public static int countMonthsBelowAverage(double[] monthlySales) {
            if (monthlySales.length == 0) {
                return 0; // Если массив пустой, возвращаем 0
            }

            double average = calculateAverageMonthlySales(monthlySales);
            int count = 0;
            for (double sale : monthlySales) {
                if (sale < average) {
                    count++;
                }
            }
            return count;
        }

        // Метод для подсчета количества месяцев, где продажи были выше среднего значения
        public static int countMonthsAboveAverage(double[] monthlySales) {
            if (monthlySales.length == 0) {
                return 0; // Если массив пустой, возвращаем 0
            }

            double average = calculateAverageMonthlySales(monthlySales);
            int count = 0;
            for (double sale : monthlySales) {
                if (sale > average) {
                    count++;
                }
            }
            return count;
        }
    }

