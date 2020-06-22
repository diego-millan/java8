package br.com.java8;

@FunctionalInterface
interface Validador<T> {
    boolean valida(T t);
}
