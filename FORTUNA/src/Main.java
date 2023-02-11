import javax.swing.*;

public class Main {
    public static void main (String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventanaini f = new ventanaini();
                f.setVisible(true);
            }
        });
    }
}
