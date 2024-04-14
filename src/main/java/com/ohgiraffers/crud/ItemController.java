package com.ohgiraffers.crud;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ItemController {

    private final ItemService itemService;
    private final PrintResult printResult;

    public ItemController(){
        printResult = new PrintResult();
        itemService = new ItemService();
    }
    public void selectAllItem() {
        List<ItemDTO> itemList = itemService.selectAllItem();

        if(itemList != null){
            for(ItemDTO itemDTO : itemList) { System.out.println(itemDTO);}
            printResult.printSuccessMessage("selectAllItem");
        }else{
            printResult.printErrorMessage("selectAllItem");
        }


    }

    public void selectItemById(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        ItemDTO item = itemService.selectItemById(id);

        if(item != null){
            System.out.println(item);
            printResult.printSuccessMessage("selectItemById");
        }else{
            printResult.printErrorMessage("selectItemById");
        }


    }

    public void addItem(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int amount = Integer.parseInt(parameter.get("amount"));
        String dateString = parameter.get("date");

        LocalDate date = LocalDate.parse(dateString);

        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(id);
        itemDTO.setName(name);
        itemDTO.setPrice(price);
        itemDTO.setAmount(amount);
        itemDTO.setDate(date);

        if(itemService.addItem(itemDTO)){
            printResult.printSuccessMessage("addItem");
        }else{
            printResult.printErrorMessage("addItem");
        }


    }

    public void updateItem(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int amount = Integer.parseInt(parameter.get("amount"));
        String dateString = parameter.get("date");

        LocalDate date = LocalDate.parse(dateString);

        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(id);
        itemDTO.setName(name);
        itemDTO.setPrice(price);
        itemDTO.setAmount(amount);
        itemDTO.setDate(date);

        if(itemService.updateItem(itemDTO)){
            printResult.printSuccessMessage("updateItem");
        }else{
            printResult.printErrorMessage("updateItem");
        }
    }

    public void deletItem(Map<String, String> parameter) {
        int id = Integer.parseInt(parameter.get("id"));

        if(itemService.deleteItem(id)){
            printResult.printSuccessMessage("deleteItem");
        }else{
            printResult.printErrorMessage("deleteItem");
        }
    }
}
