package com.example.nik_ax.androidlab5db;

import android.annotation.SuppressLint;

import java.io.Serializable;


    public class MyTable implements Serializable {
        private int id;
        private String name, email;

    MyTable(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @SuppressLint("DefaultLocale")
        @Override
        public String toString() {
            return String.format("id:%d   name:%s   email:%s", id, name, email);
        }
    }

