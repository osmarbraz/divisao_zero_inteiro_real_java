# Demonstração de Divisão por Zero em Java

## Descrição

Este programa demonstra as diferenças entre a divisão por zero utilizando os tipos inteiros (`int`) e os tipos de ponto flutuante (`double`) na linguagem Java.

O objetivo é mostrar que a mesma operação matemática pode produzir comportamentos diferentes dependendo do tipo de dado utilizado. Na divisão inteira por zero, o Java lança uma exceção. Na divisão com números de ponto flutuante, o resultado pode ser `Infinity` ou `NaN`, conforme o caso.

## Objetivos

- Compreender o comportamento da divisão por zero em Java.
- Diferenciar operações com números inteiros e números de ponto flutuante.
- Conhecer a exceção `ArithmeticException`.
- Compreender os valores especiais `Infinity` e `NaN` definidos pelo padrão IEEE 754.
- Conhecer o uso de `try` e `catch` para tratar exceções.

## Funcionamento do programa

O programa está dividido em duas partes.

### 1. Divisão inteira por zero

Inicialmente, são declaradas duas variáveis do tipo `int`:

```java
int a = 10;
int b = 0;
```

O programa tenta executar a divisão `a / b`.

Como a divisão inteira por zero não é permitida em Java, a operação lança uma exceção do tipo `ArithmeticException`.

O bloco `try` contém a operação que pode gerar a exceção, enquanto o bloco `catch` captura o erro e exibe uma mensagem informativa.

### 2. Divisão de ponto flutuante por zero

Na segunda parte, são utilizadas variáveis do tipo `double`:

```java
double x = 10.0;
double y = 0.0;
```

O programa executa duas operações:

- `x / y`: divide um número positivo por zero positivo, produzindo `Infinity`.
- `y / y`: divide zero por zero, produzindo `NaN`, que significa *Not a Number*.

Esses resultados seguem o comportamento definido pelo padrão IEEE 754 e não provocam automaticamente uma exceção nessas operações.

## Código-fonte

O arquivo `Principal.java` contém a implementação completa do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) e o Apache Maven instalados. O projeto contêm o arquivo `pom.xml` na raiz do diretório.

**1. Compile o projeto**

```bash
mvn compile
```

O Maven compila os arquivos-fonte do projeto e verifica se existem erros de compilação.

**2. Execute o programa**

```bash
mvn exec:java -Dexec.mainClass="Principal"
```

## Saída esperada

```text
Erro: divisao inteira por zero
Divisao real: Infinity
Zero dividido por zero: NaN
```

## Conceitos fundamentais

### Exceção `ArithmeticException`

A `ArithmeticException` é uma exceção lançada pelo Java quando ocorre uma operação aritmética inteira inválida, como a divisão inteira por zero.

O programa utiliza `try` e `catch` para capturar essa exceção e permitir que a execução continue.

### Infinity

`Infinity` representa o infinito positivo em operações de ponto flutuante. Neste exemplo, o resultado é produzido pela divisão de `10.0` por `0.0`.

O Java também permite representar `-Infinity`, que pode ocorrer, por exemplo, ao dividir um número negativo por zero positivo.

### NaN (*Not a Number*)

`NaN` representa um resultado que não corresponde a um número válido segundo as regras de ponto flutuante. Neste exemplo, ele é produzido pela operação `0.0 / 0.0`.

Um detalhe importante é que `NaN` não deve ser comparado utilizando `==` para verificar se um valor é NaN, pois essa comparação retorna `false`. Para realizar essa verificação, pode-se utilizar `Double.isNaN()`.

## Comparação entre os tipos

| Operação | Tipo | Resultado |
|---|---|---|
| `10 / 0` | `int` | Lança `ArithmeticException` |
| `10.0 / 0.0` | `double` | `Infinity` |
| `0.0 / 0.0` | `double` | `NaN` |

## Conclusão

O exemplo demonstra que Java trata a divisão por zero de maneira diferente conforme o tipo numérico utilizado.

Na divisão inteira, a operação gera uma exceção. Na divisão de ponto flutuante, o resultado segue as regras do IEEE 754 e pode ser infinito ou NaN.

Compreender essas diferenças é importante para escrever programas robustos, tratar situações excepcionais e interpretar corretamente os resultados de operações numéricas.