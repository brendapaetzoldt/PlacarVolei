package Model;

import java.util.Date;

/**
 *
 * @author Brenda Paetzoldt
 */
public class Equipe {

    private String nomeEqpA;
    private String nomeEqpB;
    private String dataPartida;
    private int pontos;
    private int setsGanhos;

    public Equipe(String nomeEqpA, String nomeEqpB, String dataPartida, int pontos, int setsGanhos) {
        this.nomeEqpA = nomeEqpA;
        this.nomeEqpB = nomeEqpB;
        this.dataPartida = dataPartida;
        this.pontos = pontos;
        this.setsGanhos = setsGanhos;
    }

    public Equipe(int pontos) {
        this.pontos = pontos;
    }

    public Equipe() {
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getSetsGanhos() {
        return setsGanhos;
    }

    public void setSetsGanhos(int setsGanhos) {
        this.setsGanhos = setsGanhos;
    }

    public void pontuar() {
        pontos++;
    }

    public void pontuarSet() {
        setsGanhos++;
    }

    public String getNomeEqpA() {
        return nomeEqpA;
    }

    public void setNomeEqpA(String nomeEqpA) {
        this.nomeEqpA = nomeEqpA;
    }

    public String getNomeEqpB() {
        return nomeEqpB;
    }

    public void setNomeEqpB(String nomeEqpB) {
        this.nomeEqpB = nomeEqpB;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public void setDataPartida(Date dataHoraAtual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
