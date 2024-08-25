//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Car {

    public static void main(String[] args) {
        Car car1 = new electricCar(1500);
        Car car2 = new gasCar(5000);
        Car waterCar = new waterCar(10);
    }


}

    class electricCar extends Car{
        electricCar(Integer mielage){
            System.out.println("Your Electric Car has " + mielage + " volts left on the battery");
        }
    }


    class gasCar extends Car{

        gasCar(Integer mielage){
            System.out.println("Your Gas Car has " + mielage + " miles left in the tank");
        }
    }

class waterCar extends Car{

        waterCar(Integer mielage){
            System.out.println("Your Water Car has " + mielage + " gallons of water left in the tank");
        }
    }

