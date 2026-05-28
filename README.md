````md
# 🐾 PetCare System

Sistema desktop de gerenciamento para clínica veterinária, desenvolvido em Java com interface gráfica Swing. Projeto acadêmico da disciplina de Programação Orientada a Objetos.

## 📌 Funcionalidades

### 🐶 Gerenciamento de Animais
- Cadastro de animais
- Listagem de animais cadastrados
- Alteração de dados
- Remoção de registros
- Associação de animais aos tutores

### 👤 Gerenciamento de Tutores
- Cadastro de tutores
- Listagem de tutores
- Alteração de dados
- Remoção de registros
- Visualização dos animais vinculados

### 👨‍⚕️ Gerenciamento de Funcionários
- Cadastro de veterinários
- Cadastro de recepcionistas
- Estrutura baseada em herança

### 📋 Gerenciamento de Prontuários
- Cadastro de prontuários veterinários
- Registro de procedimentos realizados
- Histórico básico de atendimento

### 🏷️ Gerenciamento de Categorias
- Cadastro e gerenciamento de categorias de animais

---

## 🗂️ Estrutura do Projeto

```text
src/
├── classes/
│   ├── Animal.java
│   ├── Categoria.java
│   ├── Funcionario.java
│   ├── Procedimento.java
│   ├── Prontuario.java
│   ├── Recepcionista.java
│   ├── Tutor.java
│   └── Veterinario.java
│
├── interfaces/
│   └── GerenciarProntuario.java
│
└── telas/
    ├── FormAnimais.java
    ├── FormCategoria.java
    ├── FormPrincipal.java
    ├── FormProntuario.java
    └── FormTutores.java
````

---

## 🧠 Conceitos de POO Aplicados

### ✅ Herança

As classes `Veterinario` e `Recepcionista` herdam da classe `Funcionario`.

### ✅ Encapsulamento

Todos os atributos são privados e acessados via getters e setters.

### ✅ Agregação

* `Animal` referencia um `Tutor`
* `Tutor` mantém uma lista de `Animal`
* `Prontuario` referencia `Animal`, `Veterinario` e `Procedimento`

### ✅ Polimorfismo

Sobrescrita do método `toString()` para exibição personalizada dos objetos.

### ✅ Interfaces

Uso da interface `GerenciarProntuario` para padronizar operações relacionadas aos prontuários.

---

## 🛠️ Tecnologias Utilizadas

* Java
* Java Swing
* NetBeans IDE
* ArrayList para persistência em memória
* Programação Orientada a Objetos (POO)

---

## ▶️ Como Executar

1. Abra o projeto no **NetBeans IDE**
2. Compile o projeto
3. Execute a classe:

```text
FormPrincipal.java
```

O sistema já inicializa com dados de exemplo para facilitar os testes.

---

## 🚧 Status do Projeto

### ✅ Funcionalidades implementadas

* CRUD de animais
* CRUD de tutores
* Cadastro de veterinários e recepcionistas
* Gerenciamento de categorias
* Sistema de prontuários
* Associação entre entidades

### 🔄 Melhorias futuras

* Persistência em banco de dados
* Sistema de login
* Agendamento de consultas
* Relatórios e exportação de dados
* Melhorias visuais na interface

---

## 📚 Objetivo Acadêmico

Este projeto foi desenvolvido com foco na prática de:

* Programação Orientada a Objetos
* Desenvolvimento desktop em Java
* Modelagem de classes e relacionamentos
* Interfaces gráficas com Swing
* Organização de projetos Java

---

## 👨‍💻 Autores 
- Arthur Mota
- Rebeca Alencar
```
```
