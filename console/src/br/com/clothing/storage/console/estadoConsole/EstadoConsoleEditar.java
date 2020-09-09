package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;

public class EstadoConsoleEditar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        System.out.println("Editar");
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
