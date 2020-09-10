package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;
import br.com.clothing.storage.dao.FileHandler;

import java.io.IOException;

public class EstadoConsoleSalvar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() throws IOException {
        System.out.println("Salvar arquivo");

        FileHandler fileHandler = new FileHandler();
        fileHandler.writer();

        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return true;
    }
}
