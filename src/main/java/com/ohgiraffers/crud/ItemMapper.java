package com.ohgiraffers.crud;

import java.util.List;

public interface ItemMapper {
    List<ItemDTO> selectAllItem();

    ItemDTO selectItemById();

    int addItem(ItemDTO itemDTO);

    int updateItem(ItemDTO itemDTO);

    int deleteItem(int id);
}
