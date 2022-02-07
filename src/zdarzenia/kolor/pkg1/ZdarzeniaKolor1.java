
package zdarzenia.kolor.pkg1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZdarzeniaKolor1 extends JFrame
{

    public ZdarzeniaKolor1()
    {
        super("Zdarzenia 1 sposob");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
    }
    public void initComponent()
    {
        czerwony.addActionListener(new sluchaczKoloru(Color.RED)); //dodalismy sluchacza do naszego buttona,
        niebieski.addActionListener(new sluchaczKoloru(Color.BLUE));//kiedy klikniemy button wywoluje sie to co sie dzieje w actionPerformed
        
        panel.add(czerwony);
        panel.add(niebieski);
        
        this.getContentPane().add(panel);
        
    }
    private class sluchaczKoloru implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) //kiedy klikne button powstaje obiekt typu ActionEvent,zostanie obzluzony kiedy dodamy sluchacza do buttona
        {
            panel.setBackground(kolor); //ustawiamy tlo paneli na kolor ktory przyslemy do sluchacza
        }

        public sluchaczKoloru(Color k) 
        {
            this.kolor = k;  
        }
        Color kolor;
    }
    JPanel panel = new JPanel();
    JButton czerwony = new JButton("kolorCzerwony"); //button np czerwony jest zrodlem ktore moze dodac sluchacza
    JButton niebieski = new JButton("kolorNiebieski");//sluchacze to obiekty ktore musza implementowac interfejs ActionListener

    
    public static void main(String[] args) {
        
        new ZdarzeniaKolor1().setVisible(true);
        
    }
    
}
