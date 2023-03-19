package org.webshop;

import java.util.ArrayList;

public abstract class ShopComponent {
    protected String name;
    public abstract void print();
    public abstract ArrayList<String> getName();

    public ShopComponent(String name) {
        this.name = name;
    }


}
