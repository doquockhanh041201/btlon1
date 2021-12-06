
package Login;

import javax.swing.JFrame;


public class JavaSwing {
    
    public JavaSwing(){
        JFrame Frame = new JFrame("Login Form");
        Frame.setSize(400,400);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        /*JavaSwing javaSwing = new JavaSwing();*/
        LoginForm log = new LoginForm();
        log.show();
    }
}
