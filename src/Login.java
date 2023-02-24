import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Login {

    DBlogic dblogic = new DBlogic();

    ///jāskatās video ar darbībām 22.02.2023 lekcija

    public JPanel getMain_panel() { //izmantots getter metode
        return main_panel;
    }

    private JPanel main_panel;
    private JTextField textField;
    private JButton vienads;


    private JButton viens;

    private JButton divi;
    private JButton tris;
    private JButton cetri;
    private JButton pieci;
    private JButton sesi;
    private JButton septini;
    private JButton astoni;
    private JButton devini;
    private JButton nulle;
    private JButton reiz;
    private JButton dalits;
    private JButton plus;

    private JButton minus;

    private JButton komats;
    private JButton submit;
public Login() {

    vienads.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String x = viens.getText();
            String y = divi.getText();

        }
    });
}
}
