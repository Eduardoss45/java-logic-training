# 🖥️ Aplicações de Terminal em Java (Windows)

Este guia apresenta as instruções básicas para desenvolver aplicações de terminal em Java no sistema operacional **Windows**. O objetivo é demonstrar como interagir com o usuário por meio do terminal, capturando entradas, exibindo saídas e executando comandos do sistema.

---

## 📌 Estrutura Básica de um Programa Java

Todo programa Java executável possui um método `main`, que é o ponto de entrada da aplicação.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lógica do programa

        scanner.close();
    }
}
```

---

## 📥 Entrada de Dados pelo Terminal

A forma mais comum de capturar dados digitados pelo usuário é utilizando a classe `Scanner`, disponível no pacote `java.util`.

### Exemplo

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

scanner.close();
```

### Principais Métodos do `Scanner`

| Método          | Descrição             | Exemplo                              |
| --------------- | --------------------- | ------------------------------------ |
| `nextInt()`     | Lê um número inteiro  | `int n = scanner.nextInt();`         |
| `nextDouble()`  | Lê um número decimal  | `double x = scanner.nextDouble();`   |
| `next()`        | Lê uma única palavra  | `String s = scanner.next();`         |
| `nextLine()`    | Lê uma linha completa | `String s = scanner.nextLine();`     |
| `nextBoolean()` | Lê valores booleanos  | `boolean b = scanner.nextBoolean();` |

### ⚠️ Atenção ao `nextLine()`

Após utilizar métodos como `nextInt()` ou `nextDouble()`, é necessário consumir a quebra de linha pendente:

```java
scanner.nextLine(); // Consome o ENTER pendente
String texto = scanner.nextLine();
```

---

## 📤 Saída de Dados no Terminal

A exibição de informações no terminal é realizada através da classe `System.out`.

```java
System.out.print("Mensagem sem quebra de linha");
System.out.println("Mensagem com quebra de linha");
System.out.printf("Valor formatado: %.2f%n", 10.5);
```

### Formatação com `printf`

| Especificador | Descrição  | Exemplo                  |
| ------------- | ---------- | ------------------------ |
| `%d`          | Inteiro    | `printf("%d", 10);`      |
| `%f`          | Decimal    | `printf("%.2f", 10.5);`  |
| `%s`          | String     | `printf("%s", "texto");` |
| `%n`          | Nova linha | `printf("Linha%n");`     |

---

## 🔐 Leitura Segura com `System.console()`

Para leitura de dados sensíveis, como senhas, pode-se utilizar a classe `Console`.

```java
import java.io.Console;

Console console = System.console();
if (console != null) {
    String usuario = console.readLine("Usuário: ");
    char[] senha = console.readPassword("Senha: ");
}
```

> **Observação:** `System.console()` funciona apenas quando o programa é executado diretamente no terminal (Prompt de Comando ou PowerShell), não em IDEs.

---

## ⚡ Alternativa ao `Scanner`: `BufferedReader`

Para maior controle sobre a leitura de dados, é possível utilizar `BufferedReader`.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in)
);

System.out.print("Digite um número: ");
int numero = Integer.parseInt(reader.readLine());
```

---

## ⏸️ Pausar a Execução

Para aguardar a interação do usuário antes de finalizar o programa:

```java
System.out.println("Pressione ENTER para continuar...");
scanner.nextLine();
```

Caso tenha sido utilizado `nextInt()` anteriormente:

```java
scanner.nextLine(); // Consome o ENTER pendente
scanner.nextLine(); // Aguarda nova entrada
```

---

## 🧹 Limpar a Tela do Terminal (Windows)

O Java não possui um comando nativo para limpar a tela, mas é possível executar o comando `cls` do Windows utilizando `ProcessBuilder`.

```java
try {
    new ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor();
} catch (Exception e) {
    e.printStackTrace();
}
```

---

## 🖥️ Executar Comandos do Sistema (Windows)

Para executar comandos do sistema operacional, utilize a classe `ProcessBuilder`.

### Abrir um novo Prompt de Comando

```java
try {
    new ProcessBuilder("cmd", "/c", "start")
        .start();
} catch (Exception e) {
    e.printStackTrace();
}
```

### Executar um comando específico

```java
try {
    new ProcessBuilder("cmd", "/c", "dir")
        .inheritIO()
        .start()
        .waitFor();
} catch (Exception e) {
    e.printStackTrace();
}
```

---

## 📊 Exemplo Completo

```java
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        System.out.println("Pressione ENTER para finalizar...");
        scanner.nextLine(); // Consome o ENTER pendente
        scanner.nextLine();

        scanner.close();
    }
}
```

---

## ✅ Boas Práticas

- Sempre feche o `Scanner` com `scanner.close()`.
- Utilize `printf` para saídas formatadas.
- Prefira `ProcessBuilder` em vez de `Runtime.exec`.
- Verifique se `System.console()` não é `null` antes de utilizá-lo.
- Trate exceções ao executar comandos do sistema.

---

## 📌 Resumo dos Recursos

| Funcionalidade      | Recurso Java                      |
| ------------------- | --------------------------------- |
| Entrada de dados    | `Scanner`                         |
| Saída de dados      | `System.out.print/println/printf` |
| Leitura de senha    | `System.console()`                |
| Leitura alternativa | `BufferedReader`                  |
| Pausar execução     | `scanner.nextLine()`              |
| Limpar tela         | `ProcessBuilder` com `cls`        |
| Executar comandos   | `ProcessBuilder`                  |

---

## 📄 Licença

Este material pode ser utilizado livremente para fins educacionais.
