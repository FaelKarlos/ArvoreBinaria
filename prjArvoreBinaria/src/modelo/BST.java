/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rafael Árvore binária de busca
 */
public class BST {

    private No raiz;

    public BST() {
        this.raiz = null;
    }

    public BST(No raiz) {
        this.raiz = raiz;
    }

    public void inserir_recursivo(int dado) {
        if (this.raiz == null) {
            this.raiz = new No(dado);
            return;
        }
        inserir_rec(this.raiz, dado);
    }
    public void inserir_rec(No r, int dado) {
        if (r == null) {
            return;
        } else if (dado < r.getInfo()) {
            if (r.getEsq() == null) {
                r.setEsq(new No(dado));
                return;
            }
            inserir_rec(r.getEsq(), dado);
        } else {
            if (r.getDir() == null) {
                r.setDir(new No(dado));
                return;
            }
            inserir_rec(r.getDir(), dado);
        }
    }
    public void inserir(int dado) {
        if (this.raiz == null) {//arvore vazia
            this.raiz = new No(dado);
            return;
        }
        No r = this.raiz;  //r vai percorrer a árvore
        No p = r; //p antecessor
        while (r != null) {//percorre até chegar numa folha
            p = r;
            if (dado > r.getInfo()) {
                r = r.getDir();
            } else {
                r = r.getEsq();
            }
        }
        // inserir nó
        No novoNo = new No(dado);
        if (dado < p.getInfo()) {
            p.setEsq(novoNo);
        } else {
            p.setDir(novoNo);
        }
    }//fim

    public String preOrdem(No no) {
        String st = "";
        if (no != null) {
            st = st + no.toString();
            st = st + preOrdem(no.getEsq());
            st = st + preOrdem(no.getDir());
        }
        return st;
    }
    public String posOrdem(No no) {
        String st = "";
        if (no != null) {
            st = st + posOrdem(no.getEsq());
            st = st + posOrdem(no.getDir());
            st = st + no.toString();
        }
        return st;
    }
    public String inOrdem(No no) {
        String st = "";
        if (no != null) {
            st = st + inOrdem(no.getEsq());
            st = st + no.toString();
            st = st + inOrdem(no.getDir());
        }
        return st;
    }

    @Override
    public String toString() {
        return " " + raiz + ' ';
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

}
