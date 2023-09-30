public class BiCycle extends Vehicle{

    private boolean cityBike;
    public BiCycle(int wheels, long price, boolean cityBike){
        this.cityBike=cityBike;
        this.wheels=wheels;
        this.price=price;
    }

    public BiCycle(BiCycle target){
        if(target != null){
            this.cityBike = target.cityBike;
            this.wheels= target.wheels;
            this.price= target.price;
        }
    }

    @Override
    public Vehicle clone() {
        return new BiCycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof BiCycle){
            BiCycle t = (BiCycle) target;
            if(cityBike==t.cityBike&& wheels==t.wheels&& price==t.price){
                System.out.println(this + " and " + t + " are clone");
                return true;
            }
            System.out.println(this + " and " + t + " are not  clone");
            return false;
        }
        System.out.println(this + " and " + target + " are not  clone");
        return false;

    }
}
