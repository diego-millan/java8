package br.com.java8;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaEx2 {
    interface Pet {
        String vocalize();
    }
    static void disturbPet(Pet p) {
//        log.info(p.vocalize());
        System.out.println(p.vocalize());
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
