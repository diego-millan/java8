package br.com.java8;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaEx1 {
  abstract static class Pet {
    public abstract String vocalize();

    public void disturb() {
      System.out.println(vocalize());
      // log.info(vocalize());
    }
  }

  static class Dog extends Pet {
    public String vocalize() {
      return "bark";
    }
  }

  static class Cat extends Pet {
    public String vocalize() {
      return "meow";
    }
  }

  public static void main(String[] args) {
    Pet cat = new Cat();
    Pet dog = new Dog();
    cat.disturb();
    dog.disturb();
  }
}
