package br.com.clothing.storage.console.estadoConsole;

import java.io.IOException;
import java.text.ParseException;

public abstract class MaquinaEstadoConsole {
    public abstract boolean Executa() throws ParseException, IOException;
}
