import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public  class Vue extends JFrame{
  JPanel accueil;
  JButton niveau1;
  JButton niveau2;
  JButton niveau3;
  JButton niveau4;
  




  public  Vue  (){
  this.setTitle("Petrescue");
  this.setSize(1080, 720);
    this.setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
    accueil= new JPanel();
    accueil.setLayout(null);
    accueil.setBounds(0,0,1280,720);
  
  niveau1= new JButton("niveau1");
  niveau2= new JButton("niveau2");
  niveau3= new JButton("niveau3");
  niveau4= new JButton("niveau4");
  niveau1.setBounds( 300, 300, 100, 100);
  accueil.add(niveau1);

  

this.setContentPane(accueil);

  

  }

}