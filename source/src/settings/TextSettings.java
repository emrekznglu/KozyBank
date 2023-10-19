package settings;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextSettings {
    
    /*
    -------------------------------------------------------------------------
    Focus Settings
    Changes color when it is focused.
    */
    private static String originalText;
    private static Color originalFgColor;
    public static void checkTheTextFocusGained(JTextField textField,String org){
     originalText = org;
     
     if(textField.getText().trim().equals(org)){
         originalFgColor = textField.getForeground();
         textField.setText("");
     }
     
    }
    /*
    Color returns original color when it is lost its focus
    */
     public static void checkTheTextFocusLost(JTextField textField) {
        if(textField.getText().trim().equals("")){
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        }
        else{
           textField.setForeground(Color.black);
        }
     }
     
     /*
     -------------------------------------------------------------------------
     Key Settings
     Only number method
     */
     public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
            char c = e.getKeyChar();
            if(!Character.isDigit(c)){
            e.consume();
          }
           }
        });
        
    }
    /*
     Only letters method
     */
    public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE) {
                    e.consume();
                }
            }

        });
    }
          /*
          -------------------------------------------------------------------------
          Limit Settings
          maximum character limit method
          */
          
          private static int limit;
          public static void setMaxLimit(JTextField textField, int lim){
              limit = lim;
              textField.setDocument(new PlainDocument(){
                  @Override
                  public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                  if(str == null)
                      return;
                  if((getLength()+str.length())<= limit)
                      super.insertString(offs, str, a); 
                  }
                  
              });
          }
          
          // minimum length limit control
          
          public static boolean isLengthShorter(int length,String str) {
        return (str.length() < length);
    }
          
          /*
          -------------------------------------------------------------------------
          Money Amount Settings
          */
          
         public static int checkTheTextKeyReleased(JTextField textField,int moneyLimit) {
        String text = textField.getText();
        if (!text.equals("")) {
            int amount = Integer.valueOf(text);
            if(amount > moneyLimit) {
                amount = moneyLimit;
                textField.setText(String.valueOf(amount));
            }
            return amount;
        } 
        return 0;
    }
          /*
          -------------------------------------------------------------------------
          Text Area Control Settings
          */
          
          public static boolean isTextAreaFill(JPanel panel){
              Component[] components = panel.getComponents();
              for (Component c:components){
                  if(c instanceof JTextField){
                      JTextField textField = (JTextField)c;
                      if (textField.getText().trim().equals("") && textField.isEnabled()) {
                          return false;
                      }
                  }
              }
          return true;
          }
}
