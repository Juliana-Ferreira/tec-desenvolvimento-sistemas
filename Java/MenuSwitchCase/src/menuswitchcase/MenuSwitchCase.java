package menuswitchcase;

import javax.swing.JOptionPane;

public class MenuSwitchCase {

    public static void main(String[] args) {
    
        int opcao, submenu;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada:" +
                "\n1 - Cadastrar usuário" +
                "\n2 - Alterar dados" +
                "\n3 - Excluir usuário"));

        switch (opcao){
            case 1:
                JOptionPane.showMessageDialog(null, "Cadastrando usuário.");
                break;

            case 2:
                submenu = Integer.parseInt(JOptionPane.showInputDialog("Menu de alteração de dados" +
                        "\nSelecione a opção desejada:" +
                        "\n1 - Alterar nome" +
                        "\n2 - Alterar endereço" +
                        "\n3 - Alterar telefone" +
                        "\n4 - Alterar RG"));

                switch (submenu){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Alterar nome selecionado.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Alterar endereço selecionado.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Alterar telefone selecionado.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Alterar RG selecionado.");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                }
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Excluindo usuário.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }

    }
    
}
