package br.com.clothing.storage.comuns.enums;

public enum AvailableEntities {

    STORAGE("storage");

    private String descricao;

    AvailableEntities(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
