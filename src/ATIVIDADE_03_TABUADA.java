import javax.swing.*;

public class ATIVIDADE_03_TABUADA {
    public static void main(String[] args) {
        String ex = "";

        //Esse for serve para criar uma tabuada do 1 ao 10 na vertical
        for (int a = 1; a <= 10; a++) {
            //Esse for serve para criar uma coluna horizontal
            for (int b = 1; b <= 5; b++) {
                //Adciona as strings de "x" e o /t cria o espaço de uma coluna
                ex += (b + "x" + a + " = " + (b * a) + " \t");
            }
            //Esse /n cria uma quebra de linha
            ex += (" ");
            ex += ("\n");
        }
        ex += (" ");
        ex += ("\n");
        //Esse for serve para criar uma tabuada do 1 ao 10 na vertical na segunda coluna
        for (int a = 1; a <= 10; a++) {
            //Esse for serve para criar uma coluna horizontal na segunda coluna
            for (int b = 6; b <= 10; b++) {
                //Adciona as strings de "x" e o /t cria o espaço de uma coluna
                ex += (b + "x" + a + "=" + (b * a) + " \t");
            }
            //Esse /n cria uma quebra de linha
            ex += (" ");
            ex += ("\n");

        }
        JTextArea JtxArea = new JTextArea(ex);
        JOptionPane.showMessageDialog(null, JtxArea);
    }
}

