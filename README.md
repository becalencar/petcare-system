# PetCare System

Sistema desktop de gerenciamento para clínica veterinária, desenvolvido em Java com interface Swing. Projeto acadêmico da disciplina de Programação Orientada a Objetos.

## Funcionalidades

- Cadastro, listagem, alteração e remoção de **animais**
- Cadastro, listagem, alteração e remoção de **tutores**
- Gerenciamento de **funcionários** (veterinários e recepcionistas)
- Vinculação de animais aos seus respectivos tutores

## Estrutura do Projeto

```
src/
├── classes/
│   ├── Animal.java
│   ├── Tutor.java
│   ├── Funcionario.java
│   ├── Veterinario.java
│   └── Recepcionista.java
└── telas/
    ├── FormPrincipal.java
    ├── FormAnimais.java
    ├── FormTutores.java
    └── FormVeterinario.java
```

## Conceitos de POO aplicados

- **Herança**: `Veterinario` e `Recepcionista` estendem `Funcionario`
- **Encapsulamento**: atributos privados com getters/setters
- **Agregação**: `Animal` referencia um `Tutor`; `Tutor` mantém lista de `Animal`
- **Polimorfismo**: `toString()` sobrescrito em todas as classes

## Tecnologias

- Java (NetBeans IDE)
- Swing (GUI)
- ArrayList para persistência em memória

## Como executar

Abra o projeto no NetBeans e execute `FormPrincipal.java`. O sistema já inicializa com dados de exemplo para teste.

## Status

🚧 Em desenvolvimento — CRUD de animais, tutores e veterinários funcional. Funcionalidades pendentes a definir.
