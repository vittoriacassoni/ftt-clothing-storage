package br.com.clothing.storage.console;

import br.com.clothing.storage.console.estadoConsole.EnumEstadoConsole;
import br.com.clothing.storage.console.estadoConsole.MaquinaEstadoConsole;

public class Main {

    public static MaquinaEstadoConsole estadoConsole;

    public static void main(String[] args) {

        estadoConsole = EnumEstadoConsole.CADASTRAR.getEstadoMaquina();
        estadoConsole = EnumEstadoConsole.EDITAR.getEstadoMaquina();
        estadoConsole = EnumEstadoConsole.EXCLUIR.getEstadoMaquina();
        estadoConsole = EnumEstadoConsole.LEITURA.getEstadoMaquina();
        estadoConsole = EnumEstadoConsole.LISTAR.getEstadoMaquina();
        estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
        Boolean saida = false;
        while (!saida) {
            saida = estadoConsole.Executa();
        }
    }
}
