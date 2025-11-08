package visao;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Frame extends JFrame {

	JMenuBar menuBar;
	JMenu menuCadastrar;
	JMenu menuConsultar;
	JMenuItem itemCadastrarProfessor;
	
	
	public Frame(){
		super("Sagres");
		this.setVisible(true);
		this.setSize(800, 600);
		menuBar = new JMenuBar();
		menuBar.add(getMenuCadastrar());
		menuBar.add(getMenuConsultar());
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	
	
	public JMenu getMenuCadastrar(){
		if(menuCadastrar == null) {
			menuCadastrar = new JMenu();
			menuCadastrar.setText("Cadastrar");
			menuCadastrar.add(getItemCadastrarProfessor());
		}	
		return menuCadastrar;
	}
	public JMenu getMenuConsultar(){
		if(menuConsultar == null) {
			menuConsultar = new JMenu();
			menuConsultar.setText("Consultar");
		}	
		return menuConsultar;
	}
	
	public JMenuItem getItemCadastrarProfessor(){
		if(itemCadastrarProfessor == null) {
			itemCadastrarProfessor = new JMenuItem();
			itemCadastrarProfessor.setText("Proferssor");
		}	
		return itemCadastrarProfessor;
	}
	
	
}
