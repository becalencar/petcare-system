# 🐾 PetCare System
 
> Sistema desktop de gerenciamento para clínica veterinária, desenvolvido em Java com interface gráfica Swing.
 
<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img alt="Swing" src="https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge"/>
  <img alt="NetBeans" src="https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white"/>
  <img alt="Status" src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge"/>
</p>
---
 
## 📋 Sobre o Projeto
 
O **PetCare System** é um sistema de gerenciamento desenvolvido como projeto acadêmico para a disciplina de **Programação Orientada a Objetos (POO)**. A aplicação simula o funcionamento de uma clínica veterinária, permitindo o controle de animais, tutores, veterinários, consultas, prontuários e procedimentos por meio de uma interface gráfica desktop.
 
O projeto aplica na prática os principais pilares da POO — herança, encapsulamento, polimorfismo, abstração e interfaces — em um cenário real e funcional.
 
---
 
## ✨ Funcionalidades
 
### 🐶 Gerenciamento de Animais
- Cadastro de animais com nome, espécie, raça, sexo, data de nascimento e peso
- Associação de cada animal a um tutor responsável
- Listagem, edição e remoção de registros
- IDs gerados automaticamente pelo sistema
### 👤 Gerenciamento de Tutores
- Cadastro de tutores com nome e telefone
- Vinculação de múltiplos animais a um mesmo tutor
- Listagem, edição e exclusão de registros
- Visualização dos animais associados ao tutor
### 👨‍⚕️ Gerenciamento de Veterinários
- Cadastro de veterinários com número de CRMV e especialidade
- Registro de telefones de contato com validação de 11 dígitos
- Herança da classe abstrata `Funcionario`
### 📋 Gerenciamento de Prontuários
- Criação de prontuários vinculados a animais
- Adição de procedimentos com nome, data, custo, relato, categoria e profissional responsável
- Visualização do histórico completo de procedimentos
- Cálculo automático do custo total dos procedimentos
- Contagem de procedimentos realizados
### 🩺 Gerenciamento de Consultas
- Registro de consultas com data, horário, diagnóstico e valor
- Vinculação da consulta ao animal e ao veterinário responsável
### 🏷️ Gerenciamento de Categorias
- Cadastro e gerenciamento de categorias para classificação de procedimentos
---
 
## 🧠 Conceitos de POO Aplicados
 
### Herança
As classes `Veterinario` e `Recepcionista` herdam da classe abstrata `Funcionario`, compartilhando atributos como código, nome e telefones, mas estendendo com seus próprios atributos específicos (ex: CRMV e especialidade para veterinários).
 
```
Funcionario (abstract)
├── Veterinario  (+ numCRMV, especialidade)
└── Recepcionista
```
 
### Encapsulamento
Todos os atributos de todas as classes são declarados como `private`, acessados e modificados exclusivamente por meio de métodos `getters` e `setters`, com validações aplicadas onde necessário (ex: código inválido, nome em branco, custo negativo).
 
### Abstração
A classe `Funcionario` é definida como `abstract`, impedindo sua instanciação direta e servindo como contrato base para os tipos de funcionários do sistema.
 
### Agregação
As entidades do sistema se relacionam por composição e agregação:
 
| Classe | Relacionamento |
|---|---|
| `Animal` | referencia um `Tutor` (seu dono) |
| `Tutor` | mantém uma `ArrayList<Animal>` de seus animais |
| `Prontuario` | referencia um `Animal` e contém uma `ArrayList<Procedimento>` |
| `Procedimento` | referencia um `Funcionario` e uma `Categoria` |
| `Consulta` | referencia um `Animal` e um `Veterinario` |
 
### Polimorfismo
O método `toString()` é sobrescrito (`@Override`) em todas as classes de modelo (`Animal`, `Tutor`, `Veterinario`, `Consulta`, `Prontuario`, `Procedimento`), permitindo representações textuais personalizadas de cada objeto.
 
### Interfaces
A interface `GerenciarProntuario` define o contrato de operações sobre prontuários. A classe `Prontuario` a implementa, fornecendo os corpos dos seguintes métodos:
 
```java
void inserirProcedimento(int codProcedimento, String nome, String data,
        double custo, Funcionario profissional, Categoria categoria, String relato);
 
String retornarTodosProcedimentos();
String retornarProntuarioCompleto();
double calcularCustoTotal();
int quantidadeDeProcedimentos();
```
 
---
 
## 🗂️ Estrutura do Projeto
 
```
petcare-system/
├── src/
│   ├── classes/
│   │   ├── Animal.java            # Entidade animal com atributos e vínculo com Tutor
│   │   ├── Categoria.java         # Categorias para classificação de procedimentos
│   │   ├── Consulta.java          # Registro de consultas veterinárias
│   │   ├── Funcionario.java       # Classe abstrata base para funcionários
│   │   ├── Procedimento.java      # Procedimentos realizados em prontuários
│   │   ├── Prontuario.java        # Prontuário do animal com lista de procedimentos
│   │   ├── Recepcionista.java     # Funcionário do tipo recepcionista
│   │   ├── Tutor.java             # Tutor/dono com lista de animais
│   │   └── Veterinario.java       # Funcionário do tipo veterinário
│   │
│   ├── interfaces/
│   │   └── GerenciarProntuario.java  # Interface com contrato de operações de prontuário
│   │
│   └── telas/
│       ├── FormPrincipal.java     # Tela principal / menu de navegação
│       ├── FormAnimais.java       # CRUD de animais
│       ├── FormTutores.java       # CRUD de tutores
│       ├── FormVeterinario.java   # CRUD de veterinários
│       ├── FormConsultas.java     # Registro e gestão de consultas
│       ├── FormProntuario.java    # Gestão de prontuários e procedimentos
│       ├── FormCategoria.java     # CRUD de categorias
│       └── Imagens/               # Recursos visuais da interface
│
├── build/                         # Arquivos compilados (.class)
├── dist/
│   └── SistemaRA-Clínica.jar     # JAR executável gerado
├── nbproject/                     # Configurações do NetBeans
├── build.xml                      # Script Ant de build
└── manifest.mf                    # Manifesto do projeto
```
 
---
 
## 🛠️ Tecnologias Utilizadas
 
| Tecnologia | Descrição |
|---|---|
| **Java** | Linguagem principal de desenvolvimento |
| **Java Swing** | Biblioteca para construção da interface gráfica desktop |
| **NetBeans IDE** | Ambiente de desenvolvimento utilizado |
| **Apache Ant** | Ferramenta de build (via `build.xml` do NetBeans) |
| **ArrayList** | Estrutura de dados para persistência em memória durante a execução |
 
---
 
## ▶️ Como Executar
 
### Pré-requisitos
- [JDK 8+](https://www.oracle.com/java/technologies/downloads/) instalado
- [NetBeans IDE](https://netbeans.apache.org/) (recomendado) **ou** terminal com `java` e `javac` no PATH
### Via NetBeans IDE (recomendado)
 
1. Abra o NetBeans IDE
2. Vá em **File → Open Project** e selecione a pasta `petcare-system`
3. Aguarde o projeto ser carregado
4. Clique em **Run Project (F6)** ou clique com o botão direito no projeto e selecione **Run**
> O ponto de entrada da aplicação é a classe `telas.FormPrincipal`.
 
### Via JAR executável
 
Caso prefira executar sem IDE, utilize o JAR já compilado presente em `dist/`:
 
```bash
java -jar dist/SistemaRA-Clínica.jar
```
 
### Via linha de comando (compilação manual)
 
```bash
# Na raiz do projeto
javac -d build/classes src/classes/*.java src/interfaces/*.java src/telas/*.java
 
# Executar
java -cp build/classes telas.FormPrincipal
```
 
> O sistema inicializa automaticamente com dados de exemplo para facilitar os testes.
 
---
 
## 📐 Diagrama de Classes (Simplificado)
 
```
┌─────────────────┐         ┌──────────────────┐
│   Funcionario   │◄────────│   Veterinario    │
│   «abstract»    │         │  + numCRMV       │
│  + codFunc      │◄────┐   │  + especialidade │
│  + nomeFuncionario│   │   └──────────────────┘
│  + telefones    │   │
└─────────────────┘   │   ┌──────────────────┐
                       └───│  Recepcionista   │
                           └──────────────────┘
 
┌──────────────┐    1      n ┌──────────────┐
│    Tutor     │────────────►│    Animal    │
│  + nome      │             │  + nome      │
│  + idTutor   │             │  + especie   │
│  + telefone  │             │  + raca      │
│  + listaAnimais│           │  + peso      │
└──────────────┘             └──────┬───────┘
                                    │ 1
                                    │
                             ┌──────▼───────┐
                             │  Prontuario  │◄──── «implements» ────┐
                             │ + codProntuario│                      │
                             │ + listaProcedimentos│       ┌─────────┴──────────┐
                             └──────────────┘           │ GerenciarProntuario │
                                    │ 1..n              │     «interface»     │
                                    │                   └────────────────────┘
                             ┌──────▼───────┐
                             │ Procedimento │
                             │  + nome      │
                             │  + data      │
                             │  + custo     │
                             │  + relato    │
                             └──────────────┘
 
┌──────────────┐
│   Consulta   │
│ + dtConsulta │
│ + horaConsulta│
│ + diagnostico│
│ + valorConsulta│
└──────────────┘
```
 
---
 
## 🚧 Status e Melhorias Futuras
 
### ✅ Implementado
- CRUD completo de Animais
- CRUD completo de Tutores
- CRUD completo de Veterinários
- CRUD de Categorias
- Registro e gestão de Consultas
- Sistema de Prontuários com Procedimentos
- Associações e relacionamentos entre entidades
- Interface gráfica funcional com Java Swing
- Dados de exemplo inicializados automaticamente
### 🔄 Possíveis Evoluções
- Persistência de dados em banco de dados relacional (ex: MySQL, SQLite)
- Sistema de autenticação com login e perfis de usuário
- Agendamento de consultas com calendário
- Geração de relatórios e exportação em PDF
- Notificações de retorno e vacinas
- Melhorias visuais e responsividade da interface
---
 
## 📚 Contexto Acadêmico
 
Este projeto foi desenvolvido como trabalho prático da disciplina de **Programação Orientada a Objetos**, com foco em:
 
- Modelagem de classes e relacionamentos entre entidades
- Aplicação dos quatro pilares da POO (herança, encapsulamento, polimorfismo e abstração)
- Uso de interfaces para definição de contratos
- Desenvolvimento de interface gráfica desktop com Java Swing
- Organização e estruturação de projetos Java com NetBeans/Ant
---
 
## 👨‍💻 Autores
 
| Nome | Papel |
|---|---|
| **Arthur Mota** | Desenvolvimento |
| **Rebeca Alencar** | Desenvolvimento |
 
---
 
<p align="center">Projeto acadêmico — Programação Orientada a Objetos</p>