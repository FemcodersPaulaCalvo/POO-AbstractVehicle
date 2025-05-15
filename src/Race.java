import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Vehicle> drivers = new ArrayList<>();

    public Race(){
        this.drivers.add(new Car("Toyota", 4));
        this.drivers.add(new Car("Renault", 4));
        this.drivers.add(new Car("Opel", 4));
        this.drivers.add(new Motorbike("Yamaha", 2));
        this.drivers.add(new Motorbike("Ducati", 2));
        this.drivers.add(new Motorbike("Kawasaki", 2));
    }
    public void startRace(){
        for (Vehicle driver : drivers){
            driver.accelerate();
            System.out.println(driver.getBrand() + ' ' + driver.getVelocity());
        }

    }
}
