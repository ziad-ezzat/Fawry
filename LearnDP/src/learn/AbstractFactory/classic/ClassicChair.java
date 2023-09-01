package learn.AbstractFactory.classic;

import learn.AbstractFactory.furniture.Chair;

public class ClassicChair extends Chair {
    @Override
    public void print() {
        System.out.println("classic chair");
    }
}
