@Slf4j
public class Application {
    static abstract class Pet {
        public abstract String vocalize();
        public void disturb() { log.info(vocalize()); }
    }
    static class Dog extends Pet {
        public String vocalize() { return "bark"; }
    }
    static class Cat extends Pet {
        public String vocalize() { return "meow"; }
    }
    public static void main(String [] args)  {
        Pet cat = new Cat();
        Pet dog = new Dog();
        cat.disturb();
        dog.disturb();
    }
}
