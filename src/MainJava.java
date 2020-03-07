public class MainJava {
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}

class Art{
    Art(int i){
        System.out.println("Art class is ready for duty");
    }
}

class Sport{
    Sport(){
        System.out.println("Sprot is funny o ");
    }
}

class Pait{
    Sport sport = new Sport();
}

class Runner{
    public static void main(String[] args) {
        Pait pait = new Pait();
        System.out.println("I am done with you");
    }
}

class Drawing extends Art{
    Drawing(int i){
        super(i);
        System.out.println("Drawing class construct");
    }
}

class Carton extends Drawing{
    Carton(){
        super(11);
        System.out.println("Cartoon ooooo");
    }

    void speaker(){
        System.out.println("carton is speaking");
    }
    public static void main(String[] args) {
        Carton carton = new Carton();
        carton.speaker();
    }
}

