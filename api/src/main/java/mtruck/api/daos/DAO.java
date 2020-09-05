/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtruck.api.daos;

import java.util.List;

/**
 *
 * @author chseki
 */
public interface DAO<T> {
    
    List<T> listar();
    
    T salvar(T t);
    
    T pesquisar(int id);
    
    boolean deletar(int id);
}