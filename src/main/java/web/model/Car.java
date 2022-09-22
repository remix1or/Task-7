package web.model;

public class Car {

    private String model;
    private Integer radius;
    private Integer series;

    public Car(String model, Integer radius, Integer series) {
        this.model = model;
        this.radius = radius;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car - " + model +", Wheel radius - "+ radius +", Series - "+ series;
    }
}
