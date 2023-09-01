package learn.AbstractFactory.classic;

import learn.AbstractFactory.furniture.Sofa;

public class ClassicSofa extends Sofa {
    @Override
    public void print() {
        System.out.println("classic sofa");
    }
}
