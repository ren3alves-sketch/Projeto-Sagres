package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.Frame;
import visao.PanelCadastrarProfessor;

public class ControladorFrame implements ActionListener{

	
	
	Frame frame;
	PanelCadastrarProfessor panelCadastrarAluno;
	ControladorCadastrarProfessor controladorCadastrarProfessor;
	
	public ControladorFrame() {	
		frame = new Frame();
		frame.repaint();
		frame.validate();
		addEventos();
	}
	
	private void addEventos() {
		frame.getItemCadastrarProfessor().addActionListener(this);
		
	}

	public static void main(String[] args) {
		new ControladorFrame();
		
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frame.getItemCadastrarProfessor()) {
			panelCadastrarAluno = new PanelCadastrarProfessor();
			controladorCadastrarProfessor = new ControladorCadastrarProfessor(panelCadastrarAluno);
			frame.setContentPane(panelCadastrarAluno);
			frame.repaint();
			frame.validate();
		}
		
	}
	
	

}
