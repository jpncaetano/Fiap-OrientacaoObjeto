package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

public class Main {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        criarEExibirPersonagens();  // Chama o método auxiliar para criar e exibir os personagens
    }

    // Método auxiliar para criar e exibir personagens
    private static void criarEExibirPersonagens() {
        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");
        exibirInformacoesPersonagem(mago);

        PersonagemMagico elfo = new PersonagemMagico("Legolas", 75, "Arqueiro");
        exibirInformacoesPersonagem(elfo);

        PersonagemMagico cavaleiro = new PersonagemMagico("Negro", 95, "Machadada");
        exibirInformacoesPersonagem(cavaleiro);
    }

    // Método auxiliar para exibir as informações de um personagem
    private static void exibirInformacoesPersonagem(PersonagemMagico personagem) {
        System.out.println(personagem.getNome() + " Energia: " + personagem.getNivelEnergia() + " Poder: " + personagem.getPoderMagico());
    }
}
