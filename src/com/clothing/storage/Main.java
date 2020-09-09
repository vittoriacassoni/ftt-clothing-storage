package com.clothing.storage;

import br.com.clothing.storage.dao.FileHandler;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        FileHandler.reader();
    }
}
