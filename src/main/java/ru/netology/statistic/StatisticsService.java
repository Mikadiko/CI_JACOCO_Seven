package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) { // ищем максимальное значение доходов
        long currentMax = incomes[0]; // первоночальное максимальное
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}
