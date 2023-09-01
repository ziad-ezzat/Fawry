package learn.AbstractFactory.factorys;

import learn.AbstractFactory.furniture.Chair;
import learn.AbstractFactory.furniture.Sofa;
import learn.AbstractFactory.furniture.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
