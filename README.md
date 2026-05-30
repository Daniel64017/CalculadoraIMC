# Calculadora de IMC - Projeto de Faculdade

Este é um projeto simples de uma calculadora de IMC (Índice de Massa Corporal) desenvolvido em **Kotlin** para rodar no **Android Studio**. O projeto foi criado como parte de uma atividade prática da faculdade para a disciplina de Desenvolvimento Mobile.

O aplicativo calcula o IMC com base no peso e na altura informados pelo usuário e exibe o resultado em uma segunda tela, junto com uma tabela de classificação para facilitar a visualização.

## 🚀 Funcionalidades

- **Tela Inicial (MainActivity)**:
  - Entrada de dados de Peso (em kg) e Altura (em metros).
  - Validação de campos (avisa se o usuário esquecer de preencher ou colocar dados inválidos).
  - Tratamento de entrada de dados (aceita tanto ponto quanto vírgula para números decimais).
  - Botão "CALCULAR" que redireciona para a tela de resultados.

- **Tela de Resultados (ResultadoActivity)**:
  - Exibe o valor do IMC calculado e formatado com 1 casa decimal (ex: `22.4`).
  - Exibe uma tabela de referência de resultados (imagem de classificação do IMC).
  - Botão "VOLTAR" para retornar à tela de digitação de dados nativamente.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Kotlin
- **IDE**: Android Studio
- **Layouts**: ConstraintLayout, LinearLayout e ScrollView (para garantir que a tela não quebre ao abrir o teclado)
- **Componentes Visuais**: Material Design Components (TextInputLayout, MaterialButton, CardView)
- **Mínimo SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## 📂 Como Rodar o Projeto

1. Faça o clone ou baixe este repositório.
2. Abra o **Android Studio**.
3. Vá em **File > Open** e selecione a pasta do projeto `CalculadoraIMC`.
4. Aguarde a sincronização do Gradle terminar.
5. Rode o projeto em um emulador ou conecte seu celular via USB com a depuração ativada.

---
*Desenvolvido para fins acadêmicos.*
