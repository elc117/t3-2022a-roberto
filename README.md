<h1> Trabalho 3: Aspectos do paradigma funcional em Java </h1>
<h2> Motivação </h2>
<p>
  Após experienciar as vantagens do paradigma funcional através do contato com a linguagem de programação Haskell, quis entender melhor se é possível, e se sim, como, aproveitá-las em Java. 
</p>
<p>
  Java foi escolhida para comparação porque eu já possuía algum contato prévio com a linguagem. Assim, torna-se mais viável realizar comparações e, ainda, adquirir novas habilidades na ferramenta. Além disso, outro motivo foi o contraste, dado que Java é uma linguagem essencialmente imperativa.
</p>
<h2>Resultados</h2>
<p>
  A metodologia escolhida para a pesquisa pode ser resumida em dois momentos: no primeiro, foram feitas pesquisas sobre a chegada de traços da programação funcional no Java que vêm acontecendo desde 2014. Em seguida, os principais conceitos aprendidos foram postos em prática através da reimplementação de exercícios previamente resolvidos em Haskell, mas agora com Java.
</p>
<p>
  O estudo se desenrolou em torno de Streams e lambdas, que são a porta de entrada ao paradigma funcional na linguagem. Lambdas implementam classes anônimas de maneira mais enxuta e de modo que elas não sejam declaradas antes do seu uso. Dessa forma, é possível utilizar apenas uma vez um código definido através de um lambda, analogamente ao que acontece em Haskell. Outro fator importante no estudo foi a descoberta das interfaces funcionais, que são interfaces que possuem apenas um método abstrato. Essas interfaces podem ser implementadas facilmente através do uso de lambdas, e são comumente usadas em conjunto a Streams. Alguns exemplos de interfaces funcionais muito usadas são:
  <ul>
    <li>Predicate: seu método abstrato recebe um parâmetro, executa algum processamento e retorna um boolean.</li>
    <li>Function: recebe um parâmetro, executa algum processamento e retorna um dado, sem restrição de tipo.</li>
    <li>Consumer: recebe um parâmetro e executa uma ação, mas não retorna nenhum valor.</li>
    <li>Comparator: recebe dois parâmetros e retorna 0 se os dois forem iguais, um inteiro negativo se o primeiro for menor ou um inteiro positivo se o primeiro for maior que o segundo.</li>
  </ul>
  Ademais, as Streams são um ponto de encontro dos conceitos mencionados acima. Elas podem ser criadas de diversas maneiras, e uma vez instanciadas, possuem a capacidade de invocar métodos que tomam como parâmetro interfaces funcionais, implementadas facilmente através de lambdas. Por exemplo:
  <ul>
    <li>Map: toma como parâmetro uma implementação de Function, que será aplicada a cada elemento do Stream e cujo resultado será retornado.</li>
    <li>Filter: recebe uma implementação de Predicate, aplica a cada elemento e retorna uma nova Stream contendo apenas os elementos cuja execução retornou true.</li>
  </ul>
  Tais métodos retornam novas Streams, sem modificar a entrada original, e permitem que outros métodos sejam chamados em cadeia.
</p>
<p>
   O código desenvolvido, que pode ser encontrado no repositório, possui comentários sobre definições e usos dos principais conceitos envolvidos.   
</p>
<h2>Constatações</h2>
<p>
  A programação funcional em Java é um recurso sutil, que pode deixar o código produzido mais legível e sucinto. As mudanças são poucas, mas podem facilitar bastante a escrita de códigos que são recorrentes no dia a dia do programador.
</p>
<p>
  Entretanto, as novidades não vão muito além disso. Os recursos não são suficientes para revolucionar a maneira como se desenvolve com a linguagem, tratando-se de um adicional à tradicional linguaguem, que apesar de tardio, é muito bem-vindo.
</p>
<p>
  Senti falta de alguns recursos muito úteis que existem em Haskell no Java. Destaco, entre eles, o let-in e where, que facilitam bastante a escrita de código mais longo, e o PatternMatching, cuja ausência implica num uso de recursão bastante diferente, por exemplo. A geração de listas em Haskell é outro diferencial notável que Java não possui com a mesma acessibilidade. 
</p>
<p> 
  Além disso, o princípio da imutabilidade é difícil de ser alcançado em Java, já que a orientação a objetos é muito atrelada a estados, o que vai na contramão da ideia. Para chegar em um resultado parecido, atributos precisam ser definidos como <i>final</i>, o que não é muito conveniente. 
</p>
<p>
  Em suma, acredito que valha a pena conhecer esses adicionais, contanto que não se eleve as expectativas demais sobre as possibilidades. 
</p>
<h2> Referências </h2>
<ul>
  <li>https://hackernoon.com/functional-programming-techniques-in-java-with-examples-8k1m3w85</li>
  <li>https://deepu.tech/functional-programming-in-java-for-beginners/</li>
  <li>https://www.javatpoint.com/java-8-method-reference</li>
  <li>https://www.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/</li>
  <li>https://www.baeldung.com/java-functional-programming</li>
  <li>https://www.geeksforgeeks.org/10-ways-to-create-a-stream-in-java/</li>
  <li>https://www.baeldung.com/java-stream-sum</li>
  <li>https://www.baeldung.com/java-collections-zip</li>
 </ul>
