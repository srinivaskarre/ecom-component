package com.skarre.ecom.resource;


import com.skarre.ecom.mockdata.Mock;
import com.skarre.ecom.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class ItemController {
    /*
    returns all items with no filter and sortings
     */
    @GetMapping("/getItems")
    public List<Item> getListOfItems(){

        return new Mock().generateItems();


    }
}
