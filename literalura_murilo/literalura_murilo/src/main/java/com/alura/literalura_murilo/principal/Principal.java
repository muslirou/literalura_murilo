package com.alura.literalura_murilo.principal;

import com.alura.literalura_murilo.model.DadosDoLivro;
import com.alura.literalura_murilo.model.DadosLivros;
import com.alura.literalura_murilo.model.Livro;
import com.alura.literalura_murilo.service.ConsultaAPI;
import com.alura.literalura_murilo.service.ConverteDados;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private ConsultaAPI consumo = new ConsultaAPI();

    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://gutendex.com/books/?search=";

    private List<DadosLivros> dadosLivros = new ArrayList<>();


    public void exibeMenu () throws JsonProcessingException {
        System.out.println("Digite o nome do livro para busca");

        var nomeLivro = leitura.nextLine();

        var json = consumo.obterDados(ENDERECO + nomeLivro.replace(" ", "%20"));
        System.out.println(json);

        List<DadosLivros> dados = conversor.obterLista(json, DadosLivros.class);
        System.out.println(dados);
    }

}
