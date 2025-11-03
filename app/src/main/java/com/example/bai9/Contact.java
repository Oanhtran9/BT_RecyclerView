package com.example.bai9;

public class Contact {
    private String name;
    private String idStudent;
    private int avatarResId;

    public Contact(String name, String idStudent, int avatarResId) {
        this.name = name;
        this.idStudent = idStudent;
        this.avatarResId = avatarResId;
    }
    public String getName() {
        return name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public int getAvatarResId() {
        return avatarResId;
    }
}
