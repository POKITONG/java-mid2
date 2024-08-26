package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends Shuttle> void printV1(T t) {
        t.showInfo();
    }

    public static void printV2 (Shuttle<? extends BioUnit> t) {
        t.showInfo();
    }
}
