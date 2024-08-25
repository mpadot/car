//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;

public class Car {
    private String color;
    private Integer mielage;

    public Car(Integer mielage, String color){
        this.color = color;
        this.mielage = mielage;
    }
    protected String getColor() {
        return color;
    }

    protected Integer getMileage() {
        return mielage;
    }

    public String toString() {
        return "mileage of " + mielage + " mpg, the color of the car is " + color;

    }



    public static void carManager(){

        ArrayList<Car> list = new ArrayList<Car>();
        Car car1 = new electricCar(1500, "red");
        list.add(car1);
        Car car2 = new gasCar(5000, "blue");
        list.add(car2);
        Car waterCar = new waterCar(10, "green");
        list.add(waterCar);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }



    }


}

    class electricCar extends Car{
        public electricCar(Integer mielage, String color){
            super(mielage,color);

            }
            public String toString(){
                return "Your electric car has a voltage of " + super.getMileage() + " volts, and the color is " + super.getColor() ;

            }


    }


    class gasCar extends Car{

        public gasCar(Integer mielage, String color){
            super(mielage, color);
        }
        public String toString(){
            return"Your gas car has a " + super.toString()  ;

        }
    }

    class waterCar extends Car{

        public waterCar(Integer mielage, String color){
            super(mielage, color);
        }
        public String toString(){
            return "Your water car has a " + super.toString();
        }
    }

