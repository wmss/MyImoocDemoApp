package tk.wmss.myimoocdemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.wmss.myimoocdemoapp.SecondCourse.SecondCourseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecondCourse(View view){
        Intent intent = new Intent(MainActivity.this, SecondCourseActivity.class);
        startActivity(intent);
    }
}
