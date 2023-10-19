package settings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogs {
    
    public static void showCannotBeEmptyMessage(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "All areas have to be filled. ");
    }
    
    public static void showDefaultMessage(JFrame frame,String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
    
    public static int showAcceptMessage(JFrame frame,String message) {
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, message, "WARNING!", optionType);
        //System.out.println(selected);
        if(optionType == selected) {
            return 1;
        }
        return 0;
    }
}
