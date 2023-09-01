package learn.AbstractFactory.factorys;

import learn.AbstractFactory.Victorian.VictorianChair;
import learn.AbstractFactory.Victorian.VictorianSofa;
import learn.AbstractFactory.Victorian.VictorianTable;
import learn.AbstractFactory.furniture.Chair;
import learn.AbstractFactory.furniture.Sofa;
import learn.AbstractFactory.furniture.Table;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
