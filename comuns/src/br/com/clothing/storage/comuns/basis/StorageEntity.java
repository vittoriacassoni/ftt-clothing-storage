package br.com.clothing.storage.comuns.basis;

import br.com.clothing.storage.comuns.enums.AvailableEntities;
import br.com.clothing.storage.comuns.vos.storageItems;

public class StorageEntity {

    public static Entity Storage(AvailableEntities enumEntity) {
        Entity retorno;
        switch (enumEntity)
        {
            case STORAGE:
                retorno = new storageItems();
                break;
            default:
                retorno = new Entity();
                break;
        }
        return retorno;
    }
}
