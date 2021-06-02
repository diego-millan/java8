@Slf4j
public class Application {
    interface Pet {
        String vocalize();
    }
    static void disturbPet(Pet p) {
        log.info(p.vocalize());
    }
    public static void main(String [] args)  {
        Pet cat = () -> "meow";
        Pet dog = () -> "bark";
        Pet snake = () -> "hiss";
        disturbPet(cat);
        disturbPet(dog);
        disturbPet(snake);
    }
}
