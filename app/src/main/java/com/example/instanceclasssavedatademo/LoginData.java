package com.example.instanceclasssavedatademo;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginData {
    private static LoginData instance; // 單例實例變數


    private String username; // 用戶名
    private String email; // 電子郵件
    private String password; // 密碼
    private String phone; // 電話

    private ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();



    // 私有構造函數，防止外部直接使用 new 創建實例
    private LoginData() {}


    // 提供一個公共的靜態方法，用於獲取單例
    public static LoginData getInstance() {
        if (instance == null) {
            synchronized (LoginData.class) { // 確保線程安全
                if (instance == null) {
                    instance = new LoginData();
                }
            }
        }
        return instance;
    }



    // getter 和 setter 方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<HashMap<String, String>> getData() {
        return data;
    }

    public void setData(ArrayList<HashMap<String, String>> data) {
        this.data = data;
    }
}
