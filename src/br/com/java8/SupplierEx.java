@Slf4j
public class Application {
    static void disturbPet(Supplier<String> petVocalization) {
        log.info(petVocalization.get());
    }
    public static void main(String [] args)  {
        disturbPet(() -> "meow");
        disturbPet(() -> "bark");
        disturbPet(() -> "hiss");
    }
}
