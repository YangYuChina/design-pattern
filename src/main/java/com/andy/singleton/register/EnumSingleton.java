package com.andy.singleton.register;

public enum EnumSingleton {
    INSTANCE;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
