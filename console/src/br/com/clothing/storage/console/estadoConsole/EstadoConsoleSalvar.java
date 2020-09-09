package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;

public class EstadoConsoleSalvar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        System.out.println("Salvar arquivo");
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
