package web.model;

public class Car {

    private String model;
    private String color;
    private int powers;

    public Car(String model, String color, int powers) {
        this.model = model;
        this.color = color;
        this.powers = powers;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowers() {
        return powers;
    }

    public void setPowers(int powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", powers=" + powers +
                '}';
    }
}
