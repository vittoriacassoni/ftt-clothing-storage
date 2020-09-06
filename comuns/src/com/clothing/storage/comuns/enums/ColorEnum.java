package com.clothing.storage.comuns.enums;

public enum ColorEnum {

    ROSA("rosa"),
    AZUL("azul"),
    BRANCO("branco"),
    PRETO("preto");

    private String descricao;

    ColorEnum(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
