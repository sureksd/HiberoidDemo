package com.om.hiberoiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.om.hiberoid.db.Hiberoid;
import com.om.hiberoiddemo.bean.Student;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final String DATABASE_NAME = "StudentData";
    private static final int DATABASE_VERSION = 2;

    private EditText name, class_name, grade;
    private ListView list;

    private Hiberoid hiberoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        class_name = (EditText) findViewById(R.id.class_name);
        grade = (EditText) findViewById(R.id.grade);

        list = (ListView) findViewById(R.id.list);

        hiberoid = new Hiberoid(this, DATABASE_NAME, DATABASE_VERSION);
    }

    public void insert(View view) {
        Student student = new Student(name.getText().toString(), class_name.getText().toString(), grade.getText().toString());

        long rowId = hiberoid.insert(student);

        Log.e(TAG, "insert: rowId=" + rowId);
    }

    public void view(View view) {
        List<Student> students = hiberoid.fetchAll(Student.class);

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            Log.e(TAG, "view: name=" + s.getName() + " Class Name=" + s.getClass_name() + " Grade=" + s.getGrade());
        }
    }

    public void marks(View view) {

    }
}
