package learn.AbstractFactory.modern;

import learn.AbstractFactory.furniture.Table;

public class ModernTable extends Table {
    @Override
    public void print() {
        System.out.println("modern chair");
    }
}
