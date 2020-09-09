package br.com.clothing.storage.console.estadoConsole;
public enum EnumEstadoConsole {

    MENU_PRINCIPAL (new EstadoConsoleMenuPrincipal()),

    CADASTRAR (new EstadoConsoleCadastrar()),

    EDITAR (new EstadoConsoleEditar()),

    EXCLUIR (new EstadoConsoleExcluir()),

    LEITURA (new EstadoConsoleLeitura()),

    LISTAR (new EstadoConsoleListar()),

    SALVAR (new EstadoConsoleListar());

    private final MaquinaEstadoConsole estadoMaquina;

    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}
