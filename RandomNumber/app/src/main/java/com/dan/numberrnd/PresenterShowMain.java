package com.dan.numberrnd;

import java.util.Random;

public class PresenterShowMain {

    private RandomizerNum randomizerNum;
    Random random;

    public PresenterShowMain(RandomizerNum randomizerNum) {
        this.randomizerNum = randomizerNum;
    }


    public interface RandomizerNum {
        void getRndNum(int min, int max);
    }
}
