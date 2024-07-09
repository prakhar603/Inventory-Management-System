package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping("/getBy/{id}")
    public Optional<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @PutMapping("/updateItem/{id}")
    public Item updateItemByID(@RequestBody Item item, @PathVariable Long id) {
        return itemService.updateItemById(id, item);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItemById(@PathVariable Long id) {
        itemService.deleteItemById(id);
    }

//    @GetMapping("/category/{category}")
//    public List<Item> getItemsByCategory(@PathVariable String category) {
//        return itemService.getItemsByCategoryName(category);
//    }

//    public void adjustPrices(@RequestBody Item item) {}


}
