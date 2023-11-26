# Descrição
O projeto consiste em uma calculadora remota usando RMI, com quatro operações básicas entre dois operandos. 
- A classe Server contém a lógica das operações e gerencia a comunicação com a parte requisitante. 
- A classe Client recebe e apresenta as informações ao usuário durante as chamadas.


# Execução


Primeiro, compile os arquivos do lado do cliente:

```
cd client
javac *.java
```

Na pasta `client``, inicie também o registry:

```
rmiregistry 9401 &
```

Em seguida, compile o código do lado do servidor e execute:

```
cd server
javac *.java
java Server
```

Execute uma chamada remota na pasta `client` e observe a saída:
```
java Client
```


# Referências

- https://github.com/alinebrito/AulaPraticaRMI
