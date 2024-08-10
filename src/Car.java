//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Car {

    public static void main(String[] args) {
        Car car1 = new electricCar(1500);
        Car car2 = new gasCar(50);
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

