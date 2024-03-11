
package pilhajava;
public class Pilha<T> {
    private int topo;
    private T[] elementos;
    
    public Pilha(int tamanho){
          elementos =(T[]) new Object[tamanho];
          this.topo = -1;
    }
    public boolean isFull(){
        return this.topo == elementos.length - 1;
        /* if(topo == elementod.leangth-1)
            return true;
        return false;
        */
    }
    public boolean isEmpty(){
        return this.topo == -1;
        /* if(this.topo == -1)
            return true;
        return false;
        */
    }
    public boolean push(T novoDado){
        if(!this.isFull()){
            //this.topo++;
            //elementos[topo] = novoDado;
            elementos[++topo] = novoDado;//o ++topo incrementa o topo primeiro antes de inserir novo dado.
            return true;
        }// fim if
        return false;
    }// fim push
    public T pop(){
        T retorno = elementos[topo];
        topo --;//topo-- decrementa o topo, pra inserir um novo dado em cima do dado antigo.
        return retorno;
        //return elementos[topo--];
    }
    public int size(){
        return this.topo++;
    }
    public T peek(){
        return elementos[topo];
    }
    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        for(int i=topo; i>=0;i--){
            retorno.append(elementos[i] + "\n");
            retorno.append("--------------");
            return retorno.toString();
        }
    }
}
