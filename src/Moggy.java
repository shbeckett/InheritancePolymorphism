package src;

public class Moggy  extends SmallCat {
    private Boolean wearsCollar;

    public Moggy(){ //had to define default constructor myself before being able to use overloaded constructor

    }

    public Moggy(Boolean val, String shade) {
        wearsCollar = val;
        colour = shade; //had to change visibility of colour to protected so could be accessed by constructor in child class
    }

    public void makeNoise(){
        System.out.println("Eeeeoooowwwffftttzzzz");}

    public Boolean getWearsCollar() {
        return wearsCollar;
    }

    public void setWearsCollar(Boolean wearsCollar) {
        this.wearsCollar = wearsCollar;
    }

    
}
