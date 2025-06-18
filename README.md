# bootcamp-santander-java-2025
bootcamp da dio em parceria com o Santander, esse repositório é para uso dos exercícios 

# 💳 Banco Digital Orientado a Objetos - DIO

Este projeto é uma simulação de um sistema bancário construído com Java, utilizando **Programação Orientada a Objetos (POO)** para consolidar conceitos como herança, abstração, encapsulamento, polimorfismo e reuso de código.

## 🚀 Funcionalidades

- Criar conta corrente
- Realizar depósitos e saques
- Transferir valores via PIX (simulado)
- Exibir extrato completo da conta com histórico
- Menu interativo no console

## 📐 Arquitetura

O projeto segue o padrão MVC dividido em:
- `model` → entidades como `Conta`, `Cliente`, `Transacao`
- `repository` → simula persistência em memória
- `service` → regras de negócio
- `app/Main.java` → interface interativa via terminal

## 🔧 Tecnologias utilizadas

- Java 17+
- Java Records e Enums
- Lombok (caso deseje automatizar `getters/setters`)
- Git & GitHub

## 🖥️ Como executar

```bash
git clone https://github.com/seu-usuario/banco-poo-dio
cd banco-poo-dio
javac app/Main.java
java app.Main