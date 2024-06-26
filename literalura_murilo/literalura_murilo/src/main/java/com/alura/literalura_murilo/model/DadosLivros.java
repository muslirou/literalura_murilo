package com.alura.literalura_murilo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivros (@JsonAlias("title") String titulo,
                           //@JsonAlias("authors") String autor,
                           @JsonAlias("languages") String idioma,
                           @JsonAlias("download_count") Integer downloads){
}
