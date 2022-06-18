public class bird implements cloneable {
    private String name;
    private String color;
    private int weight;

    public bird() {}
    public bird(bird old)
    {
        this.name=old.name;
        this.color=old.color;
        this.weight=old.weight;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public bird clone() {
        return new bird(this);
    }
}
