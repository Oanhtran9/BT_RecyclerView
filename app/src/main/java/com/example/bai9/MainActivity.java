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
        arrContact.add(new Contact("Nguyễn Quốc Cường", "161250533405", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Nguyễn Khương Đào", "151250533308", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Vy Văn Đô", "161250533207", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Phạm Nguyễn Hoài Duy", "151250533113", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Đỗ Thiên Giang", "131250532378", R.drawable.avatar_default_img));
        arrContact.add(new Contact("Võ Hữu Hải", "151250533116", R.drawable.avatar_default_img));

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
