package module2_1.task3;

public class CoffeeMaker {

    public enum CoffeeType {
        ESPRSO, NRML
    }
    
    private CoffeeType type = CoffeeType.NRML;
    private int coffeeAmnt = 10;
    private boolean power = false;

    public void setCoffeeAmnt(int amnt) {
        if(power) {
            if(amnt>80) this.coffeeAmnt = 80;
            else if(amnt<10)  this.coffeeAmnt = 10;
            else this.coffeeAmnt = amnt;
        }
    }

    public void toggleOn() {
        power = power?false:true;
    }

    public void setType(CoffeeType type) {
        if(power) this.type = type;
    }

    public void brew() {
        if(power) System.out.println("Brewed a cup of " + (this.type==CoffeeType.NRML?"Normal":"Espresso") + " coffee with " + coffeeAmnt + "ml of coffee grounds.");
        else System.out.println("Coffee maker offline.");
    }

    public CoffeeType getType() {
        return this.type;
    }

    public int getCoffeeAmnt() {
        return this.coffeeAmnt;
    }

    public static void main(String[] args) {
    CoffeeMaker cMaker = new CoffeeMaker();

    cMaker.toggleOn();
    cMaker.setType(CoffeeType.ESPRSO);
    cMaker.setCoffeeAmnt(100);
    cMaker.brew();
    cMaker.toggleOn();
    cMaker.brew();
}

}