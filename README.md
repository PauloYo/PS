# Repositório do Projeto de Sistemas (PS)

Este repositório é dedicado ao armazenamento de atividades e projetos desenvolvidos ao longo do semestre para a disciplina de **Projeto de Sistemas**. Ele serve como um local centralizado para organizar e gerenciar todos os exercícios, tarefas e mini-projetos relacionados à matéria.

## Estrutura do Repositório

O repositório está organizado em subdiretórios, cada um representando uma atividade ou projeto específico. Abaixo está uma visão geral da estrutura:

```
PS/
├── Exercicios/
│   ├── calculadoramvc/          # Um projeto de calculadora usando Java, Maven e o padrão MVC
│   │   ├── src/                 # Código-fonte da calculadora MVC
│   │   ├── pom.xml              # Arquivo de configuração do Maven
│   │   └── README.md            # Documentação do projeto da calculadora MVC
│   ├── calculadora/             # Um projeto simples de calculadora usando Java e Reflection
│   │   ├── factory/             # Classe Factory para instância dinâmica
│   │   ├── models/              # Classes de operações aritméticas
│   │   ├── Calculadora.java     # Classe principal para interação com o usuário
│   │   └── README.md            # Documentação da calculadora baseada em Reflection
│   ├── calculadora-fastapi/     # Uma API de calculadora construída com FastAPI
│   │   ├── app/                 # Código da aplicação FastAPI
│   │   ├── requirements.txt     # Dependências do Python
│   │   └── README.md            # Documentação da calculadora FastAPI
├── LICENSE                      # Licença do repositório
├── .gitattributes               # Configuração do Git para finais de linha
└── README.md                    # Documentação geral do repositório
```

## Visão Geral dos Projetos

### 1. **Calculadora MVC**
- Um projeto de calculadora em Java que segue o padrão de design **MVC (Model-View-Controller)**.
- Utiliza **Maven** para gerenciamento de dependências.
- Implementa operações aritméticas básicas com instância dinâmica de classes usando **Reflection**.

### 2. **Calculadora Baseada em Reflection**
- Uma calculadora simples em Java que utiliza **Reflection** para instanciar dinamicamente classes de operações.
- Suporta adição, subtração, multiplicação e divisão.
- Trata entradas inválidas e divisão por zero de forma adequada.

### 3. **Calculadora FastAPI**
- Uma API RESTful para realizar operações aritméticas, construída com **FastAPI**.
- Oferece endpoints para adição, subtração, multiplicação e divisão.
- Inclui validação de entrada usando **Pydantic** e tratamento de erros para divisão por zero.

## Como Usar

1. Navegue até o diretório do projeto específico (por exemplo, `Exercicios/calculadoramvc`).
2. Siga as instruções no arquivo `README.md` correspondente para construir, executar ou interagir com o projeto.

## Licença

Este repositório está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

## Agradecimentos

Este repositório foi criado como parte da disciplina de **Projeto de Sistemas** para facilitar o aprendizado e o desenvolvimento de conceitos de engenharia de software.