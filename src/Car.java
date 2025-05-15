public class Car extends Vehicle {
    public Car(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getVelocity() {
        return super.getVelocity();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public void puncturedWheel() {
        this.wheels -= 1;
    }

    @Override
    public void wheelChanged() {
        this.wheels += 1;
    }

    @Override
    public void accelerate() {
        this.velocity += 20;
    }

    @Override
    public void decelerate() {
        this.velocity -= 20;
    }
}
