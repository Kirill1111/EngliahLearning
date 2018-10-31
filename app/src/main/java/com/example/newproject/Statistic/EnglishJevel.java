package com.example.newproject.Statistic;

public class EnglishJevel {
    private enum Level {
        A0, A1, A2, B1, B2, C1, C2
    }

    private Level level = Level.A1;

    public void NextLevel() {
        if (level.ordinal() <= 5) {
            level = Level.values()[level.ordinal()];
        }
    }

    public boolean isMaxLvl() {
        if (level.ordinal() <= 5)
            return false;
        else
            return true;
    }

}
