# Aplicações de Terminal e Fundamentos de Java

Este material reúne os recursos fundamentais utilizados nos exercícios de lógica de programação em Java.

A documentação está organizada progressivamente em seis sessões:

1. **Básico**
2. **Condicionais**
3. **Repetição**
4. **Vetores**
5. **Strings**
6. **Strings e Matrizes**

O foco é desenvolver a lógica de programação. Portanto, será abordado apenas o essencial para o dia a dia do desenvolvedor.

> **Aviso sobre versões da linguagem:** Java recebe atualizações frequentes, e novos recursos podem alterar ou complementar estruturas apresentadas aqui. Caso você encontre, no dia a dia, uma sintaxe ou abordagem diferente da descrita neste material, verifique se houve alguma mudança oficial na linguagem. A estrutura encontrada pode exigir uma abordagem mais recente e talvez não funcione exatamente da mesma forma que os exemplos apresentados.

---

# 1. Básico

## Estrutura de um programa Java

Todo programa Java executável possui um método `main`, que representa o ponto de entrada da aplicação.

```java
package exemplo.basico;

public class Main {
    public static void main(String[] args) {
        // lógica do programa
    }
}
```

Quando o programa precisa receber dados do usuário, utilizamos `Scanner`.

```java
package exemplo.basico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // entrada e lógica do programa
        }
    }
}
```

O `try-with-resources` garante que o `Scanner` seja fechado automaticamente ao final do bloco.

---

## Entrada de dados com `Scanner`

A classe `Scanner` permite ler dados fornecidos pelo usuário através do terminal.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

### Principais métodos

| Método          | Uso                   |
| --------------- | --------------------- |
| `next()`        | Lê uma palavra        |
| `nextLine()`    | Lê uma linha completa |
| `nextInt()`     | Lê um `int`           |
| `nextDouble()`  | Lê um `double`        |
| `nextBoolean()` | Lê um `boolean`       |

Exemplo:

```java
try (Scanner scanner = new Scanner(System.in)) {
    String nome = scanner.next();
    int idade = scanner.nextInt();
    double altura = scanner.nextDouble();
}
```

---

## `next()` e `nextLine()`

`next()` lê apenas o próximo token.

```java
String nome = scanner.next();
```

Entrada:

```text
Eduardo Souza
```

Resultado:

```text
Eduardo
```

Já `nextLine()` lê toda a linha.

```java
String nome = scanner.nextLine();
```

Resultado:

```text
Eduardo Souza
```

Para exercícios que trabalham com frases ou nomes completos, `nextLine()` normalmente é a opção adequada.

---

## Atenção ao combinar `nextInt()` e `nextLine()`

Depois de utilizar:

```java
int idade = scanner.nextInt();
```

a quebra de linha gerada pelo ENTER permanece no buffer de entrada.

Se for necessário utilizar `nextLine()` imediatamente depois:

```java
int idade = scanner.nextInt();

scanner.nextLine();

String nome = scanner.nextLine();
```

O primeiro `nextLine()` consome a quebra de linha pendente.

---

## Saída de dados

### `print`

Não adiciona uma quebra de linha.

```java
System.out.print("Olá");
System.out.print(" mundo");
```

Resultado:

```text
Olá mundo
```

### `println`

Adiciona uma quebra de linha.

```java
System.out.println("Olá");
System.out.println("mundo");
```

Resultado:

```text
Olá
mundo
```

### `printf`

Permite formatar valores.

```java
System.out.printf("Idade: %d%n", idade);
```

Principais especificadores:

| Especificador | Tipo       |
| ------------- | ---------- |
| `%d`          | Inteiro    |
| `%f`          | Decimal    |
| `%s`          | `String`   |
| `%c`          | `char`     |
| `%b`          | `boolean`  |
| `%n`          | Nova linha |

Exemplo:

```java
System.out.printf("Nome: %s%n", nome);
System.out.printf("Idade: %d%n", idade);
System.out.printf("Altura: %.2f%n", altura);
```

---

## Variáveis e tipos básicos

```java
int idade = 20;
double altura = 1.75;
char inicial = 'E';
boolean aprovado = true;
String nome = "Eduardo";
```

Tipos frequentemente utilizados:

| Tipo      | Descrição           |
| --------- | ------------------- |
| `int`     | Inteiro             |
| `double`  | Número decimal      |
| `char`    | Um caractere        |
| `boolean` | Verdadeiro ou falso |
| `String`  | Texto               |

---

## Operadores aritméticos

```java
int soma = a + b;
int subtracao = a - b;
int multiplicacao = a * b;
int divisao = a / b;
int resto = a % b;
```

O operador `%` retorna o resto da divisão.

```java
int resto = 10 % 3;
```

Resultado:

```text
1
```

---

# 2. Condicionais

Condicionais permitem que o programa execute diferentes blocos de código dependendo de uma condição.

## `if`

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

---

## `if` e `else`

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

## `if`, `else if` e `else`

Utilizado quando existem várias possibilidades.

```java
if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```

As condições são avaliadas de cima para baixo. O primeiro bloco cuja condição seja verdadeira é executado.

---

## Operadores relacionais

| Operador | Significado    |
| -------- | -------------- |
| `==`     | Igual          |
| `!=`     | Diferente      |
| `>`      | Maior          |
| `<`      | Menor          |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |

Exemplo:

```java
if (idade >= 18) {
    // ...
}
```

---

## Operadores lógicos

### AND — `&&`

Todas as condições precisam ser verdadeiras.

```java
if (idade >= 18 && possuiDocumento) {
    System.out.println("Entrada permitida");
}
```

### OR — `||`

Pelo menos uma condição precisa ser verdadeira.

```java
if (dia == 6 || dia == 7) {
    System.out.println("Fim de semana");
}
```

### NOT — `!`

Inverte um valor booleano.

```java
if (!ativo) {
    System.out.println("Usuário inativo");
}
```

---

## `switch`

Pode ser utilizado quando uma variável possui um conjunto conhecido de valores. A forma moderna do `switch` utiliza setas (`->`), não exige `break` e evita a execução acidental dos casos seguintes.

```java
switch (opcao) {
    case 1 -> System.out.println("Cadastrar");
    case 2 -> System.out.println("Consultar");
    case 3 -> System.out.println("Sair");
    default -> System.out.println("Opção inválida");
}
```

Quando cada caso precisa executar várias instruções, utilize um bloco com chaves:

```java
switch (opcao) {
    case 1 -> {
        System.out.println("Cadastrar");
        System.out.println("Opção selecionada: 1");
    }
    case 2 -> {
        System.out.println("Consultar");
        System.out.println("Opção selecionada: 2");
    }
    case 3 -> {
        System.out.println("Sair");
    }
    default -> {
        System.out.println("Opção inválida");
    }
}
```

O `switch` moderno também pode ser utilizado como expressão, produzindo um valor:

```java
String mensagem = switch (opcao) {
    case 1 -> "Cadastrar";
    case 2 -> "Consultar";
    case 3 -> "Sair";
    default -> "Opção inválida";
};

System.out.println(mensagem);
```

Para os exercícios de lógica, `if/else` continua sendo uma ferramenta fundamental.

---

# 3. Repetição

Estruturas de repetição permitem executar um bloco várias vezes.

## `for`

Indicado quando sabemos ou conseguimos determinar a quantidade de repetições.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

Resultado:

```text
0
1
2
3
4
5
6
7
8
9
```

Estrutura:

```java
for (inicialização; condição; atualização) {
    // código repetido
}
```

---

## Contagem regressiva

```java
for (int i = 10; i >= 0; i--) {
    System.out.println(i);
}
```

---

## `while`

Indicado quando a quantidade de repetições depende de uma condição.

```java
int numero = 1;

while (numero <= 10) {
    System.out.println(numero);
    numero++;
}
```

A condição é verificada antes de cada execução.

---

## `do-while`

Executa o bloco pelo menos uma vez.

```java
int numero;

do {
    numero = scanner.nextInt();
} while (numero < 0);
```

A condição é verificada depois da execução.

---

## `break`

Interrompe a repetição.

```java
for (int i = 0; i < 100; i++) {
    if (i == 10) {
        break;
    }

    System.out.println(i);
}
```

---

## `continue`

Interrompe apenas a iteração atual e passa para a próxima.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue;
    }

    System.out.println(i);
}
```

Resultado:

```text
1
3
5
7
9
```

---

# 4. Vetores

Vetores, ou arrays unidimensionais, armazenam vários valores do mesmo tipo.

## Declaração

```java
int[] numeros;
```

## Criação

```java
int[] numeros = new int[5];
```

O vetor possui cinco posições:

```text
Índice:   0   1   2   3   4
Valor:   [ ] [ ] [ ] [ ] [ ]
```

Os índices começam sempre em `0`.

---

## Inicialização direta

Também podemos criar um vetor já preenchido:

```java
int[] numeros = {10, 20, 30, 40, 50};
```

Acessando elementos:

```java
System.out.println(numeros[0]);
System.out.println(numeros[3]);
```

Resultado:

```text
10
40
```

---

## Alterando elementos

```java
numeros[0] = 100;
```

Agora:

```text
[100, 20, 30, 40, 50]
```

---

## Tamanho do vetor

A propriedade `length` informa o número de elementos.

```java
int tamanho = numeros.length;
```

---

## Percorrendo um vetor

A estrutura mais comum é:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

---

## Preenchendo um vetor com `Scanner`

```java
try (Scanner scanner = new Scanner(System.in)) {
    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = scanner.nextInt();
    }
}
```

---

## Somando elementos

```java
int soma = 0;

for (int i = 0; i < numeros.length; i++) {
    soma += numeros[i];
}
```

---

# 5. Strings

`String` representa uma sequência de caracteres.

```java
String texto = "Java";
```

Strings são utilizadas constantemente em exercícios de processamento de texto.

---

## Tamanho

```java
int tamanho = texto.length();
```

Para:

```text
Java
```

o resultado é:

```text
4
```

---

## Acessando caracteres

```java
char primeiro = texto.charAt(0);
```

Resultado:

```text
J
```

Podemos percorrer uma `String`:

```java
for (int i = 0; i < texto.length(); i++) {
    System.out.println(texto.charAt(i));
}
```

---

## Conversão de maiúsculas e minúsculas

```java
String maiusculo = texto.toUpperCase();
String minusculo = texto.toLowerCase();
```

---

## Comparação de Strings

Para comparar o conteúdo de duas Strings, utilize `equals()`.

```java
if (nome.equals("Eduardo")) {
    System.out.println("Nome encontrado");
}
```

Não utilize `==` para comparar o conteúdo de Strings.

```java
// Evitar para comparação de conteúdo
nome == "Eduardo";
```

Use:

```java
nome.equals("Eduardo");
```

---

## `equalsIgnoreCase()`

Ignora diferenças entre maiúsculas e minúsculas.

```java
if (nome.equalsIgnoreCase("eduardo")) {
    System.out.println("Nome encontrado");
}
```

---

## `substring()`

Obtém uma parte da String.

```java
String texto = "Java";

String parte = texto.substring(0, 2);
```

Resultado:

```text
Ja
```

O índice inicial é incluído e o índice final não é incluído.

---

## `split()`

Divide uma String em partes e retorna um vetor de Strings.

```java
String frase = "Eduardo Souza";

String[] palavras = frase.split(" ");
```

Resultado:

```text
palavras[0] = "Eduardo"
palavras[1] = "Souza"
```

Esse recurso é particularmente útil para exercícios envolvendo nomes, palavras e frases.

---

## `trim()`

Remove espaços no início e no final da String.

```java
String texto = "   Java   ";

String resultado = texto.trim();
```

Resultado:

```text
Java
```

---

## Exemplo: percorrer e analisar uma String

```java
String texto = "Java";

int vogais = 0;

for (int i = 0; i < texto.length(); i++) {
    char caractere = texto.charAt(i);

    if (caractere == 'a' ||
        caractere == 'e' ||
        caractere == 'i' ||
        caractere == 'o' ||
        caractere == 'u') {

        vogais++;
    }
}

System.out.println(vogais);
```

Esse tipo de combinação entre `String`, `char`, `for` e `if` aparece frequentemente em exercícios de lógica.

---

# 6. Strings e Matrizes

Esta seção combina os conceitos anteriores para trabalhar com estruturas bidimensionais e processamento de dados.

## Matrizes

Uma matriz é um array bidimensional.

```java
int[][] matriz = new int[3][3];
```

Podemos visualizar:

```text
[ ][ ][ ]
[ ][ ][ ]
[ ][ ][ ]
```

A primeira dimensão representa as linhas e a segunda representa as colunas.

---

## Acessando elementos

```java
matriz[0][0] = 10;
matriz[1][2] = 20;
```

O primeiro índice representa a linha:

```java
matriz[linha][coluna]
```

---

## Percorrendo uma matriz

Utilizamos dois `for`:

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.println(matriz[i][j]);
    }
}
```

O primeiro `for` percorre as linhas.

O segundo percorre as colunas da linha atual.

---

## Preenchendo uma matriz

```java
try (Scanner scanner = new Scanner(System.in)) {
    int[][] matriz = new int[3][3];

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = scanner.nextInt();
        }
    }
}
```

---

## Exibindo uma matriz

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }

    System.out.println();
}
```

---

## Matrizes e condições

Podemos utilizar condicionais durante o percurso.

Por exemplo, para encontrar números pares:

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] % 2 == 0) {
            System.out.println(matriz[i][j]);
        }
    }
}
```

---

## Matrizes quadradas

Uma matriz quadrada possui a mesma quantidade de linhas e colunas.

Exemplo:

```java
int[][] matriz = new int[5][5];
```

Possui:

```text
5 linhas
5 colunas
25 elementos
```

Em uma matriz quadrada, a diagonal principal é formada pelos elementos em que:

```text
linha == coluna
```

Podemos acessá-la diretamente:

```java
for (int i = 0; i < matriz.length; i++) {
    System.out.println(matriz[i][i]);
}
```

---

## Strings armazenadas em vetores

Strings também podem ser armazenadas em arrays:

```java
String[] nomes = {
    "Eduardo",
    "Carlos",
    "Maria"
};
```

Percorrendo:

```java
for (int i = 0; i < nomes.length; i++) {
    System.out.println(nomes[i]);
}
```

---

## Strings armazenadas em matrizes

Também é possível trabalhar com matrizes de Strings:

```java
String[][] nomes = new String[2][3];
```

Preenchendo:

```java
nomes[0][0] = "Eduardo";
nomes[0][1] = "Carlos";
nomes[0][2] = "Maria";
```

Percorrendo:

```java
for (int i = 0; i < nomes.length; i++) {
    for (int j = 0; j < nomes[i].length; j++) {
        System.out.println(nomes[i][j]);
    }
}
```

---

# Progressão dos conceitos

A ordem recomendada para os exercícios é:

```text
Básico
   ↓
Condicionais
   ↓
Repetição
   ↓
Vetores
   ↓
Strings
   ↓
Strings + Matrizes
```

Os conceitos não são isolados. Os exercícios mais avançados combinam os anteriores.

Por exemplo:

```text
String
  +
for
  +
if
  +
charAt()
```

ou:

```text
Matriz
  +
for aninhado
  +
if
  +
operações matemáticas
```

Por isso, antes de avançar para matrizes, é importante dominar estruturas de repetição e vetores.

---

# Padrão utilizado nos exercícios

O padrão atual para exercícios que recebem entrada pelo terminal é:

```java
package exemplo.strings;

import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // entrada
            // processamento
            // saída
        }
    }
}
```

Os nomes `exemplo.basico` e `exemplo.strings` são utilizados apenas para indicar que os pacotes pertencem a exemplos relacionados aos respectivos conteúdos. Eles não representam pacotes obrigatórios nem precisam ser copiados exatamente para os exercícios.

A lógica do exercício deve permanecer dentro do bloco `try`.

Não é necessário escrever:

```java
Scanner scanner = new Scanner(System.in);

// ...

scanner.close();
```

quando se utiliza `try-with-resources`.

---

# Resumo

| Sessão                 | Principais conceitos                                       |
| ---------------------- | ---------------------------------------------------------- |
| **Básico**             | `Scanner`, entrada, saída, variáveis, operadores           |
| **Condicionais**       | `if`, `else`, `switch`, operadores relacionais e lógicos   |
| **Repetição**          | `for`, `while`, `do-while`, `break`, `continue`            |
| **Vetores**            | arrays, índices, `length`, percurso e processamento        |
| **Strings**            | `length`, `charAt`, `equals`, `substring`, `split`, `trim` |
| **Strings e Matrizes** | matrizes, `for` aninhado, diagonais, arrays de Strings     |

A documentação deve servir como referência para os exercícios, não como catálogo de todas as APIs disponíveis no Java. Recursos fora dessa sequência devem ser introduzidos somente quando um exercício realmente exigir.