package pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import static sun.jvm.hotspot.HelloWorld.e;

public class Grafik extends JComponent implements Runnable, KeyListener
{

    PacMan player;
    Geist geist;
    
    ArrayList <Punkte>punkteListe;
    ArrayList <Pille>pillenListe;
    boolean Stop = false;
    boolean Stopverlohren = false;
    boolean Stopgewonnen = false;
    boolean Verlohren = false;
    boolean controle = true;
    boolean controle2 = true;
    int punktex;
    boolean power;
    long lastTurn = System.currentTimeMillis();
    public int Pacx, Pacy;
    
            
    public Grafik() 
    {
        punktex = 0;
        punkteListe = new ArrayList<>();
        pillenListe = new ArrayList<>();
        player = new PacMan(30, 30, 0, 1);
        geist = new Geist(355, 360);
        new Thread(this).start();
        this.addKeyListener(this);
        this.setFocusable(true);
        
        pillenListe.add(new Pille(670, 380));
        pillenListe.add(new Pille(60, 380));
        pillenListe.add(new Pille(179, 118));
        pillenListe.add(new Pille(559, 118));
        
        punkteListe.add(new Punkte(39, 43));
        punkteListe.add(new Punkte(39, 83));
        punkteListe.add(new Punkte(39, 123));
        punkteListe.add(new Punkte(39, 163));
        punkteListe.add(new Punkte(79, 163));
        punkteListe.add(new Punkte(119, 163));
        punkteListe.add(new Punkte(159, 163));
        punkteListe.add(new Punkte(39, 203));
        punkteListe.add(new Punkte(79, 203));
        punkteListe.add(new Punkte(119, 203));
        punkteListe.add(new Punkte(159, 203));
        punkteListe.add(new Punkte(199, 203));
        punkteListe.add(new Punkte(239, 203));
        punkteListe.add(new Punkte(279, 203)); 
        punkteListe.add(new Punkte(449, 203));
        punkteListe.add(new Punkte(489, 203));
        punkteListe.add(new Punkte(529, 203));       
        punkteListe.add(new Punkte(79, 43));
        punkteListe.add(new Punkte(119, 43));
        punkteListe.add(new Punkte(159, 43));
        punkteListe.add(new Punkte(199, 43));
        punkteListe.add(new Punkte(239, 43));
        punkteListe.add(new Punkte(279, 43));
        punkteListe.add(new Punkte(319, 43));     
        punkteListe.add(new Punkte(413, 43));
        punkteListe.add(new Punkte(413, 83));
        punkteListe.add(new Punkte(413, 123));
        punkteListe.add(new Punkte(413, 163));
        punkteListe.add(new Punkte(413, 203));
        punkteListe.add(new Punkte(453, 43));
        punkteListe.add(new Punkte(493, 43));
        punkteListe.add(new Punkte(533, 43));
        punkteListe.add(new Punkte(573, 43));
        punkteListe.add(new Punkte(573, 43));
        punkteListe.add(new Punkte(453, 83));
        punkteListe.add(new Punkte(493, 83));
        punkteListe.add(new Punkte(533, 83));  
        punkteListe.add(new Punkte(613, 43));
        punkteListe.add(new Punkte(653, 43));
        punkteListe.add(new Punkte(693, 43));    
        punkteListe.add(new Punkte(693, 43));
        punkteListe.add(new Punkte(693, 83));
        punkteListe.add(new Punkte(693, 123));
        punkteListe.add(new Punkte(693, 163));
        punkteListe.add(new Punkte(693, 203));
        punkteListe.add(new Punkte(653, 163));
        punkteListe.add(new Punkte(613, 163));
        punkteListe.add(new Punkte(573, 163));
        punkteListe.add(new Punkte(653, 203));
        punkteListe.add(new Punkte(613, 203));
        punkteListe.add(new Punkte(573, 203));     
        punkteListe.add(new Punkte(364, 203));
        punkteListe.add(new Punkte(364, 163));      
        punkteListe.add(new Punkte(279, 83));
        punkteListe.add(new Punkte(239, 83));
        punkteListe.add(new Punkte(199, 83));
        punkteListe.add(new Punkte(319, 83));
        punkteListe.add(new Punkte(319, 123));
        punkteListe.add(new Punkte(319, 163));
        punkteListe.add(new Punkte(319, 203));          
        punkteListe.add(new Punkte(189, 453));
        punkteListe.add(new Punkte(229, 453));
        punkteListe.add(new Punkte(229, 413));
        punkteListe.add(new Punkte(229, 373));
        punkteListe.add(new Punkte(229, 333));
        punkteListe.add(new Punkte(229, 293));
        punkteListe.add(new Punkte(229, 253));
        punkteListe.add(new Punkte(189, 453));
        punkteListe.add(new Punkte(189, 413));
        punkteListe.add(new Punkte(189, 373));
        punkteListe.add(new Punkte(189, 333));
        punkteListe.add(new Punkte(189, 293));
        punkteListe.add(new Punkte(189, 253));     
        punkteListe.add(new Punkte(509, 453));
        punkteListe.add(new Punkte(549, 453));
        punkteListe.add(new Punkte(549, 413));
        punkteListe.add(new Punkte(549, 373));
        punkteListe.add(new Punkte(549, 333));
        punkteListe.add(new Punkte(549, 293));
        punkteListe.add(new Punkte(549, 253));
        punkteListe.add(new Punkte(509, 453));
        punkteListe.add(new Punkte(509, 413));
        punkteListe.add(new Punkte(509, 373));
        punkteListe.add(new Punkte(509, 333));
        punkteListe.add(new Punkte(509, 293));
        punkteListe.add(new Punkte(509, 253));     
        punkteListe.add(new Punkte(189, 533));
        punkteListe.add(new Punkte(149, 533));
        punkteListe.add(new Punkte(109, 533));
        punkteListe.add(new Punkte(69, 533));
        punkteListe.add(new Punkte(589, 533));
        punkteListe.add(new Punkte(629, 533));
        punkteListe.add(new Punkte(669, 533));
        punkteListe.add(new Punkte(549, 533));    
        punkteListe.add(new Punkte(509, 533));
        punkteListe.add(new Punkte(469, 533));
        punkteListe.add(new Punkte(429, 533));
        punkteListe.add(new Punkte(389, 533));
        punkteListe.add(new Punkte(349, 533));
        punkteListe.add(new Punkte(309, 533));
        punkteListe.add(new Punkte(269, 533));
        punkteListe.add(new Punkte(229, 533));     
        punkteListe.add(new Punkte(349, 573));
        punkteListe.add(new Punkte(389, 573));
        punkteListe.add(new Punkte(349, 613));
        punkteListe.add(new Punkte(389, 613));
        punkteListe.add(new Punkte(349, 653));
        punkteListe.add(new Punkte(389, 653));      
        punkteListe.add(new Punkte(429, 653));
        punkteListe.add(new Punkte(469, 653));
        punkteListe.add(new Punkte(509, 653));
        punkteListe.add(new Punkte(549, 653));
        punkteListe.add(new Punkte(589, 653));
        punkteListe.add(new Punkte(629, 653));      
        punkteListe.add(new Punkte(429, 773));
        punkteListe.add(new Punkte(429, 733));
        punkteListe.add(new Punkte(429, 693));
        punkteListe.add(new Punkte(469, 693));
        punkteListe.add(new Punkte(469, 733));
        punkteListe.add(new Punkte(469, 773));
        punkteListe.add(new Punkte(509, 773));
        punkteListe.add(new Punkte(549, 773));
        punkteListe.add(new Punkte(589, 773));     
        punkteListe.add(new Punkte(309, 773));
        punkteListe.add(new Punkte(309, 733));
        punkteListe.add(new Punkte(309, 693));
        punkteListe.add(new Punkte(269, 773));
        punkteListe.add(new Punkte(269, 733));
        punkteListe.add(new Punkte(269, 693));
        punkteListe.add(new Punkte(229, 773));
        punkteListe.add(new Punkte(189, 773));
        punkteListe.add(new Punkte(149, 773)); 
        punkteListe.add(new Punkte(389, 613));
        punkteListe.add(new Punkte(349, 613));
        punkteListe.add(new Punkte(309, 613));
        punkteListe.add(new Punkte(269, 613));
        punkteListe.add(new Punkte(229, 613));
        punkteListe.add(new Punkte(189, 613));
        punkteListe.add(new Punkte(149, 613));
        punkteListe.add(new Punkte(109, 613));
        punkteListe.add(new Punkte(69, 613));
        punkteListe.add(new Punkte(149, 573));
        punkteListe.add(new Punkte(109, 573));
        punkteListe.add(new Punkte(69, 573));
        punkteListe.add(new Punkte(109, 773));
        punkteListe.add(new Punkte(69, 773));
        punkteListe.add(new Punkte(109, 693));
        punkteListe.add(new Punkte(69, 693));
        punkteListe.add(new Punkte(109, 733));
        punkteListe.add(new Punkte(69, 733)); 
        punkteListe.add(new Punkte(389, 653));
        punkteListe.add(new Punkte(349, 653));
        punkteListe.add(new Punkte(309, 653));
        punkteListe.add(new Punkte(269, 653));
        punkteListe.add(new Punkte(229, 653));
        punkteListe.add(new Punkte(189, 653));
        punkteListe.add(new Punkte(149, 653));
        punkteListe.add(new Punkte(109, 653));        
        punkteListe.add(new Punkte(589, 573));
        punkteListe.add(new Punkte(629, 573));
        punkteListe.add(new Punkte(669, 613));
        punkteListe.add(new Punkte(669, 573));      
        punkteListe.add(new Punkte(629, 693));
        punkteListe.add(new Punkte(629, 733));
        punkteListe.add(new Punkte(629, 773));
        punkteListe.add(new Punkte(669, 693));
        punkteListe.add(new Punkte(669, 733));
        punkteListe.add(new Punkte(669, 773));      
        punkteListe.add(new Punkte(429, 613));
        punkteListe.add(new Punkte(469, 613));
        punkteListe.add(new Punkte(509, 613));
        punkteListe.add(new Punkte(549, 613));
        punkteListe.add(new Punkte(589, 613));
        punkteListe.add(new Punkte(629, 613));    
        punkteListe.add(new Punkte(549, 493));
        punkteListe.add(new Punkte(509, 493));
        punkteListe.add(new Punkte(469, 493));
        punkteListe.add(new Punkte(429, 493));
        punkteListe.add(new Punkte(389, 493));
        punkteListe.add(new Punkte(349, 493));
        punkteListe.add(new Punkte(309, 493));
        punkteListe.add(new Punkte(269, 493));
        punkteListe.add(new Punkte(229, 493));
        punkteListe.add(new Punkte(189, 493));     
        punkteListe.add(new Punkte(549, 453));
        punkteListe.add(new Punkte(509, 453));
        punkteListe.add(new Punkte(469, 453));
        punkteListe.add(new Punkte(429, 453));
        punkteListe.add(new Punkte(389, 453));
        punkteListe.add(new Punkte(349, 453));
        punkteListe.add(new Punkte(309, 453));
        punkteListe.add(new Punkte(269, 453));
        punkteListe.add(new Punkte(229, 453));
        punkteListe.add(new Punkte(189, 453));    
        punkteListe.add(new Punkte(509, 293));
        punkteListe.add(new Punkte(469, 293));
        punkteListe.add(new Punkte(429, 293));
        punkteListe.add(new Punkte(389, 293));
        punkteListe.add(new Punkte(349, 293));
        punkteListe.add(new Punkte(309, 293));
        punkteListe.add(new Punkte(269, 293));
    }
    
    
    @Override
    public void paint(Graphics g)
    {
        
        Image im;
        im = new ImageIcon ("map1.png").getImage ( );
        g.drawImage ( im , 0 , 0 , this );
        
        g.setColor(Color.white);
        Iterator<Punkte> it = punkteListe.iterator();
        while (it.hasNext()) {
            Punkte punkte = it.next();
            g.fillOval(punkte.getX(), punkte.getY(), 15, 15);
            if(player.getX() > punkte.getX()- 30 && player.getX() < punkte.getX()+ 30 &&
            player.getY() > punkte.getY() - 30 && player.getY() < punkte.getY() + 30){
                punktex++;
                player.setPunkte(punktex);
                it.remove();
            }
        }
        g.setColor(Color.yellow);
        Iterator<Pille> pi = pillenListe.iterator();
        while (pi.hasNext()) {
            Pille pille = pi.next();
            g.fillOval(pille.getX(), pille.getY(), 20, 20);
            if(player.getX() > pille.getX()- 20 && player.getX() < pille.getX()+ 20 &&
            player.getY() > pille.getY() - 20 && player.getY() < pille.getY() + 20){
                
                
                power = true;
                pi.remove();
                g.drawString("Power aktiv ", 20, 340);
                lastTurn = System.currentTimeMillis(); 
            }
          }  
        
        if(System.currentTimeMillis() - lastTurn >= 5000 && power==true){
        power = false;
        g.drawString("Power deaktiv ", 20, 340);
        lastTurn = System.currentTimeMillis();
        }else{g.setColor(Color.white);}
        
        
        g.drawImage(geist.getSprite(), geist.getX(), geist.getY(), this);
        validate();
            if (Stopverlohren == true){
             g.drawString("Verlohren! ", 20, 310);
             Stopverlohren = false;
             Stop = true;
            }
            
            
            if (player.getPunkte()==201 || Stopgewonnen == true){
            g.drawString("Gewonnen! ", 20, 310);
            Stopgewonnen = false;
            Stop = true;
            }
            else{
                    g.drawString("Punkte = "+player.getPunkte(), 20, 290);
                
        } 

        if(power == true){g.setColor(Color.red);}else{
        g.setColor(Color.yellow);}
        if (controle == true)
            g.fillOval(player.getX(), player.getY(), 50, 50);
        else if (controle == false && player.getDir() == 1) 
            g.fillArc(player.getX(), player.getY(), 50, 50, 30, 280);
        else if (controle == false && player.getDir() == 4) 
            g.fillArc(player.getX(), player.getY(), 50, 50, 210, 280);
        else if (controle == false && player.getDir() == 3) 
            g.fillArc(player.getX(), player.getY(), 50, 50, 130, 280);
        else if (controle == false && player.getDir() == 2) 
            g.fillArc(player.getX(), player.getY(), 50, 50, 310, 280);
    }

    @Override
    public void run() 
    {
        while(true){
            try {
                Thread.sleep(15);
                player.mover();
                Pacx = player.getX();
                Pacy = player.getY();
                
                geist.Geistmover(Pacx, Pacy, power);
                geist.mover();
                Stoppen();
                

                if (controle2)
                    controle = !controle;
                controle2 = !controle2;
                
                if(player.getX() > geist.getX()- 20 && player.getX() < geist.getX()+ 20 &&
                player.getY() > geist.getY() - 20 && player.getY() < geist.getY() + 20 && power==true){
                  
                    System.out.println("Gewonnen! | Geist gefressen");
                    geist.setX(355);
                    geist.setY(360);
                    power = false;
                }
                else if(player.getX() > geist.getX()- 20 && player.getX() < geist.getX()+ 20 &&
                player.getY() > geist.getY() - 20 && player.getY() < geist.getY() + 20){
                  
                    System.out.println("Verlohren!");
                    Stopverlohren = true;
                }
                
                
                repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(Grafik.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            player.setDir(3);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            player.setDir(2);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            player.setDir(4);
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            player.setDir(1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
          public void Stoppen(){
            if (Stop ==true){
            try {
                Thread.sleep(2000);
                Verlohren = false;
            } catch (InterruptedException ex) {
                Logger.getLogger(Grafik.class.getName()).log(Level.SEVERE, null, ex);
            }
            Stop = false;
            geist = new Geist(355, 360);
            player = new PacMan(20, 30, 0, 1);
            punkteListe = new ArrayList<>();
            pillenListe = new ArrayList<>();
            
            
            punktex = 0;
                    pillenListe.add(new Pille(670, 380));
        pillenListe.add(new Pille(60, 380));
        pillenListe.add(new Pille(179, 118));
        pillenListe.add(new Pille(559, 118));
        
        punkteListe.add(new Punkte(39, 43));
        punkteListe.add(new Punkte(39, 83));
        punkteListe.add(new Punkte(39, 123));
        punkteListe.add(new Punkte(39, 163));
        punkteListe.add(new Punkte(79, 163));
        punkteListe.add(new Punkte(119, 163));
        punkteListe.add(new Punkte(159, 163));
        punkteListe.add(new Punkte(39, 203));
        punkteListe.add(new Punkte(79, 203));
        punkteListe.add(new Punkte(119, 203));
        punkteListe.add(new Punkte(159, 203));
        punkteListe.add(new Punkte(199, 203));
        punkteListe.add(new Punkte(239, 203));
        punkteListe.add(new Punkte(279, 203)); 
        punkteListe.add(new Punkte(449, 203));
        punkteListe.add(new Punkte(489, 203));
        punkteListe.add(new Punkte(529, 203));       
        punkteListe.add(new Punkte(79, 43));
        punkteListe.add(new Punkte(119, 43));
        punkteListe.add(new Punkte(159, 43));
        punkteListe.add(new Punkte(199, 43));
        punkteListe.add(new Punkte(239, 43));
        punkteListe.add(new Punkte(279, 43));
        punkteListe.add(new Punkte(319, 43));     
        punkteListe.add(new Punkte(413, 43));
        punkteListe.add(new Punkte(413, 83));
        punkteListe.add(new Punkte(413, 123));
        punkteListe.add(new Punkte(413, 163));
        punkteListe.add(new Punkte(413, 203));
        punkteListe.add(new Punkte(453, 43));
        punkteListe.add(new Punkte(493, 43));
        punkteListe.add(new Punkte(533, 43));
        punkteListe.add(new Punkte(573, 43));
        punkteListe.add(new Punkte(573, 43));
        punkteListe.add(new Punkte(453, 83));
        punkteListe.add(new Punkte(493, 83));
        punkteListe.add(new Punkte(533, 83));  
        punkteListe.add(new Punkte(613, 43));
        punkteListe.add(new Punkte(653, 43));
        punkteListe.add(new Punkte(693, 43));    
        punkteListe.add(new Punkte(693, 43));
        punkteListe.add(new Punkte(693, 83));
        punkteListe.add(new Punkte(693, 123));
        punkteListe.add(new Punkte(693, 163));
        punkteListe.add(new Punkte(693, 203));
        punkteListe.add(new Punkte(653, 163));
        punkteListe.add(new Punkte(613, 163));
        punkteListe.add(new Punkte(573, 163));
        punkteListe.add(new Punkte(653, 203));
        punkteListe.add(new Punkte(613, 203));
        punkteListe.add(new Punkte(573, 203));     
        punkteListe.add(new Punkte(364, 203));
        punkteListe.add(new Punkte(364, 163));      
        punkteListe.add(new Punkte(279, 83));
        punkteListe.add(new Punkte(239, 83));
        punkteListe.add(new Punkte(199, 83));
        punkteListe.add(new Punkte(319, 83));
        punkteListe.add(new Punkte(319, 123));
        punkteListe.add(new Punkte(319, 163));
        punkteListe.add(new Punkte(319, 203));          
        punkteListe.add(new Punkte(189, 453));
        punkteListe.add(new Punkte(229, 453));
        punkteListe.add(new Punkte(229, 413));
        punkteListe.add(new Punkte(229, 373));
        punkteListe.add(new Punkte(229, 333));
        punkteListe.add(new Punkte(229, 293));
        punkteListe.add(new Punkte(229, 253));
        punkteListe.add(new Punkte(189, 453));
        punkteListe.add(new Punkte(189, 413));
        punkteListe.add(new Punkte(189, 373));
        punkteListe.add(new Punkte(189, 333));
        punkteListe.add(new Punkte(189, 293));
        punkteListe.add(new Punkte(189, 253));     
        punkteListe.add(new Punkte(509, 453));
        punkteListe.add(new Punkte(549, 453));
        punkteListe.add(new Punkte(549, 413));
        punkteListe.add(new Punkte(549, 373));
        punkteListe.add(new Punkte(549, 333));
        punkteListe.add(new Punkte(549, 293));
        punkteListe.add(new Punkte(549, 253));
        punkteListe.add(new Punkte(509, 453));
        punkteListe.add(new Punkte(509, 413));
        punkteListe.add(new Punkte(509, 373));
        punkteListe.add(new Punkte(509, 333));
        punkteListe.add(new Punkte(509, 293));
        punkteListe.add(new Punkte(509, 253));     
        punkteListe.add(new Punkte(189, 533));
        punkteListe.add(new Punkte(149, 533));
        punkteListe.add(new Punkte(109, 533));
        punkteListe.add(new Punkte(69, 533));
        punkteListe.add(new Punkte(589, 533));
        punkteListe.add(new Punkte(629, 533));
        punkteListe.add(new Punkte(669, 533));
        punkteListe.add(new Punkte(549, 533));    
        punkteListe.add(new Punkte(509, 533));
        punkteListe.add(new Punkte(469, 533));
        punkteListe.add(new Punkte(429, 533));
        punkteListe.add(new Punkte(389, 533));
        punkteListe.add(new Punkte(349, 533));
        punkteListe.add(new Punkte(309, 533));
        punkteListe.add(new Punkte(269, 533));
        punkteListe.add(new Punkte(229, 533));     
        punkteListe.add(new Punkte(349, 573));
        punkteListe.add(new Punkte(389, 573));
        punkteListe.add(new Punkte(349, 613));
        punkteListe.add(new Punkte(389, 613));
        punkteListe.add(new Punkte(349, 653));
        punkteListe.add(new Punkte(389, 653));      
        punkteListe.add(new Punkte(429, 653));
        punkteListe.add(new Punkte(469, 653));
        punkteListe.add(new Punkte(509, 653));
        punkteListe.add(new Punkte(549, 653));
        punkteListe.add(new Punkte(589, 653));
        punkteListe.add(new Punkte(629, 653));      
        punkteListe.add(new Punkte(429, 773));
        punkteListe.add(new Punkte(429, 733));
        punkteListe.add(new Punkte(429, 693));
        punkteListe.add(new Punkte(469, 693));
        punkteListe.add(new Punkte(469, 733));
        punkteListe.add(new Punkte(469, 773));
        punkteListe.add(new Punkte(509, 773));
        punkteListe.add(new Punkte(549, 773));
        punkteListe.add(new Punkte(589, 773));     
        punkteListe.add(new Punkte(309, 773));
        punkteListe.add(new Punkte(309, 733));
        punkteListe.add(new Punkte(309, 693));
        punkteListe.add(new Punkte(269, 773));
        punkteListe.add(new Punkte(269, 733));
        punkteListe.add(new Punkte(269, 693));
        punkteListe.add(new Punkte(229, 773));
        punkteListe.add(new Punkte(189, 773));
        punkteListe.add(new Punkte(149, 773)); 
        punkteListe.add(new Punkte(389, 613));
        punkteListe.add(new Punkte(349, 613));
        punkteListe.add(new Punkte(309, 613));
        punkteListe.add(new Punkte(269, 613));
        punkteListe.add(new Punkte(229, 613));
        punkteListe.add(new Punkte(189, 613));
        punkteListe.add(new Punkte(149, 613));
        punkteListe.add(new Punkte(109, 613));
        punkteListe.add(new Punkte(69, 613));
        punkteListe.add(new Punkte(149, 573));
        punkteListe.add(new Punkte(109, 573));
        punkteListe.add(new Punkte(69, 573));
        punkteListe.add(new Punkte(109, 773));
        punkteListe.add(new Punkte(69, 773));
        punkteListe.add(new Punkte(109, 693));
        punkteListe.add(new Punkte(69, 693));
        punkteListe.add(new Punkte(109, 733));
        punkteListe.add(new Punkte(69, 733)); 
        punkteListe.add(new Punkte(389, 653));
        punkteListe.add(new Punkte(349, 653));
        punkteListe.add(new Punkte(309, 653));
        punkteListe.add(new Punkte(269, 653));
        punkteListe.add(new Punkte(229, 653));
        punkteListe.add(new Punkte(189, 653));
        punkteListe.add(new Punkte(149, 653));
        punkteListe.add(new Punkte(109, 653));        
        punkteListe.add(new Punkte(589, 573));
        punkteListe.add(new Punkte(629, 573));
        punkteListe.add(new Punkte(669, 613));
        punkteListe.add(new Punkte(669, 573));      
        punkteListe.add(new Punkte(629, 693));
        punkteListe.add(new Punkte(629, 733));
        punkteListe.add(new Punkte(629, 773));
        punkteListe.add(new Punkte(669, 693));
        punkteListe.add(new Punkte(669, 733));
        punkteListe.add(new Punkte(669, 773));      
        punkteListe.add(new Punkte(429, 613));
        punkteListe.add(new Punkte(469, 613));
        punkteListe.add(new Punkte(509, 613));
        punkteListe.add(new Punkte(549, 613));
        punkteListe.add(new Punkte(589, 613));
        punkteListe.add(new Punkte(629, 613));    
        punkteListe.add(new Punkte(549, 493));
        punkteListe.add(new Punkte(509, 493));
        punkteListe.add(new Punkte(469, 493));
        punkteListe.add(new Punkte(429, 493));
        punkteListe.add(new Punkte(389, 493));
        punkteListe.add(new Punkte(349, 493));
        punkteListe.add(new Punkte(309, 493));
        punkteListe.add(new Punkte(269, 493));
        punkteListe.add(new Punkte(229, 493));
        punkteListe.add(new Punkte(189, 493));     
        punkteListe.add(new Punkte(549, 453));
        punkteListe.add(new Punkte(509, 453));
        punkteListe.add(new Punkte(469, 453));
        punkteListe.add(new Punkte(429, 453));
        punkteListe.add(new Punkte(389, 453));
        punkteListe.add(new Punkte(349, 453));
        punkteListe.add(new Punkte(309, 453));
        punkteListe.add(new Punkte(269, 453));
        punkteListe.add(new Punkte(229, 453));
        punkteListe.add(new Punkte(189, 453));    
        punkteListe.add(new Punkte(509, 293));
        punkteListe.add(new Punkte(469, 293));
        punkteListe.add(new Punkte(429, 293));
        punkteListe.add(new Punkte(389, 293));
        punkteListe.add(new Punkte(349, 293));
        punkteListe.add(new Punkte(309, 293));
        punkteListe.add(new Punkte(269, 293));
            //System.exit(0);
    }
    }
    
}
