package src;
public class Cat{
    private int numWhiskers;
    private String colour;
    public Boolean canRetractClaws;

    public Boolean getCanRetractClaws() {
        return canRetractClaws;
    }

    public void setCanRetractClaws(Boolean canRetractClaws) {
        this.canRetractClaws = canRetractClaws;
    }

    public void makeNoise(){
        System.out.println("Purr");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumWhiskers() {
        return numWhiskers;
    }

    public void setNumWhiskers(int numWhiskers) {
        this.numWhiskers = numWhiskers;
    }
}