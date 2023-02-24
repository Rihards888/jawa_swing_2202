import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(login.getMain_panel());

//        frame.getContentPane();
        frame.setVisible(true);



    }
}