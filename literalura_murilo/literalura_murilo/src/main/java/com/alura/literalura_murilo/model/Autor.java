package com.alura.literalura_murilo.model;

public class Autor {
    private String autor;
    private Integer anoNascimento;
    private Integer anoFalecimento;

    public Autor(DadosAutor dadosAutor) {
        this.autor = dadosAutor.autor();
        this.anoNascimento = dadosAutor.anoNascimento();
        this.anoFalecimento = dadosAutor.anoFalecimento();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Integer getAnoFalecimento() {
        return anoFalecimento;
    }

    public void setAnoFalecimento(Integer anoFalecimento) {
        this.anoFalecimento = anoFalecimento;
    }

    @Override
    public String toString() {
        return
                ", Autor ='" + autor + '\'' +
                        ", Ano Nascimento =" + anoNascimento +
                        ", Ano Falecimento=" + anoFalecimento + '\'';
    }

}
