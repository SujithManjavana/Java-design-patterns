package com.sujith.prototype_design_pattern;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.setShopName("MaasiBooks");
        shop.loadData();


       // BookShop shop2 = (BookShop) shop.clone(); //shallow cloning will not make new object
        BookShop shop2 = shop.clone(); //deep cloning
        shop2.setShopName("Harisree");
        shop.getBooks().remove(2);//this will not affect data in shop2 in deep cloning

        System.out.println(shop);
        System.out.println(shop2);
    }
}
