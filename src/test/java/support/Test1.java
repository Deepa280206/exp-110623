package support;

public class Test1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.drive(80);
        car1.fuelUp();
        car1.drive(50);
        car1.checkfuelLevel();
        car1.drive(50);
        car1.checkfuelLevel();
    }
}

class Car
{
    public int fuelLevel;
    public int distance;

    Car()
    {
        this.fuelLevel = 100;
        this.distance = 0;
    }
    public void drive(int distance)
    {
        this.distance = distance;
        this.fuelLevel = this.fuelLevel - distance;
    }

    public void fuelUp()
    {
        this.fuelLevel = 100;
    }

    public void checkfuelLevel()
    {
        if (fuelLevel == 0)
            System.out.println("Please refuel");
        else
            System.out.println("The fuel level is: " + this.fuelLevel);
    }
}
