package com.om.hiberoiddemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.om.hiberoiddemo.R;
import com.om.hiberoiddemo.bean.Student;

import java.util.List;

/**
 * Created by Surendra on 12/23/2016.
 */
public class StudentAdapter extends ArrayAdapter<Student> {

    private static final String TAG = "StudentAdapter";
    private LayoutInflater li;

    public StudentAdapter(Context context, int resource, List<Student> objects) {
        super(context, resource, objects);
        li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {

        if (v == null) {
            v = li.inflate(R.layout.student_view, null);
            Holder h = new Holder();
            h.tv_name = (TextView) v.findViewById(R.id.tv_name);
            h.tv_class_name = (TextView) v.findViewById(R.id.tv_class_name);
            h.tv_grade = (TextView) v.findViewById(R.id.tv_grade);

            v.setTag(h);
        }

        Holder h = (Holder) v.getTag();
        Student s = getItem(position);
        h.tv_name.setText(s.getName());
        h.tv_class_name.setText(s.getClass_name());
        h.tv_grade.setText(s.getGrade());

        return v;
    }

    class Holder {
        private TextView tv_name, tv_class_name, tv_grade;
    }
}
