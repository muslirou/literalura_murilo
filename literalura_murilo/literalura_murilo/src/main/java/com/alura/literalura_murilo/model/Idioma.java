package com.alura.literalura_murilo.model;

public enum Idioma {
    PT,
    EN,
    FR,
    ES;

    private String linguagemGutendex;

    public static Idioma fromString(String text) {
        for (Idioma idioma : Idioma.values()) {
            if (idioma.linguagemGutendex.equalsIgnoreCase(text)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
