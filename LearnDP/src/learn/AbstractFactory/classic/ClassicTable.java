package learn.AbstractFactory.classic;


import learn.AbstractFactory.furniture.Table;

public class ClassicTable extends Table {
    @Override
    public void print() {
        System.out.println("classic table");
    }
}
