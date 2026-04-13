/*
a) Custo da inserção no meio.
Por que inserir no meio de um array é mais lento que inserir no meio de uma lista
encadeada? Pense no que cada estrutura precisa fazer com os elementos existentes.

-> O array por se basear em índices, quando acrescentamos ou removemos um certo dado 
no meio do array, precisamos mover todos os índices depois daquele acrescentado +1.
Já a lista não possui esse trabalho por não se basear em índices e sim em comprimento
total, tornando mais fácil acrescentar um dado na lista que no array, já que não
haverá troca de índices. Podemos notar isso quando percebemos que:

    Operação       | Array Dinâmico | Lista Encadeada
Inserção no início |     O(n)       |      O(1)


b) Custo de acesso por índice.
Para acessar o k-ésimo elemento, qual estrutura é mais rápida – o array ou a lista? Por
quê?

->Assim como já disse na questão anterior, o array é baseado numa lógica de índices, por 
conta disso o acesso é direto por indice seja ele em que posição estiver, já na lista é 
necessário percorrer k elementos para chegar ao desejado, por isso, o array é o melhor 
nesse caso. Além disso, sabemos que:

    Operação      | Array Dinâmico | Lista Encadeada
Acesso por índice |      O(1)      |     O(n)


c) Circularidade.
Seria possível resolver o Problema de Josephus usando um array em vez de uma lista
circular? Se sim, como ficaria a remoção? Seria mais ou menos eficiente?

-> Seria possível porém mais ineficiente, provavelmente teríamos que percorrer a lista
duas vezes se o número de casas a pular fosse maior que o array. Pensando em um programa 
para executar o Josephus, creio que seria necessário um laço for para remover as casas 
em que o "i" pecorreria x valores, ao passo que o tamanho do vetor permitisse, caso o 
tamanho do vetor seja menor que x, quando o i chegasse no final do vetor ele voltaria 
ao início, até alcançar e "andaria" até que completasse x e removeria o item ali presente.
Voltando à eficiência, lembrando que teríamos que remover diversas vezes itens no array, o
custo seria muito alto.

    Operação    | Array Dinâmico | Lista Encadeada
Remoção no Meio |     O(n)       |      O(1)**





*/
