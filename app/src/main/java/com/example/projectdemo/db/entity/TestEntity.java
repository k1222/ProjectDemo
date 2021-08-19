package com.example.projectdemo.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author admin
 * @Package: com.example.projectdemo.db.entity
 * @ClassName:
 * @description:
 * @date :2021/8/11 10:45 下午
 */
@Entity(tableName = "Test")
public class TestEntity {
    @PrimaryKey
    public int id;
    public String account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
