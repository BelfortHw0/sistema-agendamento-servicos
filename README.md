# Sistema de Agendamento de Serviços (SaaS)

Projeto desenvolvido em Java para gestão de assinaturas, planos e agendamentos de serviços.

##  Tecnologias Utilizadas
* **Java 17/21**
* **Apache Maven** (Gerenciador de dependências e compilação)
* **JUnit 5** (Testes de unidade automatizados)
* **MySQL** (Modelagem de banco de dados relacional)

##  Estrutura do Projeto
* `src/main/java`: Classes de domínio (`Plano`, `Assinante`) com encapsulamento e regras de negócio.
* `src/main/resources/sql`: Script DDL do banco de dados (`schema.sql`).
* `src/test/java`: Testes automatizados com JUnit 5.

##  Como Clonar e Executar o Projeto

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/BelfortHw0/sistema-agendamento-servicos.git

1. **Entrar na pasta do projeto:**

```
cd sistema-agendamento-servicos

```

1. **Compilar o projeto com o Maven:**

```
mvn compile
```

##  Como Executar os Testes
No terminal do projeto, execute:
```bash
mvn test

```

---

###  2. Comandos para Executar no Terminal (Git Bash / NetBeans)

Após criar e salvar o arquivo `README.md` e ter configurado o `.gitignore`, abra o terminal e execute estes três comandos, um de cada vez:

```bash
git add .

```

```
git commit -m "docs: adiciona README.md e configura .gitignore para ignorar artefatos de build"

```

```
git push origin main
