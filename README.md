# Sistema de Agendamento de Serviços

Projeto acadêmico em Java que simula o cadastro de clientes e serviços, a criação de agendamentos e o cálculo do valor total.

## Funcionalidades

- Cadastro de clientes
- Cadastro de serviços
- Criação de agendamentos
- Cálculo do valor do serviço conforme as horas informadas
- Acompanhamento do status do serviço

## Conceitos praticados

- Classes e objetos
- Encapsulamento com getters e setters
- Construtores
- Métodos com parâmetros e retorno
- Enumeração para status de serviço
- Organização de classes

## Tecnologias

- Java
- Apache Ant
- NetBeans

## Estrutura

```text
src/
├── Main.java          # Demonstração do sistema
├── Cliente.java       # Dados do cliente
├── Serviço.java       # Dados e status do serviço
└── Agendamento.java   # Relação entre cliente, serviço e horas
```

## Como executar

### Pelo NetBeans

1. Clone o repositório.
2. Abra o projeto no NetBeans.
3. Execute a classe `Main.java`.

### Pelo terminal

Com um JDK instalado, na raiz do repositório execute:

```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

## Status

Em desenvolvimento. O repositório representa uma prática de POO e pode evoluir com persistência de dados, validações e uma interface de usuário.

## Autor

Pedro Fabiano Belfort
