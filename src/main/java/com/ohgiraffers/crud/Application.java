package com.ohgiraffers.crud;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ItemController itemController = new ItemController();

        do{
            System.out.println("===== 상품 메뉴 =====");
            System.out.println("1. 상품 전체 조회");
            System.out.println("2. 상품 상세 조회");
            System.out.println("3. 상품 등록");
            System.out.println("4. 상품 정보 수정");
            System.out.println("5. 상품 삭제");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : itemController.selectAllItem();break;
                case 2 : itemController.selectItemById(inputItemId());break;
                case 3 : itemController.addItem(inputItem());break;
                case 4 : itemController.updateItem(inputUpdateItem());break;
                case 5 : itemController.deletItem(inputItemId());break;
                default:
                    System.out.println("잘못된 메뉴번호를 선택하셨습니다.");
            }
        }while(true);
    }

    private static Map<String, String> inputUpdateItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 상품 아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 상품 이름를 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 상품 가격를 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("수정할 상품 수량을 입력하세요 : ");
        String amount = sc.nextLine();
        System.out.print("수정할 입고날짜를 입력하세요(yyyy-mm-dd) : ");
        String date = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("amount", amount);
        parameter.put("date", date);

        return parameter;

    }

    private static Map<String, String> inputItem() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("상품 아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("상품 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("상품 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("상품 수량을 입력하세요 : ");
        String amount = sc.nextLine();
        System.out.print("입고 날짜를 입력하세요(yyyy-mm-dd) : ");
        String date = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("price", price);
        parameter.put("amount", amount);
        parameter.put("date", date);

        return parameter;

    }

    private static Map<String, String> inputItemId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("상품 아이디를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("id", id);

        return parameter;

    }
}
