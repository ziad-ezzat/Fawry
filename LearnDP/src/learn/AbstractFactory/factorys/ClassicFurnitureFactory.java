package learn.AbstractFactory.factorys;

import learn.AbstractFactory.classic.ClassicChair;
import learn.AbstractFactory.classic.ClassicSofa;
import learn.AbstractFactory.classic.ClassicTable;
import learn.AbstractFactory.furniture.Chair;
import learn.AbstractFactory.furniture.Sofa;
import learn.AbstractFactory.furniture.Table;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
