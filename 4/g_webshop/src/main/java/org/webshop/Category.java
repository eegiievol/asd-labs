package org.webshop;


import java.util.ArrayList;
import java.util.Collection;

public class Category extends ShopComponent {
    ArrayList<String> filenames;
    protected Collection<ShopComponent> fileSystemComponents = new ArrayList<ShopComponent>();

    public Category(String name) {
        super(name);
        filenames = new ArrayList<String>();
    }

    public void addComponent(ShopComponent component) {
        fileSystemComponents.add(component);
    }

    public ArrayList<String> getName() {


        for (ShopComponent component : fileSystemComponents) {
            filenames.add(component.getName().get(0));
        }
        return filenames;
    }

    public void print() {
        System.out.println("-- cat: " + name + " file names:");
        for (ShopComponent component : fileSystemComponents) {
            component.getName();
        }

        for(String name:filenames) {
            System.out.println(name);
        }
    }
}
