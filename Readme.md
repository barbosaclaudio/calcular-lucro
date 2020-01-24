# Bem vindo ao Calculador de Lucro
### Instalacão
  - Java 11
  - JUnit5
  - Maven
```sh
$ mvn clean install
$ cd target
$ java -jar calcular-lucro.jar [1,2,3,4,5,6]
```
### Exemplos
#### Determine o maior lucro dado esse array K de preços.
##### Exemplo 1:
- Input: [7,1,5,3,6,4]
- Output: 5
- Explicação: Este valor acontece quando compramos a ação no 2o dia e a vendemos no 5o dia (6 - 1)

##### Exemplo 2:
- Input: [7,6,4,3,1]
- Output: 0
- Explicação: Neste caso, não há nenhuma operação que possa ser feita que dê lucro.

### Observações
##### O lucro pode ser calculado por:

  - List < Integer >
  - int[]
  - String[]
  
##### Basta instanciar a classe CalcularLucro.