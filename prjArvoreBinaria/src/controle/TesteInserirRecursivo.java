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
public class TesteInserirRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST arv = new BST();
        //Arvore 4 da avaliação3:
        arv.inserir_recursivo(50);
        arv.inserir_recursivo(17);
        arv.inserir_recursivo(76);
        arv.inserir_recursivo(9);
        arv.inserir_recursivo(23);
        arv.inserir_recursivo(54);
        arv.inserir_recursivo(14);
        arv.inserir_recursivo(19);
        arv.inserir_recursivo(72);
        arv.inserir_recursivo(12);
        arv.inserir_recursivo(67);
        
        System.out.println("arv: " + arv);
        System.out.println("pre ordem: "+arv.preOrdem(arv.getRaiz()));
        No p = arv.getRaiz();
        System.out.println("in ordem: " + arv.inOrdem(p));
        System.out.println("pos ordem: " + arv.posOrdem(p));
    }
    
}
