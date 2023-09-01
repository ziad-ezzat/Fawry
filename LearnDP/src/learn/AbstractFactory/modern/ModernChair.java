package learn.AbstractFactory.modern;

import learn.AbstractFactory.furniture.Chair;

public class ModernChair extends Chair {

    @Override
    public void print() {
        System.out.println("modern chair");
    }
}
