import java.awt.Container;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Grid extends JFrame {
    private Container pane;
    private JogoDaVelha jogo;

    Grid(JogoDaVelha jogo) {
        this.jogo = jogo;
        pane = getContentPane();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        pane.setLayout(new GridLayout(3,  3));
        for (int i = 0; i < 9; i++) {
            pane.add(botao());
        }
        pack();
        setVisible(true);
    }

    public String getValorBotao(int indice) {
        return ((JButton) pane.getComponent(indice)).getText();
    }

    public void popUp(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void alterarEstadoBotoes(boolean desabilitar) {
        for (Component component : pane.getComponents()) {
            ((JButton) component).setEnabled(!desabilitar);
        }
    }

    private JButton botao() {
        JButton botao = new JButton();

        botao.setPreferredSize(new Dimension(50, 50));
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                clicarBotao(botao);
            }
        });

        return botao;
    }

    private void clicarBotao(JButton botao) {
        if (!botao.getText().isEmpty()) {
            return; // Impede que um botão já marcado seja clicado novamente
        }
        botao.setText(jogo.getSimbolo());
        jogo.mudarSimbolo();
    }
}
