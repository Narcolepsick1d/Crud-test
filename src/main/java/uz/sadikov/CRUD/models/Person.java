package uz.sadikov.CRUD.models;


public class Person {
    private int account;
    private String name;
    private Float value;

    public Person() {

    }

    public Person(int id, String name,float value ) {
        this.account = id;
        this.name = name;
        this.value=value;
    }

    public int getAccount() {
        return account;
    }

    public void setId(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
