package br.com.java8;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.Supplier;

@Slf4j
public class ConsumerEx1 {
    static void disturbPet(Supplier<String> petVocalization) {
        System.out.println(petVocalization.get());
//        log.info(petVocalization.get());
    }
    public static void main(String [] args)  {
        List<Supplier<String>> yourPetVocalizations = List.of(
                () -> "bark",
                () -> "meow",
                () -> "hiss");
        yourPetVocalizations.forEach(v -> disturbPet(v));
    }
}
