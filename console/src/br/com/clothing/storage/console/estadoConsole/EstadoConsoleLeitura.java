package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;
import br.com.clothing.storage.dao.FileHandler;

import java.io.File;
import java.io.IOException;

public class EstadoConsoleLeitura extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() throws IOException {

        System.out.println("Ler arquivo");
        FileHandler fileHandler = new FileHandler();

        fileHandler.reader();
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
