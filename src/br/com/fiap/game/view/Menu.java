package br.com.fiap.game.view;

import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int op;
        do {
            mostrarOpcoes();
            op = sc.nextInt();

            switch (op) {
                case 1:
                    cadastrarPersonagem(sc, personagem);
                    break;
                case 2:
                    exibirPersonagem(personagem);
                    break;
                case 3:
                    realizarAtaque(sc, personagem);
                    break;
                case 4:
                    aumentarEnergia(sc, personagem);
                    break;
                case 5:
                    ativarHabilidadeEspecial(personagem);
                    break;
                case 6:
                    habilitarHabilidadeEspecial(personagem);
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);

        sc.close();
    }

    private static void mostrarOpcoes() {
        System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar \n4-Aumentar Energia \n5-Ativar Habilidade Especial \n6-Habilitar a Habilidade Especial \n0-Sair");
    }

    private static void cadastrarPersonagem(Scanner sc, PersonagemMagico personagem) {
        System.out.println("Digite o nome do personagem: ");
        String nome = sc.next() + sc.nextLine();
        System.out.println("Digite o poder do personagem: ");
        String poder = sc.next() + sc.nextLine();
        System.out.println("Digite o nível de energia: ");
        int energia = sc.nextInt();
        personagem.setNome(nome).setNivelEnergia(energia).setPoderMagico(poder);

        System.out.println("Digite o nome da habilidade especial: ");
        String nomeHabilidade = sc.next() + sc.nextLine();
        System.out.println("Digite o custo de energia para usar a habilidade especial: ");
        int nivelEnergia = sc.nextInt();
        System.out.println("A Habilidade está ativada (true/false): ");
        boolean ativada = sc.nextBoolean();

        HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
        personagem.setHabilidadeEspecial(habilidadeEspecial);
    }

    private static void exibirPersonagem(PersonagemMagico personagem) {
        System.out.println("Nome: " + personagem.getNome() + " Poder: " + personagem.getPoderMagico() + " Nível energia: " + personagem.getNivelEnergia());
        System.out.println("Habilidade: " + personagem.getHabilidadeEspecial().getNome() + " Custo energia: " + personagem.getHabilidadeEspecial().getCustoEnergia() + " Habilitada: " + personagem.getHabilidadeEspecial().isHabilitada());
    }

    private static void realizarAtaque(Scanner sc, PersonagemMagico personagem) {
        System.out.println("Digite o nome do ataque: ");
        String ataque = sc.next() + sc.nextLine();
        personagem.atacar(ataque);
    }

    private static void aumentarEnergia(Scanner sc, PersonagemMagico personagem) {
        System.out.println("Digite a quantidade de energia: ");
        int qtd = sc.nextInt();
        int niveAtual = personagem.aumentarEnergia(qtd);
        System.out.println("Nível atual de energia " + niveAtual);
    }

    private static void ativarHabilidadeEspecial(PersonagemMagico personagem) {
        personagem.ativarHabilidadeEspecial();
    }

    private static void habilitarHabilidadeEspecial(PersonagemMagico personagem) {
        personagem.getHabilidadeEspecial().ativarHabilidade();
    }
}
