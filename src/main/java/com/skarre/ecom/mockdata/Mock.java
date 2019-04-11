package com.skarre.ecom.mockdata;

import com.skarre.ecom.model.Item;
import com.skarre.ecom.model.ItemBuilder;

import java.util.Arrays;
import java.util.List;

public class Mock {

    public Mock(){

    }

    public List<Item> generateItems(){
        return Arrays.asList(
            new ItemBuilder().setItemName("abc").setItemStyle("BASIC").setColor("BLACK").setBasePrice(100.0).setDiscount(20.0).build(),
                new ItemBuilder().setItemName("abc").setItemStyle("BASIC").setColor("BLACK").setBasePrice(100.0).setDiscount(20.0).build(),
        new ItemBuilder().setItemName("abc").setItemStyle("BASIC").setColor("BLACK").setBasePrice(100.0).setDiscount(20.0).build(),
        new ItemBuilder().setItemName("abc").setItemStyle("BASIC").setColor("BLACK").setBasePrice(100.0).setDiscount(20.0).build(),
        new ItemBuilder().setItemName("abc").setItemStyle("BASIC").setColor("BLACK").setBasePrice(100.0).setDiscount(20.0).build(),
        new ItemBuilder().setItemName("abc").setItemStyle("BASIC").setColor("BLACK").setBasePrice(100.0).setDiscount(20.0).build()
        );

    }
}
