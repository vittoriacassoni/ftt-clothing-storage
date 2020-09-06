package com.clothing.storage.comuns.enums;

public enum SizeEnum {

    P("p"),
    M("m"),
    G("g");

    private String descricao;

    SizeEnum(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
