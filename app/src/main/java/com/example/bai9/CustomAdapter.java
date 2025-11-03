package com.example.bai9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> arrContact;

    public CustomAdapter(Context context, int resource, List<Contact> arrContact) {
        super(context, resource, arrContact);
        this.context = context;
        this.resource = resource;
        this.arrContact = arrContact;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imgAvatar = convertView.findViewById(R.id.imgAvatar);
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvMaSinhVien = convertView.findViewById(R.id.tvMaSinhVien);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = arrContact.get(position);

        // Gán ảnh đại diện
        viewHolder.imgAvatar.setImageResource(contact.getAvatarResId());
        viewHolder.tvName.setText(contact.getName());
        viewHolder.tvMaSinhVien.setText("MSSV: " + contact.getIdStudent());

        return convertView;
    }

    static class ViewHolder {
        ImageView imgAvatar;
        TextView tvName, tvMaSinhVien;
    }
}
