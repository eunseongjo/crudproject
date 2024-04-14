package com.ohgiraffers.crud;

public class PrintResult {
    public void printSuccessMessage(String successCode) {
    String successMessage = "";
    switch (successCode){
        case "selectAllItem" : successMessage="상품 전체 조회에 성공하였습니다."; break;
        case "selectItemById" : successMessage="상품 상세 조회에 성공하였습니다.";break;
        case "addItem" : successMessage = "상품 등록에 성공하였습니다.";break;
        case "updateItem" : successMessage = "상품 수정에 성공하였습니다."; break;
        case "deleteItem" : successMessage = "상품 삭제에 성공하였습니다."; break;
    }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectAllItem" : errorMessage = "상품 전체 조회에 실패하였습니다."; break;
            case "selectItemById" : errorMessage = "상품 상세 조회에 실패하였습니다."; break;
            case "addItem" :errorMessage = "상품 등록에 실패하였습니다."; break;
            case "updateItem" : errorMessage = "상품 수정에 실패하였습니다."; break;
            case "deleteItem" : errorMessage = "상품 삭제에 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }
}
