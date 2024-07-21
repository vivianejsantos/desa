# Desafio Controle de Fluxo

Este projeto implementa um sistema simples de Controle de Fluxo em Java, onde são recebidos dois números inteiros como parâmetros via terminal. A quantidade de interações é determinada pelo intervalo entre esses números e os números são impressos no console.

## Funcionalidades Implementadas

- Recebe dois números inteiros via terminal.
- Utiliza um loop (for) para imprimir os números incrementados a partir do primeiro número até o segundo número.
- Lança uma exceção customizada `ParametrosInvalidosException` se o primeiro parâmetro for maior que o segundo.


2. **Execução:**
   - Para executar o programa, passe dois números inteiros como argumentos da linha de comando:
     ```
     java Contador <primeiro_numero> <segundo_numero>
     ```
     Substitua `<primeiro_numero>` e `<segundo_numero>` pelos números desejados.

3. **Exceções:**
   - Se o `<primeiro_numero>` for maior que `<segundo_numero>`, será lançada a exceção `ParametrosInvalidosException` com a mensagem "O segundo parâmetro deve ser maior que o primeiro".

## Exemplo 
![image](https://github.com/user-attachments/assets/1b42d6f7-bef3-43c5-a6b5-2819b547a1a9)


![image](https://github.com/user-attachments/assets/6a464064-0ed1-4ead-8003-40d88efb302b)

