package presutot;

import com.formdev.flatlaf.FlatDarkLaf;
import interfaz.menuPrincipal;

public class Presutot {

    public static void main(String[] args) {

        FlatDarkLaf.setup();
        menuPrincipal MP = new menuPrincipal();
        MP.setVisible(true);
        
        
    }

}
