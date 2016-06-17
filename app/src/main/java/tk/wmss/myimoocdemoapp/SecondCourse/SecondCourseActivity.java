package tk.wmss.myimoocdemoapp.SecondCourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import tk.wmss.myimoocdemoapp.R;

/**
 * Created by wmss on 2016/6/11.
 */
public class SecondCourseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_course);
    }

    public void goToListView(View view){
        Intent intent = new Intent(SecondCourseActivity.this, ListViewActivity.class);
        startActivity(intent);
    }

    public void  goToSelectTime(View view){
        Intent intent = new Intent(this, SelectTimeActivity.class);
        startActivity(intent);
    }

}
