package br.com.clothing.storage.console.estadoConsole;
import br.com.clothing.storage.console.Main;
import br.com.clothing.storage.dao.StorageItemDAO;

import java.text.ParseException;
import java.util.Scanner;

public class EstadoConsoleEditar extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() throws ParseException {
        try {
            System.out.println("Editar");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o código da mercadoria: ");
            Integer id = scanner.nextInt();

            StorageItemDAO storageItemDAO = new StorageItemDAO();
            Integer indexOfStorageItem = storageItemDAO.getRecordById(id);

            if (indexOfStorageItem != -1) {
                System.out.println(("Digite o novo preço sugerido: "));
                Double newSugestedPrice = scanner.nextDouble();
                storageItemDAO.edit(indexOfStorageItem, newSugestedPrice);
            }

            Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();

            return false;
        }
        catch (Exception error) {
            System.out.println("Código inválido!!");
            return true;
        }
    }
}
