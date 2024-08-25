import java.util.ArrayList;

public class CarManager{
    public static void main(String[] args) {


        ArrayList<Car> list = new ArrayList<Car>();
        Car car1 = new electricCar(1500, "red");
        list.add(car1);
        Car car2 = new gasCar(5000, "blue");
        list.add(car2);
        Car waterCar = new waterCar(10, "green");
        list.add(waterCar);

        System.out.println("");
        System.out.println("Here are your cars...");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
