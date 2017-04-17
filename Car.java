package builder01;
public class Car {
    
    enum TypeOfCar{
        SEDAN,
        HATCHBACK,
        KOMBI,
        PICKUP 
    }
    
    private String name;
    private String color;
    private TypeOfCar typeOfCar;
    private Date1 dateOfProduction;
    
    private Car(final Builder builder){
        this.name = builder.name;
        this.color = builder.color;
        this.typeOfCar = builder.typeOfCar;
        this.dateOfProduction = builder.dateOfProduce;
    }

    @Override
    public String toString() {
        return "name=" + name + ", color=" + color + ", type Of Car=" + typeOfCar + ", date Of production=" + dateOfProduction;
    }
    
    
    public static class Builder{
        
        private String name;
        private String color;
        private TypeOfCar typeOfCar;
        private Date1 dateOfProduce; 
        
        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Builder color(String color){
            this.color = color;
            return this;
        }
        
        public Builder typeOfCar(TypeOfCar typeOfCar){
            this.typeOfCar = typeOfCar;
            return this;
        }
        
        public Builder dateOfProduce(Date1 dateOfProduce){
            this.dateOfProduce = dateOfProduce;
            return this;
        }
        
        public Car build(){
            return new Car(this);
        }
    }
}
