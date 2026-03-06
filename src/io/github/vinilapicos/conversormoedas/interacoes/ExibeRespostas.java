package io.github.vinilapicos.conversormoedas.interacoes;

import io.github.vinilapicos.conversormoedas.conversor.ConversorDeMoeda;

public class ExibeRespostas {
    private String selecao;

    public void ExibeMenu(){
         System.out.println("""
                 ***********************************************************
                 Seja bem-vindo/a ao Conversor de Moeda em Tempo Real!
                 
                 1) Dólar =>> Peso argentino
                 2) Peso argentino =>> Dólar
                 3) Dólar =>> Real brasileiro
                 4) Real brasileiro =>> Dólar
                 5) Dólar =>> Peso colombiano
                 6) Peso colombiano =>> Dólar
                 7) Sair
                 Escolha uma opção válida:\s
                 ***********************************************************""");
    }

    public void ExibeResultado(ConversorDeMoeda conversorPreenchido){
        System.out.println("O valor de "+conversorPreenchido.getValorFormatado()+ " ["+conversorPreenchido.getPrimeiraMoeda()+"] corresponde ao valor final de " +
                "==> "+ conversorPreenchido.getResultadoConversao()+ " ["+conversorPreenchido.getSegundaMoeda()+"]");
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String getSelecao() {
        return selecao;
    }
}
