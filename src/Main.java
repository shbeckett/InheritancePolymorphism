package src;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new BigCat(),
                        new SmallCat(),
                        new Moggy()
                    };
        for (int i = 0; i < cats.length; i++) {
            cats[i].makeNoise();
        }    
    }
}
