# CFK Conversor (Celsius, Fahrenheit, Kelvin) 🌡️

[pt-br](#-versão-em-português) | [en](#-english-version)

---

## 🇧🇷 Versão em Português

O **CFK Conversor** é uma aplicação em **Java** orientada a objetos desenvolvida para realizar a conversão precisa de temperaturas entre as escalas **Celsius (°C)**, **Fahrenheit (°F)** e **Kelvin (K)**.

O projeto utiliza uma estrutura modular, dividindo as regras e fórmulas de conversão de cada unidade de medida em classes específicas (`CelsiusClasse`, `FahrenheitClasse` e `KelvinClasse`), garantindo um código limpo, legível e de fácil manutenção.

---

### 📌 Sumário

- [Funcionalidades](#-funcionalidades)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Fórmulas Suportadas](#-fórmulas-suportadas)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Descrição dos Módulos](#-descrição-dos-módulos)

---

### ✨ Funcionalidades

- **Conversão Completa de Temperaturas:**
  - Celsius para Fahrenheit e Kelvin.
  - Fahrenheit para Celsius e Kelvin.
  - Kelvin para Celsius e Fahrenheit.
- **Arquitetura Orientada a Objetos:** Código encapsulado em classes para cada unidade de medida.
- **Pronto para IDEs:** Configurado nativamente para executar no IntelliJ IDEA ou via terminal Java.

---

### 📂 Estrutura do Projeto

```text
CFK-conversor-main/
├── src/
│   ├── Main.java                        # Ponto de entrada da aplicação
│   └── temp/
│       └── medida/
│           ├── CelsiusClasse.java        # Fórmulas e lógica para Celsius
│           ├── FahrenheitClasse.java     # Fórmulas e lógica para Fahrenheit
│           └── KelvinClasse.java         # Fórmulas e lógica para Kelvin
├── Temperature.iml                      # Configuração do módulo IntelliJ IDEA
└── .gitignore                           # Arquivos ignorados pelo Git
```

---

### 📐 Fórmulas Suportadas

$$
T_{Fahrenheit} = (T_{Celsius} \times \frac{9}{5}) + 32
$$

$$
T_{Kelvin} = T_{Celsius} + 273.15
$$

$$
T_{Celsius} = (T_{Fahrenheit} - 32) \times \frac{5}{9}
$$

$$
T_{Celsius} = T_{Kelvin} - 273.15
$$

---

### 🛠️ Pré-requisitos

- **Java Development Kit (JDK):** Versão 8 ou superior recomendada.

Para verificar se você tem o Java instalado:

```bash
java -version
javac -version
```

---

### 🚀 Como Executar

#### 1. Via Terminal

Navegue até a pasta raiz do projeto, compile o código e execute a classe principal:

```bash
# Navegar até o diretório src
cd src

# Compilar todos os arquivos Java
javac Main.java temp/medida/*.java

# Executar a aplicação
java Main
```

#### 2. Via IDE (IntelliJ IDEA, Eclipse, VS Code)

1. Abra a pasta do projeto na sua IDE favorita.
2. Certifique-se de que a pasta `src` esteja definida como a pasta de fontes (*Sources Root*).
3. Execute a classe `Main.java`.

---

### 🧩 Descrição dos Módulos

- **`Main.java`**: Executa a interface do utilizador no console e gerencia as chamadas de conversão.
- **`CelsiusClasse.java`**: Contém a lógica de conversão a partir do valor em Celsius.
- **`FahrenheitClasse.java`**: Contém a lógica de conversão a partir do valor em Fahrenheit.
- **`KelvinClasse.java`**: Contém a lógica de conversão a partir do valor em Kelvin.

---

## 🇺🇸 English Version

**CFK Converter** is an object-oriented **Java** application designed for converting temperatures between **Celsius (°C)**, **Fahrenheit (°F)**, and **Kelvin (K)** scales.

The project follows a modular structure, separating the conversion logic and formulas into specific measurement classes (`CelsiusClasse`, `FahrenheitClasse`, and `KelvinClasse`), ensuring clean, readable, and maintainable code.

---

### 📌 Table of Contents

- [Features](#-features-1)
- [Project Structure](#-project-structure-1)
- [Supported Formulas](#-supported-formulas-1)
- [Prerequisites](#-prerequisites-1)
- [How to Run](#-how-to-run-1)
- [Module Breakdown](#-module-breakdown-1)

---

### ✨ Features

- **Complete Temperature Conversions:**
  - Celsius to Fahrenheit & Kelvin.
  - Fahrenheit to Celsius & Kelvin.
  - Kelvin to Celsius & Fahrenheit.
- **Object-Oriented Design:** Encapsulated converter classes for each unit.
- **IDE Ready:** Pre-configured for IntelliJ IDEA or raw command-line execution.

---

### 📂 Project Structure

```text
CFK-conversor-main/
├── src/
│   ├── Main.java                        # Main application entry point
│   └── temp/
│       └── medida/
│           ├── CelsiusClasse.java        # Celsius conversion logic & formulas
│           ├── FahrenheitClasse.java     # Fahrenheit conversion logic & formulas
│           └── KelvinClasse.java         # Kelvin conversion logic & formulas
├── Temperature.iml                      # IntelliJ IDEA module file
└── .gitignore                           # Git ignore rules
```

---

### 📐 Supported Formulas

$$
T_{Fahrenheit} = (T_{Celsius} \times \frac{9}{5}) + 32
$$

$$
T_{Kelvin} = T_{Celsius} + 273.15
$$

$$
T_{Celsius} = (T_{Fahrenheit} - 32) \times \frac{5}{9}
$$

$$
T_{Celsius} = T_{Kelvin} - 273.15
$$

---

### 🛠️ Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher recommended.

Check your Java installation:

```bash
java -version
javac -version
```

---

### 🚀 How to Run

#### 1. Via Terminal

Navigate to the project directory, compile the Java files, and run the main class:

```bash
# Navigate to the src directory
cd src

# Compile all Java files
javac Main.java temp/medida/*.java

# Run the application
java Main
```

#### 2. Via IDE (IntelliJ IDEA, Eclipse, VS Code)

1. Open the project folder in your IDE.
2. Ensure the `src` folder is marked as the *Sources Root*.
3. Run `Main.java`.

---

### 🧩 Module Breakdown

- **`Main.java`**: Handles console interaction and invokes appropriate unit converters.
- **`CelsiusClasse.java`**: Encapsulates conversion calculations starting from Celsius values.
- **`FahrenheitClasse.java`**: Encapsulates conversion calculations starting from Fahrenheit values.
- **`KelvinClasse.java`**: Encapsulates conversion calculations starting from Kelvin values.