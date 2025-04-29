# Projeto Calculadora MVC

Este é um projeto simples de calculadora implementado em **Java**, seguindo o padrão de design **MVC (Model-View-Controller)**. O projeto utiliza **Maven** para gerenciamento de dependências e suporta operações aritméticas básicas, como adição, subtração, multiplicação e divisão.

## Funcionalidades

- Realiza operações aritméticas básicas:
   - Adição
   - Subtração
   - Multiplicação
   - Divisão
- Implementa o padrão **MVC** para uma separação clara de responsabilidades.
- Utiliza **Reflection** para instanciar dinamicamente classes de operações.
- Trata erros como divisão por zero e entradas inválidas de forma elegante.

## Requisitos

- **Java 17** ou superior
- **Maven** (para construir e executar o projeto)

## Estrutura do Projeto

```
calculadoramvc/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── ifes/
│   │   │   │   │   ├── Application.java         # Ponto de entrada da aplicação
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── Controller.java      # Gerencia a lógica de negócios
│   │   │   │   │   │   └── Factory.java         # Instancia dinamicamente classes de operações
│   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── Operadores.java      # Interface para operações aritméticas
│   │   │   │   │   │   ├── Soma.java            # Operação de adição
│   │   │   │   │   │   ├── Subtracao.java       # Operação de subtração
│   │   │   │   │   │   ├── Multiplicacao.java   # Operação de multiplicação
│   │   │   │   │   │   └── Divisao.java         # Operação de divisão
│   │   │   │   │   ├── view/
│   │   │   │   │   │   └── Calculadora.java     # Gerencia a interação com o usuário
│   ├── test/                                    # Testes unitários (se aplicável)
├── pom.xml                                      # Arquivo de configuração do Maven
```

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/calculadoramvc.git
    cd calculadoramvc
    ```

2. Construa o projeto usando o Maven:
    ```bash
    mvn clean install
    ```

3. Execute a aplicação:
    ```bash
    mvn exec:java -Dexec.mainClass="com.ifes.Application"
    ```

## Exemplo de Uso

1. Ao executar a aplicação, você verá um menu como este:
    ```
    Menu
    - Soma
    - Subtracao
    - Multiplicacao
    - Divisao
    - Sair
    Escolha uma opção:
    ```

2. Insira dois números e escolha uma operação:
    ```
    Digite o primeiro número: 10
    Digite o segundo número: 5
    Escolha uma opção: Soma
    ```

3. O resultado será exibido:
    ```
    Resultado: 15.0
    ```

4. Para sair da aplicação, digite `Sair`:
    ```
    Bye bye.
    ```

## Como Funciona

### Padrão MVC

- **Model**: Contém as classes de operações (`Soma`, `Subtracao`, etc.) que implementam a interface `Operadores`.
- **View**: A classe `Calculadora` gerencia a interação com o usuário, como exibir menus e ler entradas.
- **Controller**: A classe `Controller` processa as entradas do usuário e delega tarefas às classes de modelo apropriadas. A classe `Factory` instancia dinamicamente as classes de operações usando **Reflection**.

### Reflection

A classe `Factory` utiliza **Reflection** para carregar e instanciar dinamicamente classes de operações com base na entrada do usuário. Por exemplo, se o usuário selecionar "Soma", a classe `com.ifes.models.Soma` será carregada e instanciada em tempo de execução.

```java
public static Operadores getOperador(String operador) {
      try {
            operador = operador.substring(0, 1).toUpperCase() + operador.substring(1).toLowerCase();
            Object instance = Class.forName("com.ifes.models." + operador).getDeclaredMethod("getInstance").invoke(null);
            return (Operadores) instance;
      } catch (Exception e) {
            return null;
      }
}
```

## Tratamento de Erros

- **Divisão por Zero**: A classe `Divisao` lança uma exceção ao tentar dividir por zero, e o erro é exibido ao usuário.
- **Entradas Inválidas**: O programa trata entradas inválidas (por exemplo, valores não numéricos) e solicita ao usuário que tente novamente.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](../../LICENSE) para mais detalhes.

## Agradecimentos

- Desenvolvido como parte de um estudo sobre **Java**, **Maven** e o padrão de design **MVC**.
- Inspirado na flexibilidade do **Reflection** para instanciar classes dinamicamente.