import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PersonagemMagico personagem = new PersonagemMagico();
    int op;
    do {
        System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar \n4-Aumentar Energia \n5-Ativar Habilidade Especial \n6-Habilitar a Habilidade Especial \n0-Sair");
        op = sc.nextInt();

        switch (op) {
            case 1:
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

                //Criando objeto que representa a habilidade especial com os valores informados pelo usuário
                HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                personagem.setHabilidadeEspecial(habilidadeEspecial);
                break;
            case 2:
                System.out.println("Nome: " + personagem.getNome() + " Poder: " + personagem.getPoderMagico() + " Nível energia: " + personagem.getNivelEnergia());
                System.out.println("Habilidade: " + personagem.getHabilidadeEspecial().getNome() + " Custo energia: " + personagem.getHabilidadeEspecial().getCustoEnergia() + " Habilitada: " + personagem.getHabilidadeEspecial().isHabilitada());
                break;
            case 3:
                System.out.println("Digite o nome do ataque: ");
                String ataque = sc.next() + sc.nextLine();
                personagem.atacar(ataque);
                break;
            case 4:
                System.out.println("Digite a quantidade de energia: ");
                int qtd = sc.nextInt();
                int niveAtual = personagem.aumentarEnergia(qtd);
                System.out.println("Nível atual de energia " + niveAtual);
                break;
            case 5:
                personagem.ativarHabilidadeEspecial();
                break;
            case 6:
                personagem.getHabilidadeEspecial().ativarHabilidade();
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