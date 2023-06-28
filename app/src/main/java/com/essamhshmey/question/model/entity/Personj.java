package com.essamhshmey.question.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "personj_table")
public class Personj {
    @ColumnInfo(name = "person_name")
    private String name;
    @ColumnInfo(name = "person_age")
    private int age;


    private Personj(Builder builder){
        this.name=builder.name;
        this.age= builder.age;
    }
    public static class Builder{
        private String name;
        private int age;
        public Builder(){}
        public Builder Name(String name){
            this.name=name;
            return this;
        }
        public Builder Age(int age){
            this.age=age;
            return this;
        }
    }
}
