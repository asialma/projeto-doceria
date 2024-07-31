package br.ufpb.dcx.laisa.doceria;

import java.util.List;

public interface SistemaDoceriaInterface {

    /**
     * Cadastra um novo Doce no sistema do catálogo de doces.
     * @param doce O item a ser adicionado
     */
    public void cadastrarDoce(Doce doce) throws DoceJaCadastradoException;

    /**
     * Pesquisa todos os itens cujo nome começa com o nome passado como parâmetro
     * @param nome O nome a pesquisar
     * @return uma lista contendo os doces cujo nome começa com o parâmetro passado.
     */
    public List<Doce> pesquisaDocePorNome(String nome) throws DoceInexistenteException;
}
