Contribuindo
Este projeto utiliza a estrutura padrão do Maven. Mantenha o código da aplicação em `src/main/java`, os testes em `src/test/java` e os scripts do banco em `src/main/resources/db`.

Antes de enviar alterações
1. Execute `mvn test`.
2. Verifique se não há arquivos gerados em `target/`, `build/` ou `dist/`.
3. Atualize o README quando uma alteração afetar a forma de usar ou executar o projeto.

Branches
- `feature/nome-curto`: nova funcionalidade;
- `fix/nome-curto`: correção;
- `docs/nome-curto`: documentação;
- `chore/nome-curto`: manutenção do projeto.

Commits
Use uma mensagem curta no formato `tipo: descrição`.

- `feat: adiciona cadastro de serviços`;
- `fix: corrige cálculo do valor do agendamento`;
- `docs: atualiza instruções de execução`;
- `test: adiciona testes para assinante`;
- `chore: atualiza configuração do Maven`.

Pull requests
Descreva o objetivo da alteração, informe como ela foi validada e mantenha cada pull request focado em um único assunto.
