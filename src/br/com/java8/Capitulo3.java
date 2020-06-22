package br.com.java8;

class Capitulo3 {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for ( int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();

        Runnable r2 = () -> {
            for ( int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        };
        new Thread(r2).start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }).start();

        Validador<String> validaCEP = new Validador<String>() {
            @Override
            public boolean valida(String s) {
                return s.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validador<String> validadorCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        final int numero = 5;
        new Thread(() -> {
            System.out.println(numero);
        }).start();
//        numero = 10; numero precisa ser final, ou gera erro de compilacao
    }
}
