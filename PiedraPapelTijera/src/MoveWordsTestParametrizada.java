import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class MoveWordsTestParametrizada {

	private int res;//resultado esperado
	private String primero;//tirada jugador
	private String segundo;//tirada maquina

	public MoveWordsTestParametrizada( int r,String pri, String seg) {
		res=r;
		primero=pri;
		segundo=seg;		
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][]{
			//"TIJERAS", "PAPEL", "PIEDRA", "LAGARTO", "SPOCK"
			{0, "TIJERAS", "TIJERAS"},{0, "PAPEL", "PAPEL"},{0, "PIEDRA", "PIEDRA"},{0, "LAGARTO", "LAGARTO"},{0, "SPOCK", "SPOCK"},
			{1, "TIJERAS", "PAPEL"},{2, "TIJERAS", "PIEDRA"},{1, "TIJERAS", "LAGARTO"},{2, "TIJERAS", "SPOCK"},
			{2, "PAPEL","TIJERAS"},{1, "PAPEL","PIEDRA"},{2, "PAPEL","LAGARTO"},{1, "PAPEL","SPOCK"},
			{1, "PIEDRA","TIJERAS"},{2, "PIEDRA","PAPEL"},{1, "PIEDRA","LAGARTO"},{2, "PIEDRA","SPOCK"},
			{2, "LAGARTO","TIJERAS"},{1, "LAGARTO","PAPEL"},{2, "LAGARTO","PIEDRA"},{1, "LAGARTO","SPOCK"},
			{1, "SPOCK","TIJERAS"},{2, "SPOCK","PAPEL"},{1, "SPOCK","PIEDRA"},{2, "SPOCK","LAGARTO"}
		});
	}
	
	
	@Test
	public void testCheckWinner() {
		MoveWords mw = new MoveWords();		
		assertEquals(res, mw.checkWinner(primero, segundo));		
	}
}
