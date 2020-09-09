package br.com.clothing.storage.dao;

import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;
import br.com.clothing.storage.comuns.vos.StorageItem;

import java.io.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileHandler {
    public static ArrayList<StorageItem> reader() throws IOException {
        File archive = new File(System.getProperty("user.dir") + "/" + "dados.txt");
        ArrayList<StorageItem> items = new ArrayList<>();

        if(archive.exists()){
            BufferedReader buffRead = new BufferedReader(new FileReader(archive));
            String line = "";

            while (true) {
                if (line != null) {
                    // first line is empty
                } else
                    break;
                line = buffRead.readLine();
                items.add(buildStorageItem(line));
            }
            buffRead.close();
        }
        else{
            boolean statusArchive = archive.createNewFile();
            System.out.print(statusArchive);
        }
        return items;
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static StorageItem buildStorageItem(String lineRead){
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
}
