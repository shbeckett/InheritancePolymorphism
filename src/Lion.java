package src;

public class Lion extends BigCat implements Climber {
    
    private Boolean eatsPeople;

    public Boolean eatsPeople() {
        return eatsPeople;
    }

    public void setEatsPeople(Boolean eatsPeople) {
        this.eatsPeople = eatsPeople;
    }

    public void makeNoise(){
        System.out.println("Roarsome");}

    public void goUp(){
        System.out.println("Not sure I can be bothered.");
        }
    
    public void comeDown(){
        System.out.println("The ground is nice.");
        }    
    
}


