package br.com.fiap.game.model;

public class HabilidadeEspecial {

    private String nome;
    private int custoEnergia;
    private boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada) {
        if (custoEnergia < 0) {
            throw new IllegalArgumentException("O custo de energia não pode ser negativo.");
        }
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public String getNome() {
        return nome;
    }

    public HabilidadeEspecial setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public HabilidadeEspecial setCustoEnergia(int custoEnergia) {
        if (custoEnergia < 0) {
            throw new IllegalArgumentException("O custo de energia não pode ser negativo.");
        }
        this.custoEnergia = custoEnergia;
        return this;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public HabilidadeEspecial setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
        return this;
    }

    public void ativarHabilidade() {
        alterarEstadoHabilidade(true, "ativada");
    }

    public void desativarHabilidade() {
        alterarEstadoHabilidade(false, "desativada");
    }

    private void alterarEstadoHabilidade(boolean novoEstado, String acao) {
        if (habilitada == novoEstado) {
            System.out.println("Habilidade " + nome + " já está " + acao + ".");
        } else {
            habilitada = novoEstado;
            System.out.println("Habilidade " + nome + " foi " + acao + ".");
        }
    }
}
