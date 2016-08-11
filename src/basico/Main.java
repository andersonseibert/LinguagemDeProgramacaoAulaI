/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import model.Marca;
import model.Produto;

/**
 *
 * @author Anderson
 */
public class Main {
    public static void main(String[]args){
        System.out.println("Teste");
        
        //Marca
        Marca marca = new Marca();        
        marca.setId(1);
        marca.setNome("Coca-Cola");
        
        //Produto
        Produto produto = new Produto();
        produto.setId(1);
        produto.setDescricao("Coca 2L");
        produto.setMarca(marca);
    }    
}
