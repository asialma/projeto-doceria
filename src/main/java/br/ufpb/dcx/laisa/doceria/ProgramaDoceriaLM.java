package br.ufpb.dcx.laisa.doceria;

import javax.swing.*;

public class ProgramaDoceriaLM {
    public static void main(String[] args) {
        boolean continuar = true;

        SistemaDoceriaInterface doceriaLM = new SistemaDoceriaLM();

        while (continuar) {
            String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar doce\n2.Pesquisar doce pelo nome\n3.Sair");

            if(opcao.equals("1")){
                String tipoDoce = JOptionPane.showInputDialog("Qual o tipo de doce?\n1.Bolo\n2.Docinho\n3.Torta");
                if (tipoDoce.equals("1")){
                    Doce bolo = new Bolo();
                    String id = JOptionPane.showInputDialog("Qual o id?");
                    bolo.setId(id);
                    bolo.setNome(JOptionPane.showInputDialog("Qual o nome do doce?"));
                    bolo.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do doce?")));
                    String cobertura = JOptionPane.showInputDialog("Qual a cobertura do bolo?");
                    String recheio = JOptionPane.showInputDialog("Qual o recheio do bolo?");
                    int qtdFatias = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de fatias do bolo?"));

                    Doce b = new Bolo(id, bolo.getNome(), bolo.getPreco(), recheio, cobertura, qtdFatias);
                    try {
                        doceriaLM.cadastrarDoce(b);
                        JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso:"+ b.toString());
                    } catch (DoceJaCadastradoException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            } else if (opcao.equals("2")) {
            String docePesquisado = JOptionPane.showInputDialog("Digite o nome do doce: ");

            try {
                doceriaLM.pesquisaDocePorNome(docePesquisado);
            } catch (DoceInexistenteException e){
                JOptionPane.showMessageDialog(null, "Doce não cadastrado no sistema.");
            }

            } else if (opcao.equals("3")){
                continuar = false;
                JOptionPane.showMessageDialog(null, "Tchau!");
            }

        }
    }

}
