package com.example.bai9;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private TextView tvTitle, tvSubtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lvContact);
        tvTitle = findViewById(R.id.tvTitle);
        tvSubtitle = findViewById(R.id.tvSubtitle);

        // Tạo danh sách Contact
        ArrayList<Contact> arrContact = new ArrayList<>();
        arrContact.add(new Contact("Trần Thị Oanh", "23115053122330", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Lê Quốc Bảo", "231150530002", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Phan Thị Cẩm Tú", "231150530003", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Trần Hữu Dũng", "231150530004", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Đặng Thị Hòa", "231150530005", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Võ Văn Khánh", "231150530006", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Ngô Minh Thư", "231150530007", R.drawable.avatar_default_img));
        // Gán adapter
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.row_listview, arrContact);
        lvContact.setAdapter(customAdapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Contact contact = arrContact.get(position);

                tvTitle.setText(contact.getName());
                tvSubtitle.setText("Mã sinh viên: " + contact.getIdStudent());
            }
        });
    }
}
