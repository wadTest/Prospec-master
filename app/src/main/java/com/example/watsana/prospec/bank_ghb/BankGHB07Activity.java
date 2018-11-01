package com.example.watsana.prospec.bank_ghb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.watsana.prospec.CustomAdapter;
import com.example.watsana.prospec.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class BankGHB07Activity extends AppCompatActivity {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    boolean isExpand = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        // add data for displaying in expandable list view เพิ่มข้อมูลสำหรับแสดงในมุมมองแบบขยายได้
        loadData();

        //get reference of the ExpandableListView  ดูการอ้างอิงของมุมมองรายการแบบขยายได้
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.simpleExpandableListView);
        // create the adapter by passing your ArrayList data สร้างอะแดปเตอร์โดยการส่งข้อมูล Array List ของคุณ
        listAdapter = new CustomAdapter(BankGHB07Activity.this, deptList);
        // attach the adapter to the expandable list view  แนบอะแดปเตอร์เข้ากับมุมมองรายการที่ขยายได้
        simpleExpandableListView.setAdapter(listAdapter);

        // setOnChildClickListener listener for child row click  ตั้งค่าฟัง Listener List สำหรับ Child คลิกเพื่อคลิกลูก
        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header  รับส่วนหัวของกลุ่ม
                GroupInfo headerInfo = deptList.get(groupPosition);
                //get the child info รับข้อมูล
                ChildInfo detailInfo = headerInfo.getProductList().get(childPosition);
                //display it or do something with it  แสดงหรือทำอะไรกับมัน
                Toast.makeText(getApplicationContext(), " คลิกที่ : " + headerInfo.getName() + "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();
                return false;
            }
        });

        // setOnGroupClickListener listener for group heading click  ตั้งค่า Listener Listener List ของกลุ่มสำหรับหัวเรื่องของกลุ่มคลิก
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header  รับส่วนหัวของกลุ่ม
                GroupInfo headerInfo = deptList.get(groupPosition);
                //display it or do something with it  แสดงหรือทำอะไรกับมัน
                Toast.makeText(getApplicationContext(), " ส่วนหัวคือ: " + headerInfo.getName(),
                        Toast.LENGTH_LONG);

                return false;
            }
        });
    }

    //method to expand all groups  วิธีการขยายกลุ่มทั้งหมด
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            simpleExpandableListView.expandGroup(i);
        }
    }

    //method to collapse all groups  วิธีการยุบกลุ่มทั้งหมด
    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            simpleExpandableListView.collapseGroup(i);
        }
    }

    public void expandCollapse(View view) {
        if (isExpand) {
            //collapse all the Groups  ยุบกลุ่มทั้งหมด
            collapseAll();
            isExpand = false;
        } else {
            //expand all the Groups  ขยายกลุ่มทั้งหมด
            expandAll();
            isExpand = true;
        }
    }

    //load some initial data into out list  โหลดข้อมูลเบื้องต้นลงในรายการ
    private void loadData() {

        addProduct("คำสั่งงาน", "ชื่อ - สกุล :");
        addProduct("คำสั่งงาน", "เลขที่สมาชิก/ผู้ประเมินหลัก :");
        addProduct("ผคำสั่งงาน", "หนังสือเลขที่ :");
        addProduct("คำสั่งงาน", "ลงวันที่ :");

        addProduct("ผู้ประเมินหลัก", "ชื่อ - สกุล :");
        addProduct("ผู้ประเมินหลัก", "เลขที่สมาชิก/ผู้ประเมินหลัก :");
        addProduct("ผู้ประเมินหลัก", "หนังสือเลขที่ :");
        addProduct("ผู้ประเมินหลัก", "ลงวันที่ :");

        addProduct("ผู้มีอำนาจ", "ชื่อ - สกุล :");
        addProduct("ผู้มีอำนาจ", "เลขที่สมาชิก/ผู้ประเมินหลัก :");
        addProduct("ผู้มีอำนาจ", "หนังสือเลขที่ :");
        addProduct("ผู้มีอำนาจ", "ลงวันที่ :");

        addProduct("ผู้รับมอบอำนาจ", "ชื่อ-สกุล :");
        addProduct("ผู้รับมอบอำนาจ", "เลขที่สมาชิก/ผู้ประเมินหลัก :");
        addProduct("ผู้รับมอบอำนาจ", "หนังสือเลขที่ :");
        addProduct("ผู้รับมอบอำนาจ", "ลงวันที่ :");

        addProduct("ธุรการ", "ชื่อ-สกุล :");
        addProduct("ธุรการ", "ชื่อ-สกุล :");

        addProduct("สังกัดหน่อยงาน", "ฝ่าย");
        addProduct("สังกัดหน่อยงาน", "สาขา");
        addProduct("สังกัดหน่อยงาน", "ศุนย์");

    }

    //here we maintain our products in various departments  ที่นี่เรารักษาผลิตภัณฑ์ของเราในหน่วยงานต่างๆ
    private int addProduct(String department, String product) {

        int groupPosition = 0;

        //check the hash map if the group already exists  ตรวจสอบแผนที่แฮชถ้ากลุ่มนี้มีอยู่แล้ว
        GroupInfo headerInfo = subjects.get(department);
        //add the group if doesn't exists  เพิ่มกลุ่มหากไม่มี
        if (headerInfo == null) {
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        //get the children for the group  ให้ children เข้ากลุ่ม
        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        //size of the children list  ขนาดของรายการขนาดของรายการ children
        int listSize = productList.size();
        //add to the counter  เพิ่มไปยังเคาน์เตอร์
        listSize++;

        //create a new child and add that to the group  สร้าง children ใหม่และเพิ่มในกลุ่ม
        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        //find the group position inside the list  หาตำแหน่งกลุ่มภายในรายการ
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }
}
