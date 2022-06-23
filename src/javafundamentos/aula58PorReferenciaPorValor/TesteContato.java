/*

HEAP: memoria dinâmica de variáveis dedicado aos dados criados durante a execução do programa(runtime) - memória global do programa. Quando um programa
possui uma lista que cresce dinamicamente ele aloca na heap. Após alocar/desalocar a memoria sofre fragmentação Heap permite leitura e escrita.

STACK: pilha de funções - é uma área de memória que armazena dados ou ponteiros quando uma função é chamada e desalocada quando a função termina - memória
local da função. Funciona como FIFO. Quando uma função é chamada durante a execução de um programa é criado um bloco de memória(stack frame) no topo da
pilha de funções. nesse bloco existem referencias para todas as var/ponteiros da função chamada. Ao término da execução da função esse bloco é desalocado.
Como as variaveis dessa função são legíveis quando esta está em execução e após a execução são desalocadas não é possível chamar uma variável local no
escopo global. Cada stack frame possui as regiões: alocação de parametros da função - endereço de retorno - antigo topo da pilha - variáveis locais
(como se fosse uma pilha e - variáveis locais - esta no topo dela) Para cada função chamada há uma stack frame no topo da stack

**Velocidade: Além de depender do runtime da linguagem e da biblioteca que faz alocação, se a heap estiver muito fragmentada o acesso é relativamente baixo.
A stack possui ponteiros que podem rapidamente movimentar entre as regioes do stack frame.

**Desalocação: stack são desalocadas no final da execução da função. Heap são desalocadas explicitamente com delete/outros ou no final da execução do progama.

**Gerenciamento de meméria: stack são eficiente e não fragmentam, enquanto heap fragmenta muito e pode levar um mal aproveitamento do espaço.

**limite: Stack possui limite de crescimento de acordo com cada linguagem: exe chamada recursiva podem estourar a pilha facilmente. O Heap tem a alocação
 dinamica e quando não ha mais espaço é solicitado ao so através da chamada system call para liberar mais.

 */

package javafundamentos.aula58PorReferenciaPorValor;

public class TesteContato {
    private static void porReferencia(int valor, Contato contato){
        int novoValor = valor + 56;
        valor = novoValor;

        // contato = new Contato("Erick", 18); //não altera
        contato.setIdade(1); //altera
    }

    public static void main(String[] args) {

        Contato contato = new Contato("Santos", 88);
        int valor = 80;

        System.out.print(valor);
        System.out.println(" "+contato);

        porReferencia(valor, contato);

        System.out.print(valor);
        System.out.println(" "+contato);
    }
}


