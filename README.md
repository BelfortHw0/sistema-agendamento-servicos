# AgendamentoSaaS — Landing Page & Planos

Bem-vindo ao repositório do **AgendamentoSaaS**! Este projeto é uma aplicação de gerenciamento de agendamentos desenvolvida com foco em arquitetura limpa, front-end e boas práticas de Engenharia de Software.

---

## Sobre o Projeto

A **Landing Page** do AgendamentoSaaS foi criada para apresentar as opções de planos de assinatura, ao permitir que o usuário escolha entre o **Plano Gratuito** e o **Plano Pro**, além de disponibilizar um formulário de cadastro.

### Tecnologias Utilizadas

* **HTML5 Semântico:** Estruturação organizada com `<header>`, `<main>`, `<section>`, `<article>`, `<form>` e `<footer>`.
* **CSS3 & Flexbox:** Estilização moderna, uso de variáveis de espaçamento, cantos arredondados, sombras de elevação e layout flexível e responsivo (`display: flex`).
* **Git & GitHub:** Controle de versão e versionamento do código.
* **Visual Studio Code:** Escrita e estruturação do código.
* **Extensão Live Server:** Visualização do desenvolvimento em tempo real.

---

## Funcionalidades da Interface

- [x] **Cabeçalho (`<header>`):** Apresentação e proposta de valor do serviço.
- [x] **Cartões de Planos (`<article>`):** Exibição lado a lado dos planos Gratuito e Pro com destaque visual para o plano principal.
- [x] **Formulário de Assinatura (`<form>`):** Campos validados para nome, e-mail e seleção de plano via menu suspenso.
- [x] **Design Responsivo:** Adaptação automática do layout para dispositivos móveis (smartphones) e desktops.
- [x] **Rodapé (`<footer>`):** Direitos autorais e encerramento semântico.

---

## Como Executar o Projeto Localmente

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/SeuUsuario/AgendamentoSaaS.git
   ```

2. **Navegue até a pasta do projeto:**
   ```bash
   cd AgendamentoSaaS
   ```

3. **Abra o arquivo `index.html`:**
   * Você pode dar duplo clique no arquivo `index.html` para abrir diretamente no seu navegador, ou
   * Executar a extensão **Live Server** no VS Code.

---

## Próximos Passos (Back-End)

- [ ] Conectar o formulário HTML a um controlador Java **Spring Boot** (`@PostMapping("/assinar")`).
- [ ] Criar a classe DTO/Form para captura e validação dos dados de entrada.
- [ ] Implementar a persistência do cadastro em banco de dados relacional (PostgreSQL/H2/MySQL com JPA/Hibernate).

---

**Desenvolvido por:** Pedro F. Belfort
**Foco:** Back-end Java & Engenharia de Software
