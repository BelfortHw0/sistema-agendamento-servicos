# Sistema Agendamento Serviços

Projeto Java/Spring Boot para a construção de uma base de sistema de agendamento de serviços com planos de assinatura. O estado atual concentra-se na landing page, no fluxo inicial de assinatura e na estrutura de domínio e banco de dados que servirão de base para a evolução do sistema.

## Objetivo

O projeto tem como objetivo evoluir de uma landing page com planos de assinatura para uma aplicação de gerenciamento de agendamentos, aplicando conceitos de Java, Spring Boot, testes automatizados, banco de dados relacional e boas práticas de Engenharia de Software.

## Estado atual

Atualmente, o projeto possui:

- Landing page responsiva com apresentação dos planos Gratuito e Pro.
- Formulário de assinatura com nome, e-mail e plano selecionado.
- Endpoint `POST /assinar` para receber os dados enviados pelo formulário.
- Modelo de domínio para `Assinante` e `Plano`.
- Controle de status do assinante com `enum` (`ATIVO` e `INATIVO`).
- DTO `AssinaturaForm` implementado como Java Record.
- Script SQL para criação das tabelas `planos` e `assinantes`.
- Testes automatizados com JUnit 5.
- Pipeline de integração contínua no GitHub Actions executando `mvn verify`.

## Tecnologias

| Tecnologia | Uso |
| --- | --- |
| Java 17 | Linguagem principal e versão de compilação do projeto |
| Spring Boot 3.2.5 | Back-end e exposição de rotas HTTP |
| Maven | Gerenciamento do projeto, dependências e testes |
| JUnit 5.10.3 | Testes automatizados |
| HTML5 | Estrutura da interface |
| CSS3 | Estilização e responsividade |
| MySQL | Estrutura inicial do banco de dados |
| Git e GitHub | Controle de versão e colaboração |
| GitHub Actions | Integração contínua |

## Estrutura do projeto

```text
sistema-agendamento-servicos/
├── .github/
│   ├── pull_request_template.md
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/
│   │   ├── java/io/github/belforthw0/agendamento/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── Assinante.java
│   │   │   ├── Plano.java
│   │   │   └── SistemaAgendamentoServicosApplication.java
│   │   └── resources/
│   │       ├── sql/
│   │       │   └── schema.sql
│   │       └── static/
│   │           ├── css/
│   │           │   └── style.css
│   │           └── index.html
│   └── test/
│       └── java/io/github/belforthw0/agendamento/
│           └── AssinanteTest.java
├── CONTRIBUTING.md
├── pom.xml
└── README.md
```

## Como executar localmente

### 1. Clonar o repositório

```bash
git clone https://github.com/BelfortHw0/sistema-agendamento-servicos.git
cd sistema-agendamento-servicos
```

### 2. Verificar a instalação do Java

```bash
java -version
```

O projeto é compilado para Java 17.

### 3. Compilar e executar os testes

```bash
mvn clean verify
```

Esse comando compila o projeto e executa a suíte de testes.

### 4. Executar a aplicação

A aplicação Spring Boot pode ser iniciada pela classe:

```text
io.github.belforthw0.agendamento.SistemaAgendamentoServicosApplication
```

Em uma IDE como o NetBeans ou IntelliJ IDEA, execute o método `main` dessa classe.

Após iniciar o servidor, a interface estática pode ser acessada pelo endereço padrão do Spring Boot:

```text
http://localhost:8080/
```

## Banco de dados

A estrutura inicial do banco está em:

```text
src/main/resources/sql/schema.sql
```

O script cria o banco `agendamento_saas_db` e as tabelas:

- `planos`
- `assinantes`

O relacionamento entre assinantes e planos é feito pela chave estrangeira `plano_id`.

## Testes

Os testes automatizados ficam em `src/test/java`.

Para executá-los:

```bash
mvn test
```

Para executar a validação completa usada no projeto:

```bash
mvn verify
```

## Integração contínua

O workflow do GitHub Actions está em:

```text
.github/workflows/ci.yml
```

Ele é executado em `push` na branch `main` e em pull requests, compilando e validando o projeto com Maven.

## Próximos passos

- [ ] Persistir assinantes no banco de dados.
- [ ] Integrar a aplicação Spring Boot ao banco de dados.
- [ ] Implementar cadastro e gerenciamento de serviços.
- [ ] Implementar criação e gerenciamento de agendamentos.
- [ ] Adicionar validações aos dados recebidos pelo formulário.
- [ ] Ampliar a cobertura de testes unitários e de integração.
- [ ] Melhorar o tratamento de erros e respostas da API.
- [ ] Evoluir a interface para os fluxos de agendamento.

## Contribuição

As orientações para contribuir com o projeto estão em [CONTRIBUTING.md](CONTRIBUTING.md).

## Autor

**Pedro F. Belfort**

Projeto desenvolvido para estudo e prática de Java, Spring Boot, SQL, testes e Engenharia de Software.
