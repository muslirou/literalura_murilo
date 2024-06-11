package com.alura.literalura_murilo.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface IConverteDados {
    <T> T  obterMaisDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe) throws JsonProcessingException;
}
