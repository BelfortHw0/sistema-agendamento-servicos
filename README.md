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

##  Como Executar os Testes
No terminal do projeto, execute:
```bash
mvn test

```

---

### 4.  **Fazer o Commit e Push das Melhorias**

Agora execute a sequência de comandos para salvar a organização no GitHub:

# 1. Adicionar as alterações (.gitignore, README.md, remoção do target)
git add .

# 2. Criar o commit de refatoração
git commit -m "docs: adiciona README.md e configura .gitignore para ignorar artefatos de build"

# 3. Enviar para o GitHub
git push origin main
