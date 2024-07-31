package br.ufpb.dcx.laisa.doceria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SistemaDoceriaLM implements SistemaDoceriaInterface {
    private List<Doce> doces;
    public static final String ID = "ID";

    public SistemaDoceriaLM() {
        doces = new ArrayList<>();
    }

    @Override
    public void cadastrarDoce(Doce doce) throws DoceJaCadastradoException {
        for (Doce d : doces) {
            if (d.getNome().equalsIgnoreCase(doce.getNome())) {
                throw new DoceJaCadastradoException("Doce " + doce.getNome() + " já está cadastrado.");
            }
        }
        doces.add(doce);
        System.out.println("Doce " + doce.getNome() + " cadastrado com sucesso!");
    }

    @Override
    public List<Doce> pesquisaDocePorNome(String nome) throws DoceInexistenteException {
        List<Doce> docePeloNome = new LinkedList<>();
        for (Doce d : doces) {
            if (d.getNome().startsWith(nome)) {
                docePeloNome.add(d);
                JOptionPane.showMessageDialog(null, d);
            } else {
                throw new DoceInexistenteException("Doce " + nome + " não existe!");
            }
        }
        Collections.sort(docePeloNome);
        return docePeloNome;
    }
}
