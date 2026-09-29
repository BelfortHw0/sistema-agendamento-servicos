# Contribuindo

Obrigado por contribuir com o **Sistema Agendamento Serviços**.

Este repositório está em evolução e segue uma organização baseada em Maven, com código Java em `src/main/java`, recursos em `src/main/resources` e testes em `src/test/java`.

## Antes de começar

1. Atualize sua branch local com a `main`.
2. Confirme que você está trabalhando em uma branch específica para a alteração.
3. Execute os testes antes de enviar suas mudanças.
4. Não envie arquivos gerados pelo Maven ou pela IDE.

## Estrutura principal

- `src/main/java`: código Java e componentes Spring Boot.
- `src/main/resources`: arquivos estáticos e scripts SQL.
- `src/test/java`: testes automatizados.
- `.github/workflows`: integração contínua.
- `pom.xml`: configuração do Maven e dependências.
- `README.md`: documentação geral do projeto.

## Branches

Use nomes curtos e descritivos:

- `feature/nome-da-funcionalidade`: nova funcionalidade.
- `fix/nome-do-problema`: correção de bug.
- `docs/nome-da-documentacao`: alterações de documentação.
- `refactor/nome-da-mudanca`: refatoração sem mudança de comportamento.
- `test/nome-do-teste`: criação ou melhoria de testes.
- `chore/nome-da-tarefa`: manutenção e configuração.

Exemplo:

```bash
git checkout -b feature/cadastro-servico
```

## Commits

Prefira mensagens curtas, objetivas e no formato:

```text
tipo: descrição
```

Tipos utilizados no projeto:

- `feat`: nova funcionalidade.
- `fix`: correção.
- `docs`: documentação.
- `test`: testes.
- `refactor`: refatoração.
- `chore`: manutenção.

Exemplos:

```text
feat: adiciona cadastro de serviços
fix: corrige validação do formulário
docs: atualiza instruções de execução
test: adiciona testes para assinante
refactor: simplifica modelo de plano
chore: atualiza configuração do Maven
```

## Desenvolvimento

Antes de abrir um pull request, execute:

```bash
mvn clean verify
```

Também confira:

- se a aplicação continua compilando;
- se os testes estão passando;
- se alterações no banco foram documentadas no README;
- se novos arquivos não são artefatos de compilação;
- se o código segue a organização atual do projeto.

Arquivos e diretórios gerados, como `target/`, não devem ser versionados.

## Alterações no banco de dados

Se uma mudança exigir uma nova tabela, coluna, relacionamento ou outra alteração de estrutura, atualize:

```text
src/main/resources/sql/schema.sql
```

E explique no pull request o impacto da mudança.

## Pull requests

Mantenha cada pull request focado em um único objetivo.

Na descrição, informe:

- o que foi alterado;
- por que a alteração foi necessária;
- como a mudança foi validada;
- se houve alteração no banco de dados ou na configuração do projeto.

Antes de enviar o pull request, confira:

```text
[ ] A alteração está em uma branch específica.
[ ] mvn clean verify foi executado com sucesso.
[ ] O README foi atualizado quando necessário.
[ ] Não há arquivos gerados ou temporários no commit.
[ ] A descrição do pull request explica a alteração.
```

## Boas práticas

- Prefira mudanças pequenas e fáceis de revisar.
- Mantenha nomes de classes, métodos e variáveis claros.
- Adicione ou atualize testes quando alterar regras de negócio.
- Evite misturar refatorações grandes com novas funcionalidades sem necessidade.
- Documente decisões que afetem a execução, o banco ou a arquitetura.

## Revisão

Todo pull request deve ser revisado antes de ser incorporado à `main`.

O workflow de integração contínua do GitHub Actions ajuda a verificar automaticamente a compilação e os testes do projeto.

---

Para dúvidas ou sugestões, abra uma issue descrevendo o contexto e o resultado esperado.
