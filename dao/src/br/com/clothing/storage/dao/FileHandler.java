package br.com.clothing.storage.dao;

import br.com.clothing.storage.comuns.enums.ColorEnum;
import br.com.clothing.storage.comuns.enums.SizeEnum;
import br.com.clothing.storage.comuns.vos.StorageItem;
import br.com.clothing.storage.dao.StorageItemDAO;

import java.io.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileHandler {
    private StorageItemDAO storageItemDAO = new StorageItemDAO();

    public void reader() throws IOException {
        File archive = new File(System.getProperty("user.dir") + "/" + "dados.txt");

        if(archive.exists()){
            BufferedReader buffRead = new BufferedReader(new FileReader(archive));
            String line = buffRead.readLine();

            while (true) {
                if (line != null) {
                    StorageItem item = storageItemDAO.build(line);
                    storageItemDAO.add(item);
                } else
                    break;
                line = buffRead.readLine();
            }
            buffRead.close();
        }
        else{
            boolean statusArchive = archive.createNewFile();
            System.out.print(statusArchive);
        }
    }

    public void writer() throws IOException {
        File archive = new File(System.getProperty("user.dir") + "/" + "dados.txt");

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(archive));
        ArrayList<StorageItem> storageItems = storageItemDAO.list();
        System.out.println("Salvando ...");
        buffWrite.write("");

        for (int x = 0; x < storageItems.size(); x++){
            buffWrite.append(storageItemDAO.stringfy(storageItems.get(x)) + "\n");
        }

        buffWrite.close();
    }
}
