package com.educandoweb.coursejpa.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    //metodo estatico para converter o codigo do enum para o enum
    public static OrderStatus toEnum(int code){
        for (OrderStatus status : OrderStatus.values()) {
            if(status.getCode() == code){
                return status;
            }
        }
        throw new IllegalArgumentException("Code does not exist!");
    }

    //Caso não atruibuirmos os valores numericos manualmente o java
    //vai atribuir automaticamente os valores sequencialmente começando do zero
}
