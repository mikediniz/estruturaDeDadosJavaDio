package com.RefatoracaoClasseNo;

public class No<T> {

    public T conteudo;
    public No<T> proximoNo = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {

        return conteudo;
    }

    public void setConteudo(T conteudo) {

        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {

        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {

        this.proximoNo = proximoNo;
    }

    @Override
public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
