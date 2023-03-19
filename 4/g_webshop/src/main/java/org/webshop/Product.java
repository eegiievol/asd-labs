package org.webshop;

import java.util.ArrayList;

public class Product extends ShopComponent{

    public Product(String name) {
        super(name);
    }

    @Override
    public void print() {
        //error
    }

    public ArrayList<String> getName() {
        ArrayList<String> names = new ArrayList<String>();

        names.add(name);

        return names;
    }

}
