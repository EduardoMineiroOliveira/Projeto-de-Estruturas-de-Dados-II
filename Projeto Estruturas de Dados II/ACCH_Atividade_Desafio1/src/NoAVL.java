
public class NoAVL {
	private Object dado;   //Dado do nó
	private NoAVL pai;//Pai do nó
	private NoAVL esquerda;	//Filho Esquerdo
	private NoAVL direita;	//Filho Direito
	private int fb;	//Fator de Balanceamento
		
	public NoAVL(Object x, NoAVL p, NoAVL e, NoAVL d)	{
		dado = x;
		pai  = p;
		esquerda  = e;
		direita  = d;
                fb = 0;
	}
	
	public NoAVL() {
		this("",null,null,null);
	}
	
	public NoAVL(Object _dado) {
		this(_dado,null,null,null);
	}
	
	public Object getDado() {
		return dado;
	}
	
	public void setDado(Object _dado) {
		dado = _dado;
	}
	
	public NoAVL getPai() {
		return pai;
	}
	
	public void setPai(NoAVL _pai) {
		pai = _pai;
	}
	
	public NoAVL getEsquerda() {
		return esquerda;
	}
	
	public void setEsquerda(NoAVL _esq) {
		esquerda = _esq;
	}
	
	public NoAVL getDireita() {
		return direita;
	}
	
	public void setDireita(NoAVL _dir) {
		direita = _dir;
	}
	
	public void setFb(int _fb) {
		fb = _fb;
	}
	
	public int getFb() {
		return fb;
	}
	
}
