/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rafael
 */
public class No {
    private int info;
    private No esq;
    private No dir;
    
    
    public No() {
    }

    public No(int info) {
        this.info = info;
        this.esq = null;
        this.dir = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return " " + info+ ' ';
    }
}
