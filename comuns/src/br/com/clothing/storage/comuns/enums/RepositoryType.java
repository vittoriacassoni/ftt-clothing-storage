package br.com.clothing.storage.comuns.enums;

public enum RepositoryType {

    TEXTO("texto");

    private String descricao;

    RepositoryType(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
