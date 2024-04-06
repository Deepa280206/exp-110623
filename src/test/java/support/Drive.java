package support;

//import net.bytebuddy.implementation.bind.annotation.Super;

public class Drive {
    public static void main(String[] args) {
        Supercar sp = new Supercar();
        sp.drive(80);
        sp.fuelUp();
        sp.drive(50);
        System.out.println("Fuel level is: " + sp.fuelLevel);
    }
}

class Supercar {
    public int fuelLevel = 100;
    public int distance = 0;

    public void drive(int miles) {
        if ((fuelLevel - miles) < 0) {
            System.out.println("Not enough fuel. Need to refuel.");
            return;
        } else {
            this.distance = this.distance + miles;
            this.fuelLevel = this.fuelLevel - miles;
        }
    }

    public void fuelUp() {
        this.fuelLevel = 100;
    }
}