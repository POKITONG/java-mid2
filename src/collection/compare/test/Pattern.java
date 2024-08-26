package collection.compare.test;

public enum Pattern {
    SPADE("♠"), HEART("♥"), DIAMOND("♦"), CLOVER("♣");

    private String icon;

    Pattern(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
