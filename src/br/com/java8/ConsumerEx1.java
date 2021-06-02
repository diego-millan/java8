@Slf4j
public class Application {
    static void disturbPet(Supplier<String> petVocalization) {
        log.info(petVocalization.get());
    }
    public static void main(String [] args)  {
        List<Supplier<String>> yourPetVocalizations = List.of(
                () -> "bark",
                () -> "meow",
                () -> "hiss");
        yourPetVocalizations.forEach(v -> disturbPet(v));
    }
}
