# Projeto FIAP: Orientação a Objetos - Jogo de Personagens Mágicos

Este projeto é parte do módulo de Orientação a Objetos da FIAP e tem como objetivo explorar conceitos fundamentais como encapsulamento, criação de classes, métodos e interação entre objetos no contexto de um jogo de personagens mágicos.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **`src/br/com/fiap/game/model`**: Contém as classes que representam o modelo do jogo.
  - **`PersonagemMagico.java`**: Classe que define os atributos e comportamentos de um personagem mágico.
  - **`HabilidadeEspecial.java`**: Classe que define uma habilidade especial que pode ser usada por um personagem mágico.

- **`src/br/com/fiap/game/view`**: Contém a classe principal e a interface de menu para interação com o usuário.
  - **`Main.java`**: Classe principal que cria e exibe personagens mágicos.
  - **`Menu.java`**: Classe que oferece uma interface de menu para interação com o usuário, permitindo cadastrar personagens, exibir informações, atacar e utilizar habilidades especiais.

## Funcionalidades

- **Criação de Personagem**: O usuário pode criar personagens mágicos com diferentes níveis de energia e poderes.
- **Ação de Ataque**: Os personagens podem realizar ataques, consumindo energia.
- **Habilidades Especiais**: Personagens podem ter habilidades especiais, que podem ser ativadas se as condições de energia forem atendidas.
- **Aumentar Energia**: O usuário pode aumentar a energia de um personagem.
- **Exibição de Informações**: O usuário pode visualizar os detalhes dos personagens e suas habilidades.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/jpncaetano/Fiap-OrientacaoObjeto.git
   ```

2. Importe o projeto em sua IDE Java preferida (recomendado: IntelliJ IDEA).

3. Execute a classe `Menu.java` localizada em `src/br/com/fiap/game/view/Menu.java` para interagir com o menu.

## Exemplos de Código

### Criação de um Personagem Mágico

```java
PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");
System.out.println(mago.getNome() + " Energia: " + mago.getNivelEnergia() + " Poder: " + mago.getPoderMagico());
```

### Ativando uma Habilidade Especial

```java
HabilidadeEspecial habilidade = new HabilidadeEspecial("Invisibilidade", 20, true);
PersonagemMagico elfo = new PersonagemMagico("Legolas", 75, "Arqueiro");
elfo.setHabilidadeEspecial(habilidade);
elfo.ativarHabilidadeEspecial();
```

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA**


## Notas

Este projeto passou por uma refatoração para melhorar a organização do código e a modularidade. Métodos e construtores foram ajustados para evitar redundância e melhorar a legibilidade.




## Autor

- [João Caetano](https://github.com/jpncaetano)
