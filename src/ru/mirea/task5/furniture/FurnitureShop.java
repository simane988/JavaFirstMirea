package ru.mirea.task5.furniture;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> inStock;

    public FurnitureShop(){
        this.inStock = new ArrayList<>();
    }

    public void add(Furniture item){
        inStock.add(item);
    }

    public String getStock(){
        StringBuilder ans = new StringBuilder();
        for (Furniture furniture : this.inStock) {
            ans.append(furniture.toString());
        }
        return ans.toString();
    }
}
