package learn.AbstractFactory;

import learn.AbstractFactory.factorys.ClassicFurnitureFactory;
import learn.AbstractFactory.factorys.FurnitureFactory;
import learn.AbstractFactory.factorys.ModernFurnitureFactory;
import learn.AbstractFactory.factorys.VictorianFurnitureFactory;
import learn.AbstractFactory.furniture.Chair;
import learn.AbstractFactory.furniture.Sofa;
import learn.AbstractFactory.furniture.Table;

public class AbstractFactoryMain {
    public static void main(String[] args)
    {
        FurnitureFactory classicFurnitureFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFurnitureFactory.createChair();
        Sofa classicSofa = classicFurnitureFactory.createSofa();
        Table classicTable = classicFurnitureFactory.createTable();
        classicChair.print();
        classicSofa.print();
        classicTable.print();

        FurnitureFactory modernFurnitureFactory =new ModernFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.createChair();
        Sofa modernSofa = modernFurnitureFactory.createSofa();
        Table modernTable = modernFurnitureFactory.createTable();
        modernChair.print();
        modernSofa.print();
        modernTable.print();

        FurnitureFactory victorianFurnitureFactory =new VictorianFurnitureFactory();
        Chair victorianChair = victorianFurnitureFactory.createChair();
        Sofa victorianSofa = victorianFurnitureFactory.createSofa();
        Table victorianTable = victorianFurnitureFactory.createTable();
        victorianChair.print();
        victorianSofa.print();
        victorianTable.print();
    }
}
