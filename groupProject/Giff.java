import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Giff{
    public Giff(String item) {
        try {
            URL url = new URL(item);
            Icon icon = new ImageIcon(url);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame("Animation");
            f.getContentPane().add(label);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (MalformedURLException m) {
            m.printStackTrace();
        }
        
    }
}
