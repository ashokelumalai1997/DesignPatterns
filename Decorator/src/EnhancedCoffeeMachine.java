public class EnhancedCoffeeMachine implements CoffeeMachine{
    private NormalCoffeeMachine machine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine machine){
        this.machine=machine;
    }

    // Override behaviour
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine : making small coffee");
    }


    //Unaltered/extended behaviour
    @Override
    public void makeLargeCoffee() {
        this.machine.makeLargeCoffee();
    }

    //Enhanced behaviour
    public void makeMilkCoffee() {
        System.out.println("Enhanced coffee machine : making milk coffee");
        machine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine : adding milk");
    }
}
