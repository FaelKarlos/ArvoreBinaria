/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.BST;
import modelo.No;

/**
 *
 * @author monica
 */
public class TesteInserir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST arv = new BST();
        arv.inserir(10);
        arv.inserir(0);
        arv.inserir(30);
        arv.inserir(50);
        arv.inserir(20);
        System.out.println("pre ordem: "+arv.preOrdem(arv.getRaiz()));
        System.out.println("in ordem: " + arv.inOrdem(arv.getRaiz()));
        System.out.println("pos ordem: "+ arv.posOrdem(arv.getRaiz()));
        
    }
    
}
