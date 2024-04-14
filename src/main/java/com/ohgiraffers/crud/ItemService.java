package com.ohgiraffers.crud;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.crud.Template.getSqlSession;

public class ItemService {
    public List<ItemDTO> selectAllItem() {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        List<ItemDTO> itemList = itemMapper.selectAllItem();

        sqlSession.close();

        return itemList;

    }

    public ItemDTO selectItemById(int id) {
        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        ItemDTO item = itemMapper.selectItemById();

        sqlSession.close();

        return item;
    }

    public boolean addItem(ItemDTO itemDTO) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.addItem(itemDTO);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean updateItem(ItemDTO itemDTO) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.updateItem(itemDTO);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }

    public boolean deleteItem(int id) {

        SqlSession sqlSession = getSqlSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.deleteItem(id);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
}
}
