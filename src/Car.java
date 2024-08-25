//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;

public class Car {
    private String color;
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<Car>();
        Car car1 = new electricCar(1500, "red");
        list.add(car1);
        Car car2 = new gasCar(5000, "Blue");
        list.add(car2);
        Car waterCar = new waterCar(10, "Green");
        list.add(waterCar);




    }


}

    class electricCar extends Car{
        electricCar(Integer mielage, String color){
            System.out.println("Your Electric Car has " + mielage + " volts left on the battery. It is also "+ color);




            }



    }


    class gasCar extends Car{

        gasCar(Integer mielage, String color){
            System.out.println("Your Gas Car has " + mielage + " miles left in the tank. It is also "+ color);
        }
    }

class waterCar extends Car{

        waterCar(Integer mielage, String color){
            System.out.println("Your Water Car has " + mielage + " gallons of water left in the tank. It is also "+ color);
        }
    }

