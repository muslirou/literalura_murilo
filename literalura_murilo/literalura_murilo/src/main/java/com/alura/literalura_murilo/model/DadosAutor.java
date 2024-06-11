package com.alura.literalura_murilo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAutor (@JsonAlias("authors") String autor,
                          @JsonAlias("birth_year") Integer anoNascimento,
                          @JsonAlias("death_year") Integer anoFalecimento) {
}
