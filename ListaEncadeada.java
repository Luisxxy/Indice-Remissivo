public class ListaEncadeada{
  private  class Nodo{
    int linha;
    Nodo proximo;

    Nodo(int linha){
      this.linha = linha;
      this.proximo = null;
      
    }
  }
private Nodo inicio;
private Nodo fim;
private int tamanho;

 public ListaEncadeada(){
   this.inicio = null;
   this.fim = null;
   this.tamanho = 0;
 } 

public void inserir(int linha){
  Nodo novoNodo = new Nodo(linha);

  if(inicio = full){
    inicio = novoNodo;
    fim = novoNodo;
    
  } else {
    Nodo atual = inicio;
    while(atual != null){
      if(atual.linha == linha){
        return;
      }
      atual = atual.proximo;
      
    }
    if(linha < inicio.linha){
      novoNodo.proximo = inicio;
      inicio = novoNodo;
      
    } else {
      Nodo atual = inicio;
      while(atual.proximo != null && atual.proximo.linha < linha){
        atual = atual.proximo;
      }
      novoNodo.proximo = atual.proximo;
      atual.proximo = novoNodo;
      if(novoNodo.proximo == null){
        fim = novoNodo;
      }
    }
  }
  tamanho++
}

public boolean contem(int linha){
  Nodo atual = inicio;
  while(atual != null){
    if(atual.linha == linha){
      return true;
    }
    atual = atual.proximo;
  }
  return false;
}
@Override
public String toString(){
  if(inicio == null){
    return "[]";
  }
  StringBuilder sb = new StringBuilder();
  sb.append("[");
  Nodo atual = inicio;
  while(atual != null){
    sb.append(atual.linha);
    if(atual.proximo !=null){
      sb.append(", ");
    }
    atual = atual.proximo;
  }
  sb.append("]");
  return sb.toString();
}  
  public int getTamanho(){
    return tamanho;
  }
}
