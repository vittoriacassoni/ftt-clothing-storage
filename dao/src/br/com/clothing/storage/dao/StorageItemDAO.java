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

    public void stringfy(ArrayList<StorageItem> items){
        this.storageItems = items;
    }

    public void add(StorageItem item){
        this.storageItems.add(item);
    }
}
