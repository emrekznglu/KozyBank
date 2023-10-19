package settings;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconSettings {

    
    private static Icon originalIcon;
    
    public static void changeIcon(JLabel label,String fileName) {
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/src/icons/"+fileName+".png")));
    }
    
    public static void setOriginalIcon(JLabel label) {
        label.setIcon(originalIcon);
    }
    
}

