package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;

public class EstadoConsoleLeitura extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        System.out.println("Ler arquivo");
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
