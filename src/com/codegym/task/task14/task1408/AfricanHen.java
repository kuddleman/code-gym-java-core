package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.AFRICA, getMonthlyEggCount());
    }

    @Override
    int getMonthlyEggCount() {
        return 11;
    }
}

