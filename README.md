# Roteiro Prático sobre Remote Method Invocation (RMI)
Roteiro prático sobre Remote Method Invocation (RMI) 

Este roteiro prático detalha o exemplo disponibilizado pela [Oracle](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html), que apresenta as APIs para implementação de Java Remote Method Invocations (Java RMI).


> A interface de programação de aplicativos (API) Java Remote Method Invocation (RMI) permite comunicações de cliente e servidor pela rede. Normalmente, os programas clientes enviam solicitações a um programa servidor, e o programa servidor responde as solicitações. Um exemplo comum é o compartilhamento de um programa de processamento de texto em uma rede. O processador de texto é instalado em um servidor e quem quiser utilizá-lo inicia-o em sua máquina. A invocação envia uma solicitação a um programa servidor para acesso ao software, e o programa servidor responde disponibilizando o software ao solicitante. A API RMI permite criar um objeto de servidor remoto acessível publicamente, permitindo comunicações entre cliente e servidor por meio de chamadas de método simples no objeto de servidor. Os clientes podem se comunicar facilmente diretamente com o objeto servidor e indiretamente entre si por meio do objeto servidor usando Uniform Resource Locators (URLs) e HyperText Transfer Protocol (HTTP)." -- Adaptado, [Oracle, Remote Method Invocation](https://www.oracle.com/java/technologies/jpl1-remote-method-invocation.html)



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

# Parte 4: Entrega

Após executar e compreender o código, adapte o projeto acima para fazer uma calculadora via chamadas remotas. A calculadora deve receber dois operadores e realizar quatro operações básicas definidas na sua interface: adição, subtração, multiplicação, e divisão.

Entrega individual.

Submeter um relatório via Canvas, que inclui:

- Cabeçalho com o nome completo e matrícula.
- Link para o projeto no GitHub.
- Breve descrição da solução proposta.
- Casos de teste da calculadora, mostrando o console com as suas respectivas entradas e saídas.



# Referências

- https://github.com/alinebrito/AulaPraticaRMI
