package builder01;
public class Builder01 {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .name("BMW")
                .color("Yelow")
                .typeOfCar(Car.TypeOfCar.HATCHBACK)
                //.dateOfProduce(new Date1.Builder().year(2016).month(12).day(6).Build())
                .dateOfProduce(new Date1.Builder().year(2015).month(12).day(30).Build())
                .build();
        
        System.out.println("Car: " + car);
    }
    
}
