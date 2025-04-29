# Calculadora com Reflexão

Este é um projeto simples de calculadora implementado em **Java**, utilizando o padrão **MVC** e o recurso de **Reflexão** para instanciar dinamicamente operações aritméticas. A calculadora suporta operações básicas como adição, subtração, multiplicação e divisão.

## Funcionalidades

- Realiza operações aritméticas básicas:
     - Adição
     - Subtração
     - Multiplicação
     - Divisão
- Utiliza **Reflexão** para instanciar dinamicamente classes de operação.
- Segue o padrão **MVC** para separação de responsabilidades.
- Trata erros como divisão por zero e entradas inválidas.

## Estrutura do Projeto

```
calculadora/
├── factory/
│   └── Factory.java          # Classe responsável por instanciar operadores dinamicamente
├── models/
│   ├── Operators.java        # Interface para operações aritméticas
│   ├── Addition.java         # Implementação da operação de adição
│   ├── Subtraction.java      # Implementação da operação de subtração
│   ├── Multiplication.java   # Implementação da operação de multiplicação
│   └── Division.java         # Implementação da operação de divisão
├── Calculator.java           # Classe principal que gerencia a interação com o usuário
└── README.md                 # Documentação do projeto
```

## Requisitos

- **Java 17** ou superior
- Maven (opcional, para gerenciamento de dependências)

## Como Executar

1. Clone o repositório:
      ```bash
      git clone https://github.com/seu-usuario/calculadora.git
      cd calculadora
      ```

2. Compile o projeto:
      ```bash
      javac -d bin src/**/*.java
      ```

3. Execute a aplicação:
      ```bash
      java -cp bin calculadora.Calculator
      ```

## Exemplo de Uso

1. Ao iniciar o programa, você verá o seguinte menu:
      ```
      ===== CALCULADORA =====

      Insira dois números para obter um resultado!
      ```

2. Insira dois números e escolha uma operação:
      ```
      Insira o primeiro número: 10
      Insira o segundo número: 5

      Agora escolha uma operação:
      - Adição
      - Subtração
      - Multiplicação
      - Divisão
      - Sair
      : Adição
      ```

3. O resultado será exibido:
      ```
      Resultado: 15.0
      ```

4. Para sair, digite `Sair`:
      ```
      Até a próxima!
      ```

## Como Funciona

### Reflexão

A classe [`Factory`](#filepath:c:\Users\paulo\Documents\GitHub\PS\Exercicios\calculadora\factory\Factory.java) utiliza **Reflexão** para instanciar dinamicamente classes de operação com base no nome fornecido pelo usuário. Por exemplo, ao digitar "Addition", a classe `calculadora.models.Addition` é carregada e instanciada em tempo de execução.

```java
public static Operators factory(String name) {
          try {
                    Object instantiatedClass = Class.forName("calculadora.models." + name).getDeclaredConstructor().newInstance();
                    return (Operators) instantiatedClass;
          } catch (Exception e) {
                    return null;
          }
}
```

### Padrão MVC

- **Model**: Contém as classes de operação (`Addition`, `Subtraction`, etc.), que implementam a interface `Operators`.
- **View**: A interação com o usuário é gerenciada pela classe `Calculator`.
- **Controller**: A lógica de controle e validação é implementada na classe `Factory`.

## Tratamento de Erros

- **Divisão por Zero**: A classe `Division` lança uma exceção personalizada ao tentar dividir por zero.
- **Entradas Inválidas**: O programa trata entradas inválidas, como valores não numéricos, e solicita ao usuário que tente novamente.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](../../LICENSE) para mais detalhes.

## Agradecimentos

- Inspirado no uso de **Reflexão** para criar sistemas dinâmicos.
- Desenvolvido como parte dos estudos sobre **Java** e padrões de design.
