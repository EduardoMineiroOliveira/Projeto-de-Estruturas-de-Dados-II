
//CLASE PRINCIPAL DOS METODOS / INSTRUÇÕES
package Atividade_ACCH;
public class TestaAVL1 {

    public static void main(String[] args) {
              
        
        
       //A) Arvore Inicial: 20, 15, 18, 29, 26, 27
       //---------------------------------------------------------------------------

        AVL avl = new AVL();
                System.out.println("\nInserimos Inicialmente: 20, 15, 18, 29, 26, 27");
                System.out.println("FICOU,\n ");
                //Vamos usar a mesma sequência do exemplo no material:
		avl.insereAVL("20");
		avl.insereAVL("15");
		avl.insereAVL("18");
		avl.insereAVL("29");
		avl.insereAVL("26");
		avl.insereAVL("27");               
                
                
                
                //Para Listar em ordem
                System.out.println("Em Ordem: ");
		System.out.println(avl.emOrdemString());
                
                
                
             
                
                
                
                
                
       //B) Busque o Nó 18
       //---------------------------------------------------------------------------       
         
/*     NÃO CONSEGUI INSERIR A INSTRUÇÃO DE BUSCAR CORRETAMENTE (Gera Erro)
       
      */ 
        AVL avlbusca = new AVL();
                System.out.println("\n\n\nVAMOS BUSCAR O NUMERO 18");
                System.out.println("RESULTADO,\n ");
                //Vamos usar a mesma sequência do exemplo no material:
		avl.insereAVL("20");
		avl.insereAVL("15");
		avl.insereAVL("18");
		avl.insereAVL("29");
		avl.insereAVL("26");
		avl.insereAVL("27");               
                

                //Para Listar em ordem
                System.out.println("Em Ordem: ");
		System.out.println(avlbusca.emOrdemString());
                
                //Para buscar o Nó 18
                int busca = 18;
                System.out.println("\nBuscando: ") busca, avlbusca.searchNoAVL(busca).toString());
		avl.emNivel();     
                //System.out.println()
        

                
          
                
                
        //C) Insira um a uma: 2, 7, 19, 10
        //---------------------------------------------------------------------------
        
        
        AVL avl2 = new AVL();
                //o que já tinhamos...
                avl.insereAVL("20");
		avl.insereAVL("15");
		avl.insereAVL("18");
		avl.insereAVL("29");
		avl.insereAVL("26");
		avl.insereAVL("27"); 
                //inserimos um a uma '2, 7, 19, 10'
                avl.insereAVL("2");
		avl.insereAVL("7");
		avl.insereAVL("19");   
                avl.insereAVL("10");  
                
                System.out.println("\n\n\n\n Depois inserimos +objetos: '2, 7, 19, 10'\n\nEm Ordem:");
                System.out.println(avl.emOrdemString());
                System.out.println("\nEm Nivel: ");
                avl.emNivel();    
                
                
                
                
                
//---------------------------------------------------------------------------------------
//2. Em seguida, exclua a raiz principal.
//---------------------------------------------------------------------------
// Lembrar que o nó eliminado será substituído pelo maior valor da subárvore esquerda.
//---------------------------------------------------------------------------

System.out.println("\nEXCLUINDO A RAIZ: ");
System.out.println(avl.removeAVL());     




//A RAIZ PRINCIPAL EXCLUIDA DEVERÁ SER "8"

                
		 
         
    }
    
}




                