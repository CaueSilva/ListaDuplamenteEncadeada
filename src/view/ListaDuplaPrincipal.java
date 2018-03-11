package view;
import controller.ListaDuplaMetodos;

import javax.swing.JOptionPane;

public class ListaDuplaPrincipal {
	
	public static void main (String args[]) {
        ListaDuplaMetodos lD = new ListaDuplaMetodos();
        int opc = 0, element = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Adiciona Início \n"
                    + " 2 - Adiciona Final \n"
                    + " 3 - Remove Início \n"
                    + " 4 - Remove Final \n"
                    + " 7 - Mostar Lista"));
            switch (opc) {
                case 1: element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
                        lD.adicionaInicio(element);
                break;
                case 2: element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
                        lD.adicionaFinal(element);
                break;
                case 3: System.out.println(lD.removeInicio()+" removido.");
                break;
                case 4: System.out.println(lD.removeFinal()+" removido.");
                break;
                case 7: System.out.println(lD.toString());
                break;
            }
        }
    }
	
}
