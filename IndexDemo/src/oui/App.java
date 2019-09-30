package oui;

import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
	//it will add Tab
	JTabbedPane tabPane;
	
	//objects of our class
	HomePanel homePanel;
	DataPanel dataPanel;
	IndexPanel indexPanel;
	QueryPanel queryPanel;
	
	//constructor function
	public App() {
		//allocate memory space
		tabPane = new JTabbedPane();
		
		//will define UI properties
		tabPane.setFont(new Font("Comic Sans MS", 1, 30));
		tabPane.setBackground(Color.DARK_GRAY);
		tabPane.setForeground(Color.WHITE);
		
		//allocate memory space.  Tabpane object is passed 
		homePanel = new HomePanel(tabPane);
		dataPanel = new DataPanel(tabPane);
		indexPanel = new IndexPanel(tabPane);
		queryPanel = new QueryPanel(tabPane);
		
		//the window created by JFRAME will have one inbuilt function called add
		//we have added tabpane object using that
		super.add(tabPane);
		
		pack();
		
		//UI properties
		super.setTitle("RDBMS Index Implementation");
		super.setExtendedState(MAXIMIZED_BOTH);
		
		//that close sign will close the operation upon clicking
		//Important for JVM to close the operation
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//window will be visible only if it is set true
		super.setVisible(true);
	}
}
