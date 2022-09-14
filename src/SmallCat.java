package src;

public class SmallCat extends Cat {
    private Byte numLives;
    
    public Byte getNumLives() {
        return numLives;
    }

    public void setNumLives(Byte numLives) {
        this.numLives = numLives;
    }

    public void makeNoise(){
        System.out.println("Miaow");
    
}
}
