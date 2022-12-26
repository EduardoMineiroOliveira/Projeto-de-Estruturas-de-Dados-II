public class Arvore {

 public static void main(String[] args) {
       AVL avl = new AVL();
               
		avl.insereAVL(20);
		avl.insereAVL(15);
		avl.insereAVL(18);
		avl.insereAVL(29);
		avl.insereAVL(26);
		avl.insereAVL(27);  
                
              System.out.println("\n Dados Inseridos de Inicio: " );
           emNivel_Queue(avl.getRaiz());
            
            System.out.println("\n Busque: " + avl.searchAVL(18).
                     toString());
               
                avl.insereAVL(2);
                System.out.println("\n Inserimos o elemento 2 na arvore: " );
            emNivel_Queue(avl.getRaiz());
            
             avl.insereAVL(7);
                System.out.println("\n Inserimos o elemento 7 na arvore: " );
            emNivel_Queue(avl.getRaiz());
          
             avl.insereAVL(19);
                System.out.println("\n Inserimos o elemento 19 na arvore: " );
            emNivel_Queue(avl.getRaiz());    
                
             avl.insereAVL(10);
                System.out.println("\n Inserimos o elemento 10 na arvore: " );
            emNivel_Queue(avl.getRaiz());
            
            
           System.out.println("\n Inserimos novos elementos na Árvore: " );
            emNivel_Queue(avl.getRaiz());
            
            avl.removeAVL(18);
                System.out.println("\n Movemos a Raiz da arvore: " );
            emNivel_Queue(avl.getRaiz()); 
         
 }

    private static void emNivel_Queue(NoAVL raiz) {
        NoAVL nodeAux;
        Queue_Dinamic queue;

        queue = new Queue_Dinamic();
        queue.enqueue(raiz);
        while(!queue.isEmpty()){
            nodeAux = (NoAVL)queue.dequeue();
            if(nodeAux.getEsquerda()!=null){
                queue.enqueue(nodeAux.getEsquerda());
            }
            if(nodeAux.getDireita()!=null){
                queue.enqueue(nodeAux.getDireita());
            }
            System.out.println(nodeAux.getDado() + " ");
        }
    }
        
    }

    


        
    



 
    
    

