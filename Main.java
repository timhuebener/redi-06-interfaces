public class Main {
    public static void main(String[] args) {}
}

interface BasicFunctions {
    void accelerate();
    void decelerate();
    int getFuel();
}

class Car implements BasicFunctions {
    String brand;
    int speed = 0;
    int fuel = 0;

    @Override
    public void accelerate() {
        speed = speed + 10;
        fuel = fuel - 10;
    }

    @Override
    public void decelerate() {
        speed = speed - 10;
    }

    @Override
    public int getFuel() {
        return fuel;
    }
}

interface PremiumCar {
    void activateAutoPilot();
    void deactivateAutoPilot();
}

class Premium extends Car implements PremiumCar {
    boolean autoPilotActive;

    @Override
    public void activateAutoPilot() {
        autoPilotActive = true;
    }

    @Override
    public void deactivateAutoPilot() {
        autoPilotActive = false;
    }
}

class Mercedes extends Premium {

}

// Why use inheritance?
// 1. Reuse code
// 2. Cleaner code
// 3. Encapsulation of code
// 4. Polymorphism

// What's the difference between Inheritance and Interface?
// 1. Classes can implement several interfaces but only extend one class
// 2. You don't implement methods in interfaces
// 3. Variables in interfaces are always final

// When do you use what?
// Use inheritance to reuse code
// Use interfaces to describe behavior