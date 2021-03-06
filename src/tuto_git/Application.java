package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);

		this.setTitle("tutorielRuby git");

		
		this.add(vue);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
        {
                
                
            	System.exit(0);
             }
        });
	}

}
