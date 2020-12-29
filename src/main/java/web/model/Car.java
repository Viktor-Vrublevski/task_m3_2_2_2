package web.model;

public class Car {
    private String model;
    private int price;
    private int speed;

    public Car(String model, int price, int speed) {
        this.model = model;
        this.price = price;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
