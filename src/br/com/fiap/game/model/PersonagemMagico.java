package br.com.fiap.game.model;

public class PersonagemMagico {

    private static final int ENERGIA_CONSUMIDA_POR_ATAQUE = 10;

    private String nome;
    private int nivelEnergia;
    private String poderMagico;
    private HabilidadeEspecial habilidadeEspecial;

    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(String nome) {
        this(nome, 0, "");  // Chamando outro construtor
    }

    public PersonagemMagico() {
        this("", 0, "");  // Chamando outro construtor
    }

    public void atacar(String ataque) {
        if (nivelEnergia >= ENERGIA_CONSUMIDA_POR_ATAQUE) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= ENERGIA_CONSUMIDA_POR_ATAQUE;
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (habilidadeEspecial == null) {
            System.out.println(nome + " não possui uma habilidade especial definida.");
        } else if (!habilidadeEspecial.isHabilitada()) {
            System.out.println("Habilidade especial não está ativada.");
        } else if (nivelEnergia >= habilidadeEspecial.getCustoEnergia()) {
            System.out.println("Ativando a habilidade: " + habilidadeEspecial.getNome());
            nivelEnergia -= habilidadeEspecial.getCustoEnergia();
        } else {
            System.out.println(nome + " está sem energia para habilidade especial.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public PersonagemMagico setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public PersonagemMagico setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public PersonagemMagico setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
        return this;
    }
}
