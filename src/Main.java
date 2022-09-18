package src;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new BigCat(),
                        new SmallCat(),
                        new Moggy(),
                        new Lion()
                    };
        for (int i = 0; i < cats.length; i++) {
            cats[i].makeNoise();
        }
        Moggy scarface = new Moggy(true, "tortoiseshell");
        System.out.println(scarface.getWearsCollar());
        System.out.println(scarface.getColour());
        //cats[3].setEatsPeople(true);    //can't access public lion methods even though it is one...
        cats[3].setCanRetractClaws(false); //can access cat methods
        System.out.println(cats[3].canRetractClaws);
        //Lion Clarence = cats[3]; //giving it an object ref doesn't work
        Lion Clarence = new Lion();
        Clarence.setEatsPeople(true);
        System.out.println("Sadly it is " + Clarence.eatsPeople()+" that Clarence eats people.");
        cats[3] = Clarence; // had to create new object first then assign to cats[] but why?
    }
}
