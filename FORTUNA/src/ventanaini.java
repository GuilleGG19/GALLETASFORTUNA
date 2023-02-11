import javax.management.monitor.StringMonitor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaini extends JFrame {
    private JButton boton1;
    private JPanel panel1;
    public ventanaini(){
        add(panel1);

        setSize(300, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("guelcome");
        boton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Galleta g = new Galleta();
                String frases = g.frases().toString();
                JOptionPane.showMessageDialog(panel1, frases);

            }
        });

    }
}
