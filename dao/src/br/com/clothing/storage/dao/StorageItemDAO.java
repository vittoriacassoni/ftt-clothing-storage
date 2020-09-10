package br.com.clothing.storage.dao;

import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;
import br.com.clothing.storage.comuns.vos.StorageItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StorageItemDAO {
    private ArrayList<StorageItem> storageItems;

    public StorageItemDAO(){
        storageItems = new ArrayList<>();
    }

    public ArrayList<StorageItem> list(){
        return this.storageItems;
    }

    public void set(ArrayList<StorageItem> items){
        this.storageItems = items;
    }

    public StorageItem build(String lineRead){
        try{
            String array[] = lineRead.split("|");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Integer id = Integer.parseInt(array[0]);
            Date enterDate = dateFormat.parse(array[1]);
            String purchaseLocation = array[2];
            String type = array[3];
            String brand = array[4];
            String description = array[5];
            SizeEnum size = SizeEnum.valueOf(array[6].toUpperCase());
            ColorEnum color = ColorEnum.valueOf(array[7].toUpperCase());
            Double priceTag = Double.parseDouble(array[8]);
            Double paidPrice = Double.parseDouble(array[9]);
            Double profitPrice = Double.parseDouble(array[10]);
            Double suggestedPrice = Double.parseDouble(array[11]);

            return new StorageItem(id, enterDate, purchaseLocation, type, brand, description, size, color,
                    priceTag, paidPrice, profitPrice, suggestedPrice);
        }
        catch (Exception error){
            System.out.println("Opa alguma informação no arquivo está incoerente");
            return null;
        }
    }

    public String stringfy(StorageItem item){
        String itemStringfy = "";

        itemStringfy += item.getId() + "|";
        itemStringfy += item.getEnterDate() + "|";
        itemStringfy += item.getPurchaseLocation() + "|";
        itemStringfy += item.getType() + "|";
        itemStringfy += item.getBrand() + "|";
        itemStringfy += item.getDescription() + "|";
        itemStringfy += item.getSize().toString() + "|";
        itemStringfy += item.getColor().toString() + "|";
        itemStringfy += item.getPriceTag() + "|";
        itemStringfy += item.getPaidPrice() + "|";
        itemStringfy += item.getProfitPrice() + "|";
        itemStringfy += item.getSuggestedPrice() + "|";

        return itemStringfy;
    }

    public void add(StorageItem item){
        this.storageItems.add(item);
    }

    public void print(StorageItem item){
        String itemStringfy = "";

        itemStringfy += "Id: " + item.getId() + "|";
        itemStringfy += "Data: " + item.getEnterDate() + "|";
        itemStringfy += "Local: " + item.getPurchaseLocation() + "|";
        itemStringfy += "Tipo: " + item.getType() + "|";
        itemStringfy += "Marca: " + item.getBrand() + "|";
        itemStringfy += "Descrição: " + item.getDescription() + "|";
        itemStringfy += "Tamanho: " + item.getSize().getDescricao() + "|";
        itemStringfy += "Cor: " + item.getColor().getDescricao() + "|";
        itemStringfy += "Preço de etiqueta: " + item.getPriceTag() + "|";
        itemStringfy += "Preço pago: " + item.getPaidPrice() + "|";
        itemStringfy += "Preço com lucro: " + item.getProfitPrice() + "|";
        itemStringfy += "Preço sugerido: " + item.getSuggestedPrice() + "|";

        System.out.println(itemStringfy);
    }
}
