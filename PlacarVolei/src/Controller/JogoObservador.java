package Controller;

/**
 *
 * @author Brenda Paetzoldt
 */
public interface JogoObservador {

    public void atualizarPontuacao(int a, int b);

    public void setEqpA(String[] listaA);

    public void setEqpB(String[] listaB);

    public void encerrar(int i);

}
