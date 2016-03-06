package gpjecc.blogspot.com;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BatalhaNaval extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, img2, img3;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("blue_square.png");
		img2 = new Texture("explode.png");
		img3 = new Texture("water1.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		int m=0, n=0;
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				batch.draw(img, m, n);
				m+=70;
			}
			n+=70;
			m=0;
		}
		
		// TESTEs
		batch.draw(img2, 100, 100);
		batch.draw(img3, 300, 0);
		
		batch.end();
	}
}

class Bomba {
	/* Jogador clicou, vou pegar as coordenadas e ir nessa posição da matriz e colocar água/bomba, de acordo
	 * com o posicionamento dos navios - código gerado pela Valesca;
	 * Algo tipo: 
	 * 	if (posição(x,y)==NAVIO) {
	 * 		mostraExplosão;
	 * }
	 * else {
	 * 		mostraÁgua;
	 * }
	 **/
}
