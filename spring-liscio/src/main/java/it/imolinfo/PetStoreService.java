package it.imolinfo;


public class PetStoreService {
    private String usernameList;
    private int a;

    public PetStoreService() {
    }

    public PetStoreService(String usernameList) {
        this.usernameList = usernameList;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getUsernameList() {
        return usernameList;
    }

    public void setUsernameList(String usernameList) {
        this.usernameList = usernameList;
    }
}
