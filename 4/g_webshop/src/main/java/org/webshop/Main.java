package org.webshop;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Camera");
        Product p2 = new Product("TV");

        Category c1 = new Category("Cat1");
        c1.addComponent(p1);
        c1.addComponent(p2);

        c1.print();


    }
}