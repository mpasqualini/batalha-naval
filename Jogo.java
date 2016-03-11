package tst;

import java.util.Random;

//package gpjecc.blogspot.com;

class Navio {
	/* Eu ia fazer uma classe chamando todo mundo aí embaixo - cada navio, pois guarda 2 dados importantes - porque aí eu conseguiria
	 * passar lá na função verificaTamanho(), mas eu preciso de pensar em uma outra forma porque tô achando isso esquisito (RESOLVIDO: atributos
	 * com visibilidade static)
	 * 
	 * Mamífero contém CACHORRO
	 * Navio contém PortaAvioes (etc), ou seja, Navio é a superclasse;
	 */
}

// AS 4 CLASSES SEGUINTES SÃO FILHAS DA CLASSE Navio (?):
class PortaAvioes {
	static int tamanho=5;
	static int qtde=1;
}

class NavioGuerra {
	static int tamanho=4;
	static int qtde=2;
}

class Submarino {
	static int tamanho=3;
	static int qtde=3;
}

/*final*/ class Patrulha {
	static int tamanho=2;
	static int qtde=4;
	
	//private Patrulha(){}
}
/* static pois não precisarão ser instanciadas */

class Posicionamento {
	/* Eu basicamente chamaria os métodos dessa classe lá na classe Tabuleiro, seriam modelos que funcionariam para todos os tipos
	 * de navio que temos;
	 * Pensar na visibilidade dos métodos e atributos depois porque agora tá me confundindo */
	
	int linha, coluna, rotacao;
	boolean horizontal=navioHorizontal(rotacao);
	
	void geraAleatorio() {
		Random m=new Random();
		Random n=new Random();
		Random r=new Random();
		
		linha=m.nextInt(10);
		coluna=n.nextInt(10);
		rotacao=r.nextInt(1000);
	}
	
	boolean navioHorizontal(int rotacao) {
		if (rotacao%2==0) {
			return true; // (é H);
		}
		else {
			return false; // (é V);
		}
	}
	
	/*boolean verificaTamanho(int Patrulha.tamanho, boolean horizontal) {
		 * "Patrulha.tamanho" é só um exemplo, tem que funcionar para todos os tipos de navios
		 * 
		 * Dúvidas em como passar essa classe que não precisa ser instanciada aqui. Lembrando que não existem classes
		 * estáticas (apenas se forem internas).
		 * 
		 * Essa classe verifica se o tamanho do navio que está sendo posicionado no momento cabe nos valores gerados 
		 * Retorna true se cabe; false caso contrário
		 * 
		 * if ()
		 *
		 
	}*/
	
	/*boolean verificaSobreposicao(/* não sei o que passaria aqui, pois teria que saber onde já foi posicionado o que ) {
		* Alguma forma de passar a linha e coluna e verificar se lá tem 1 porque se sim, vai sobrepor o novo navio que queremos 
		 * posicionar;
		 * 
		 *  Talvez criar um método que passe pelo tabuleiro nessas posições e retorne um boolean se todas as posições tiverem ocupadas e passar
		 *  esse resultado aqui, acho que é uma boa maneira de fazer essa verificação 
		 *  
		 *  if essaTerceiraFuncao==true; essa aqui vai dar true também (vai sobrepor) 
		 *  
		 *  verificaOcupado pode ser essaTerceiraFuncao 
		 *  
		 *  boolean verificaOcupado (int TipoNavio.tamanho, int linha, int coluna) {
		 *  	for (i=linha; i<TipoNavio.tamanho; i++) {
		 *  		// Se for HORIZONTAL -> varia coluna, fixa linha;
		 * 		}
		 * 		
		 * 		for (i=coluna; i<TipoNavio.tamanho; i++) {
		 * 			// Se for VERTICAL -> varia linha, fixa coluna;
		 * 		}
		 * 
		 * 		Como gerar H ou V? Pode ser com 2 aleatórios e se for par H, ímpar V (por exemplo);
		 *  }
		
		if verificaTamanho==true;
	}*/
	
	/* Só vou ir para o posicionamento mesmo - acessar linha/coluna gerada lá em cima e colocar 1/true nelas - se a primeira der true e a segunda
	 * false - caso contrário, gerar outros números aleatórios e fazer a verificação DE NOVO - aqui essa parte de verificar não está muito 
	 * eficiente, mas pensamos em otimização depois 
	 *  */
}

class Tabuleiro {
	protected boolean[][] x = new boolean[10][10];
	Navio qualquercoisa=new Navio();
	/* Talvez não possa ser privado para que a classe Navio acesse a matriz (repensar) */
	
	public void criaTabuleiro() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				x[i][j]=false;
			}
		}
	}
	
	public void mostraTabuleiro() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Jogo {
	public static void main(String args[]) {
		Tabuleiro tab=new Tabuleiro();
		//Navio testeNavio=new Navio();
		//testeNavio.geraAleatorios();
		tab.criaTabuleiro();
		tab.mostraTabuleiro();
		
		//System.out.println(Patrulha.tamanho); testando atributos static;
		
	}
}