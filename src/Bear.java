package src;

public class Bear implements Climber {
    protected int weight;
    public Bear(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    protected String name;

    public void goUp(){
        System.out.println("I am grizzly and I will get you.");
    }

    public void comeDown(){
        System.out.println("On second thoughts I would prefer salmon.");
    }
    
}

