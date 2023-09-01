package learn.AbstractFactory.factorys;

import learn.AbstractFactory.furniture.Chair;
import learn.AbstractFactory.furniture.Sofa;
import learn.AbstractFactory.furniture.Table;
import learn.AbstractFactory.modern.ModernChair;
import learn.AbstractFactory.modern.ModernSofa;
import learn.AbstractFactory.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
