# Calculadora Usando FastAPI

Esta é uma API de calculadora simples construída com **FastAPI**. A API fornece endpoints para operações aritméticas básicas, como adição, subtração, multiplicação, divisão, potência e raiz quadrada.

## Funcionalidades

- Realize operações aritméticas básicas:
  - Adição (`/add`)
  - Subtração (`/subtract`)
  - Multiplicação (`/multiply`)
  - Divisão (`/divide`)
  - Potência (`/power`)
  - Raiz quadrada (`/square_root`)
- Validação de entrada usando modelos **Pydantic**.
- Trata divisão por zero e entradas inválidas com mensagens de erro claras.

## Requisitos

- Python 3.9 a 3.12
- fastapi==0.95.2
- pydantic==1.10.7
- uvicorn==0.22.0

## Instalação

### Instalação via PyPI

Você pode instalar a calculadora diretamente do PyPI:

```bash
pip install calculadora-fastapi-paulo-lopes==0.1.6
```

### Instalação Local (a partir do código fonte)

Se quiser rodar ou modificar o projeto localmente, faça:

```bash
git clone https://github.com/seu-usuario/calculadora-fastapi.git
cd calculadora-fastapi
# Use uma versão Python até 3.12 (não use 3.13, pois não há suporte)
python -m venv venv
# Ative o ambiente virtual:
# No Windows:
venv\Scripts\activate
# No Linux/macOS:
source venv/bin/activate
pip install -r requirements.txt
```

## Como Executar

### Após instalar pelo PyPI

Basta rodar o comando abaixo para iniciar o servidor FastAPI:

```bash
calculadora-fastapi-paulo-lopes
```

O servidor será iniciado em `http://127.0.0.1:8000`.

### Após instalar localmente

Execute com Uvicorn a partir do diretório do projeto:

```bash
uvicorn app.main:app --reload
```

O servidor também estará disponível em `http://127.0.0.1:8000`.

## Documentação Interativa

Abra o navegador e acesse:
```
http://127.0.0.1:8000/docs
```
Isso abrirá a documentação interativa da API (Swagger UI).

## Endpoints da API

### Adição
- **Endpoint**: `/add`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  { "a": 5, "b": 3 }
  ```
- **Resposta**:
  ```json
  { "result": 8 }
  ```

### Subtração
- **Endpoint**: `/subtract`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  { "a": 5, "b": 3 }
  ```
- **Resposta**:
  ```json
  { "result": 2 }
  ```

### Multiplicação
- **Endpoint**: `/multiply`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  { "a": 5, "b": 3 }
  ```
- **Resposta**:
  ```json
  { "result": 15 }
  ```

### Divisão
- **Endpoint**: `/divide`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  { "a": 6, "b": 3 }
  ```
- **Resposta**:
  ```json
  { "result": 2 }
  ```
- **Tratamento de Erros**:
  - Se `b` for `0`, a API retorna:
    ```json
    { "detail": "Divisão por zero não é permitida" }
    ```

### Potência
- **Endpoint**: `/power`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  { "a": 2, "b": 3 }
  ```
- **Resposta**:
  ```json
  { "result": 8 }
  ```

### Raiz Quadrada
- **Endpoint**: `/square_root`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  { "a": 9, "b": 0 }
  ```
- **Resposta**:
  ```json
  { "result": 3 }
  ```
- **Tratamento de Erros**:
  - Se `a` for negativo, a API retorna:
    ```json
    { "detail": "Raiz quadrada de número negativo não é permitida" }
    ```

## Estrutura do Projeto

```
calculadora-fastapi/
├── app/
│   ├── main.py          # Ponto de entrada da aplicação FastAPI
│   ├── models.py        # Modelos Pydantic para requisição e resposta
├── lib/
│   ├── operations.py    # Funções de operações aritméticas
│   └── __init__.py
├── requirements.txt     # Dependências do projeto
├── README.md            # Documentação do projeto
├── setup.py             # Configuração de empacotamento
├── pyproject.toml       # Configuração do sistema de build
```

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](../../LICENSE) para mais detalhes.

## Agradecimentos

- Construído com [FastAPI](https://fastapi.tiangolo.com/)
- Inspirado na simplicidade do Python para construir APIs.
