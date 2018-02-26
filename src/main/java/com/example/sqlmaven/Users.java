package com.example.sqlmaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;

    public Users() {
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if (obj instanceof Users) {
            Users tmp = (Users) obj;

            if(tmp.id.equals(this.id)){
                if(tmp.name.equals(this.name)){
                    if(tmp.password.equals(this.password))
                        return true;
                }
            }
        }
        return false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
