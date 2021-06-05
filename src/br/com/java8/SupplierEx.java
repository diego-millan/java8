package br.com.java8;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Slf4j
public class SupplierEx {
    static void disturbPet(Supplier<String> petVocalization) {
        System.out.println(petVocalization.get());
//        log.info(petVocalization.get());
    }
    public static void main(String [] args)  {
        disturbPet(() -> "meow");
        disturbPet(() -> "bark");
        disturbPet(() -> "hiss");
    }
}
