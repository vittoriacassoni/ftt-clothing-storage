package br.com.clothing.storage.console;

import br.com.clothing.storage.comuns.vos.StorageItem;
import br.com.clothing.storage.console.estadoConsole.EnumEstadoConsole;
import br.com.clothing.storage.console.estadoConsole.MaquinaEstadoConsole;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    public static MaquinaEstadoConsole estadoConsole;
    public ArrayList<StorageItem> storageItems = new ArrayList<>();

    public static void main(String[] args) throws ParseException, IOException {
        estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
        Boolean exit = false;
        while (!exit) {
            exit = estadoConsole.Executa();
        }
    }
}
