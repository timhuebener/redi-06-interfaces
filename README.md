# Lesson 06 Interfaces

## Recap lesson 5 inheritance

1. Create a Class called `Car`
2. Add a **string** field called `brand`
3. Add a **int** field called `fuelLevel`
3. Add a method called `getFuelLevel()` that prints: 
      >The fuel level is `fuelLevel`"
   
4. Create a class `VW` that is a subclass of `Car` 
5. with method `getBrand()` that prints:
      > This is a `brand` car.

## Interfaces

### What are Interfaces?

Interfaces are like a class, but they can only contain final variables and method signatures. 

This is an example of an interface: 
```java
interface Animal {
    String name = "Animal";
    void eat();
}
```

The interface lets us only define the name and parameters of methods (called the method signature) but not how they are implemented.
We don't have {} after the `eat()` method. 

### Why do we need Interfaces?

In programming we try to create more and more abstractions. For example, we abstract binary code with assembly code. 
Then we abstract assembly code with Java code. And in Java code we can create further abstractions. 

Interfaces let us abstract behavior. That is, we can define what a class **should** be able to do. 
For example, we can define that every car has to be able to: 
- break
- accelerate
- show the fuel level
- turn on/off the radio
- etc.

So an interface ensures for example, that when different car brands build their cars, we know exactly what the cars can do.
We don't know how they do it, and we are not interested in how the car breaks, but we know that the car can break.

## Interface Example

```java
interface Car {
   void accelerate();
   void decelerate();
   int getFuel();
}

class VW implements Car {
   String brand = "Volkswaggon";
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
```

## Exercise

1. Copy the interface example above into your `Main.java`
2. Create a new interface called `PremiumCar`
3. Add a method signature `void activateAutoPilot()`
4. Add a method signature `void deactiveAutoPilot()`
5. Create a class called `Mercedys` that implements `Car` and `PremiumCar`
6. Add a **boolean** field called `AutoPilotActive` to the `Mercedys` class
7. Implement the `activateAutoPilot()` and `deactiveAutoPilot()` methods in the `Mercedys` class.

## Homework

1. In the `main` method Create at least 1 instance of a `VW` and `Mercedys` 
2. Add the two cars to a list
3. Make each car accelerate, decelerate and show the fuel level. And make sure each action is printed to the command line