package Controller;

import Model.Equipe;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenda Paetzoldt
 */
public class Jogo {

    private Jogo() {
        equipeA = new Equipe();
        equipeB = new Equipe();
    }

    private static Jogo instance = null;

    public static Jogo getIntance() {
        if (instance == null) {
            instance = new Jogo();
        }
        return instance;
    }

    private List<JogoObservador> observadores = new ArrayList<>();
    private int set = 1;
    private String[] listaA = new String[5];
    private String[] listaB = new String[5];
    private Equipe equipeA;
    private Equipe equipeB;

    private int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    private void adicionarSet() {
        this.set++;
    }

    public void iniciar(String txt_eqpA, String txt_eqpB, String hora) {

        equipeA.setNomeEqpA(txt_eqpA);
        equipeA.setNomeEqpA(txt_eqpB);
        equipeA.setDataPartida(hora);
        equipeB.setDataPartida(hora);

    }

    public void Pontuar(int ponto) {
        switch (ponto) {
            case 1:
                equipeA.pontuar();
                break;
            case 2:
                equipeB.pontuar();
                break;
        }
        if (this.set < 5) {
            controlePontosPorSet(25, 30);
        } else {
            controlePontosPorSet(15, 20);
        }
        notificaPontuacaoAtualizada();

        controleSetsPorJogo();
    }

    private void controleSetsPorJogo() {
        if (equipeA.getSetsGanhos() == 3) {
            notificaVencedor(1);
            return;
        }
        if (equipeB.getSetsGanhos() == 3) {
            notificaVencedor(2);
            return;
        }
        notificaPontuacaoAtualizada();

    }

    private void vitoriaA(int pontosA, int pontosB) {
        listaA[getSet() - 1] = pontosA + " X " + pontosB;

    }

    private void vitoriaB(int pontosA, int pontosB) {
        listaB[getSet() - 1] = pontosA + " X " + pontosB;

    }

    private void controlePontosPorSet(int pontos, int limitePontos) {
        if (equipeA.getPontos() >= pontos && equipeA.getPontos() > equipeB.getPontos() + 1) {
            equipeA.pontuarSet();
            vitoriaA(equipeA.getPontos(), equipeB.getPontos());
            notificaAvenceu(1);
        }

        if (equipeA.getPontos() == limitePontos) {
            equipeA.pontuarSet();
            vitoriaA(equipeA.getPontos(), equipeB.getPontos());
            notificaAvenceu(1);
        }
        if (equipeB.getPontos() >= pontos && equipeB.getPontos() > equipeA.getPontos() + 1) {
            equipeB.pontuarSet();
            vitoriaB(equipeA.getPontos(), equipeB.getPontos());
            notificaBVenceu(2);
        }

        if (equipeB.getPontos() == limitePontos) {
            equipeB.pontuarSet();
            vitoriaB(equipeA.getPontos(), equipeB.getPontos());
            notificaBVenceu(2);
        }
    }

    public void addObs(JogoObservador obs) {
        this.observadores.add(obs);
    }

    public void removeObs(JogoObservador obs) {
        this.observadores.remove(obs);
    }

    private void notificaPontuacaoAtualizada() {
        for (JogoObservador obs : observadores) {
            obs.atualizarPontuacao(equipeA.getPontos(), equipeB.getPontos());
        }
    }

    private void notificaAvenceu(int p) {
        adicionarSet();
        equipeA.setPontos(0);
        equipeB.setPontos(0);
        for (JogoObservador obs : observadores) {
            obs.setEqpA(listaA);
        }
    }

    private void notificaBVenceu(int p) {
        adicionarSet();
        equipeA.setPontos(0);
        equipeB.setPontos(0);
        for (JogoObservador obs : observadores) {
            obs.setEqpB(listaB);
        }
    }

    private void notificaVencedor(int p) {
        for (JogoObservador obs : observadores) {
            obs.encerrar(p);
        }

    }

}
