package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;

public class EstadoConsoleExcluir extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        System.out.println("Excluir");
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
