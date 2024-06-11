package com.alura.literalura_murilo.model;

public class Livro {
    private String titulo;
    private String autor;
    private Idioma idioma;
    private Integer downloads;

    public Livro(DadosLivros dadosLivros) {
        this.titulo = dadosLivros.titulo();
        //this.autor = dadosLivros.autor();
        this.idioma = idioma.fromString(dadosLivros.idioma().split(",")[0].trim());
        this.downloads = dadosLivros.downloads();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return
                ", titulo='" + titulo + '\'' +
                        ", autor=" + autor +
                        ", idioma=" + idioma +
                        ", numero de downloads='" + downloads + '\'';
    }
}
