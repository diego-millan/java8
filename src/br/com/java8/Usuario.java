package br.com.java8;

class Usuario {
    private String nome;
    private int pontos;
    private boolean isModerador;

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.isModerador = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public boolean isModerador() {
        return isModerador;
    }

    public void tornaModerador() {
        isModerador = true;
    }
}
