public class Motorbike extends Vehicle{
    public Motorbike(String brand, int wheels) {
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
        this.wheels -= 2;
    }

    @Override
    public void wheelChanged() {
        this.wheels += 2;
    }
}
