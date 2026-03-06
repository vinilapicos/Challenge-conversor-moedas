package io.github.vinilapicos.conversormoedas.principal;

import io.github.vinilapicos.conversormoedas.conversor.ConversorDeMoeda;
import io.github.vinilapicos.conversormoedas.interacoes.ExibeRespostas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String moedaestadosunidos = "USD";
        String moedabrasil = "BRL";
        String moedaargentina = "ARS";
        String moedacolombia = "COP";
        Scanner sc = new Scanner(System.in);
        ConversorDeMoeda conversor = new ConversorDeMoeda();
        ExibeRespostas exibemenu = new ExibeRespostas();

        for (int i = 0; i == 0;){
            exibemenu.ExibeMenu();
            exibemenu.setSelecao(sc.nextLine());
            switch (exibemenu.getSelecao()) {
                case "1":
                    System.out.println("Digite o valor que deseja converter: ");
                    conversor.setValorFormatado(sc.nextLine());
                    conversor.setResultadoConversao(moedaestadosunidos, moedaargentina);
                    exibemenu.ExibeResultado(conversor);
                    break;
                case "2":
                    System.out.println("Digite o valor que deseja converter: ");
                    conversor.setValorFormatado(sc.nextLine());
                    conversor.setResultadoConversao(moedaargentina, moedaestadosunidos);
                    exibemenu.ExibeResultado(conversor);
                    break;
                case "3":
                    System.out.println("Digite o valor que deseja converter: ");
                    conversor.setValorFormatado(sc.nextLine());
                    conversor.setResultadoConversao(moedaestadosunidos, moedabrasil);
                    exibemenu.ExibeResultado(conversor);
                    break;
                case "4":
                    System.out.println("Digite o valor que deseja converter: ");
                    conversor.setValorFormatado(sc.nextLine());
                    conversor.setResultadoConversao(moedabrasil, moedaestadosunidos);
                    exibemenu.ExibeResultado(conversor);
                    break;
                case "5":
                    System.out.println("Digite o valor que deseja converter: ");
                    conversor.setValorFormatado(sc.nextLine());
                    conversor.setResultadoConversao(moedaestadosunidos, moedacolombia);
                    exibemenu.ExibeResultado(conversor);
                    break;
                case "6":
                    System.out.println("Digite o valor que deseja converter: ");
                    conversor.setValorFormatado(sc.nextLine());
                    conversor.setResultadoConversao(moedacolombia, moedaestadosunidos);
                    exibemenu.ExibeResultado(conversor);
                    break;
                case "7":
                    System.out.println("Você escolheu sair! Obrigado por utilizar o Conversor de Moedas do Vinicius!");
                    i = 1;
                    break;
                default:
                    System.out.println("Você digitou um valor inválido, tente novamente ou digite 7 para sair.");
            }
        }
    }
}