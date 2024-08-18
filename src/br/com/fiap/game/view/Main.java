package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

public class Main {
    public static void main(String[] args) {

        //Criando objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");
        //Atribuindo valores aos atributos do objeto
       // mago.nome = "Gandalf";
       // mago.nivelEnergia = 100;
       // mago.poderMagico = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.getNome() + " Energia" + mago.getNivelEnergia() + " Poder" + mago.getPoderMagico());


        //Criando objeto do tipo Personagem Mágico
        PersonagemMagico elfo = new PersonagemMagico("Legolas", 75, "Arqueiro");

        //Atribuindo valores aos atributos do objeto
       // elfo.nome = "Legolas";
       // elfo.nivelEnergia = 75;
       // elfo.poderMagico = "Arqueiro";

        //Exibindo valores dos atributos do objeto
        System.out.println(elfo.getNome() + " Energia" + elfo.getNivelEnergia() + " Poder" + elfo.getPoderMagico());

        //Criando objeto do tipo Personagem Mágico
        PersonagemMagico cavaleiro = new PersonagemMagico("Negro", 95, "Machadada");

        //Exibindo valores dos atributos do objeto
        System.out.println(cavaleiro.getNome() + " Energia" + cavaleiro.getNivelEnergia() + " Poder" + cavaleiro.getPoderMagico());


    }
}