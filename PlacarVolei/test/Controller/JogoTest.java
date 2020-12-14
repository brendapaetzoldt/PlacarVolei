package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brend
 */
public class JogoTest {

    public JogoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIniciar() {
        System.out.println("Iniciou uma nova partida");
        String txt_eqpA = "Equipe A";
        String txt_eqpB = "Equipe B";
        String hora = "09:88";
        Jogo instance = new Jogo();
        boolean expResult = true;
        boolean result = instance.iniciar(txt_eqpA, txt_eqpB, hora);

        assertEquals(expResult, result);
    }

    @Test
    public void testPontuar() {
        System.out.println("O ponto foi acrescido ao respectivo time");
        int ponto = 1;
        Jogo instance = new Jogo();
        boolean expResult = true;
        boolean result = instance.Pontuar(ponto);
        assertEquals(expResult, result);
    }

    @Test
    public void testControleSetsPorJogo() {
        System.out.println("Quantidades de sets por jogos estão corretos");
        Jogo instance = new Jogo();
        boolean expResult = true;
        boolean result = instance.controleSetsPorJogo();
        assertEquals(expResult, result);
    }

    @Test
    public void testControlePontosPorSet() {
        System.out.println("O set termina quando o limite máximo de pontos é atingido e não ultrapassado");
        int pontos = 25;
        int limitePontos = 30;
        Jogo instance = new Jogo();
        boolean expResult = true;
        boolean result = instance.controlePontosPorSet(pontos, limitePontos);
        assertEquals(expResult, result);

    }

    
    

}
