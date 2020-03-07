public class Amphibian {

    public static void doSomething(Amphibian amphibian) {
        amphibian.out();
    }

    private void out(){
        System.out.println("I'm Amphibian");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.doSomething(frog);
    }
}

class Frog extends Amphibian{
    public Frog(){
        System.out.println("Frog is ready");
    }
}
