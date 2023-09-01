package learn.AbstractFactory.Victorian;

import learn.AbstractFactory.furniture.Chair;

public class VictorianChair extends Chair {
    @Override
    public void print() {
        System.out.println("Victorian Chair");
    }
}
