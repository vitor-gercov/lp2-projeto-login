/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtruck.api.services;

import java.util.ArrayList;
import java.util.List;
import mtruck.api.daos.ProdutoDAO;
import mtruck.api.entities.Produto;

/**
 *
 * @author chseki
 */
public class ProdutoService {
    public Produto cadastrar(Produto p){   
        ProdutoDAO dao = new ProdutoDAO();
        Produto novoProduto = dao.salvar(p);
        
        return novoProduto;
    }
    public List<Produto> listar() {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = new ArrayList<Produto>();
        
        produtos = dao.listar();
        
        return produtos;
    }
}
