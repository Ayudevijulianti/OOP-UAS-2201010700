package sipa.bem;

import java.sql.SQLException;

/**
 *
 * @author 2201010700_Ayudevi
 * tgl: 2024-06-19
 */
public class SIPABEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       // new jfrom1 ().setVisible(true);
       
       jForm1 jf = new jForm1();
       jf.setResizable(false);
       jf.setAlwaysOnTop(true);
       jf.setVisible(true);
    }
    
}
