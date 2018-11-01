package com.example.watsana.prospec.utility;

public class MyConstant {

    private String hostString = "ftp.swiftcodingthai.com";
    private String userString = "pro@swiftcodingthai.com";
    private String passwordString = "Abc12345";
    private int postAnInt = 21;

    //    URL
    private String urlAddsp_mainString = "http://swiftcodingthai.com/pro/addDataWad2.php";


    //    Array
    private String[] column_sp_mainString = new String[]{
            "number",
            "t_deed",
            "field_num",
            "rawang",
            "field_area",
            "cul_name_1",
            "cul_name_2",
            "cul_name_3",
            "cul_name_4",
            "cul_name_5",
            "cul_name_6",
            "cul_name_7"
    };
    private String[] typeDocStrings = new String[]{
            "โปรดเลือกประเภท",
            "โฉลดที่ดิน",
            "โฉนดตราจอง",
            "นส.3ก",
            "นส.3",
            "อช.2",
            "อื่นๆ"
    };

//    Getter


    public String getHostString() {
        return hostString;
    }

    public String getUserString() {
        return userString;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public int getPostAnInt() {
        return postAnInt;
    }

    public String[] getColumn_sp_mainString() {
        return column_sp_mainString;
    }

    public String getUrlAddsp_mainString() {
        return urlAddsp_mainString;
    }

    public String[] getTypeDocStrings() {
        return typeDocStrings;
    }

}//Main Class

