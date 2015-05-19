import javax.swing.*;

public class Monitores{

	//Variables

	public static void main(String[] args) {
		Monitores comite = new Monitores();
		LectorT llT = new LectorT();

		int tipA = 0;
		while(tipA < 1 || tipA > 2){
			tipA = Integer.parseInt(JOptionPane.showInputDialog("Selecione que tipo de algoritmo desea usar: \n1 Para Ingenuo \n2 Para Inteligente"));
			JOptionPane.showMessageDialog(null, "Has selecionado " + tipA);
		}
		
		comite.tipoAlgoritmo(tipA);
		tipA = 0;

		while(tipA < 1 || tipA > 2){
			tipA = Integer.parseInt(JOptionPane.showInputDialog("Tipos de datos a usar: \n1 Para normal \n2 Datos uniformes"));
			JOptionPane.showMessageDialog(null, "Has selecionado" + tipA);
		}

		comite.tipoDato(tipA);


	}

	public void tipoAlgoritmo(int aa){
		if (aa == 1) {
			//
			JOptionPane.showMessageDialog(null, "Usara el algoritmo Ingenuo");
		}
		if (aa == 2) {
			//
			JOptionPane.showMessageDialog(null, "Usara el algoritmo Inteligente");
		}		
	}

	public void tipoDato(int bb){
		if (bb == 1) {
			//
			JOptionPane.showMessageDialog(null, "Usaras los datos normal");
		}
		if (bb == 2) {
			//
			JOptionPane.showMessageDialog(null, "Usaras los datos uniformes");
		}

	}
}