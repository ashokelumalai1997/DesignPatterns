public class Car extends Vehicle{
    private String color;

    public Car(int wheels, long price, String color){
        this.color=color;
        this.wheels=wheels;
        this.price=price;
    }

    public Car(Car target){
        super(target);
        if(target!=null){
            color=target.color;
        }
    }
    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof Car){
            Car t = (Car) target;
            if(color==t.color && wheels == this.wheels && price == this.price) {
                System.out.println("Clone");
                return true;
            }
        }
        System.out.println("Not a clone");
        return false;
    }

}
