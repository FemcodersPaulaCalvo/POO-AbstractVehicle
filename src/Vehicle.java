public abstract class Vehicle {
    private String brand;
    protected int velocity;
    protected int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.velocity = 0;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public abstract void accelerate();

    public abstract void decelerate();
}
