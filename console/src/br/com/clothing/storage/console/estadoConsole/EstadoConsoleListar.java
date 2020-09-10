package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.comuns.vos.StorageItem;
import br.com.clothing.storage.console.Main;
import br.com.clothing.storage.dao.StorageItemDAO;

import java.util.ArrayList;

public class EstadoConsoleListar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        System.out.println("Listar");
        StorageItemDAO storageItemDAO = new StorageItemDAO();
        ArrayList<StorageItem> items = storageItemDAO.list();
        if(items.size() > 0){
            for(int x = 0; x < items.size(); x++){
                String item = storageItemDAO.print(items.get(x));
                System.out.println(item);
            }
        }
        else{
            System.out.println("Não foram encontrados registros!");
        }
        Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

        return false;
    }
}
