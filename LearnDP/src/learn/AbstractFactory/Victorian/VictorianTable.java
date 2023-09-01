package learn.AbstractFactory.Victorian;

import learn.AbstractFactory.furniture.Table;

public class VictorianTable extends Table {
    @Override
    public void print() {
        System.out.println("Victorian Table");
    }
}
