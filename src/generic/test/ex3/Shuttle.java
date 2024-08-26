package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T inner;

    public void in(T t) {
        inner = t;
    }

    public void showInfo() {
        System.out.println("이름: " + inner.getName() + ", HP: " + inner.getHp());
    }
}
