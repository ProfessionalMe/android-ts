package yufei99.com.yj;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class HuZhaoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hu_zhao);


        TextView tit = (TextView) findViewById(R.id.tit);
        tit.setText("护照审核");

        //使用Toolbar作为标题
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);

//                   //显示返回按钮
//        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);


    }

//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                finish();
//
//
//        }
//        return true;
//    }


    public void doclick(View v) {
        switch (v.getId()) {
            case R.id.ydtl:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("我已阅读并同意《服务与隐私条例》");
                builder.setMessage("服务与隐私条例 我已充分阅读并同意《服务与隐私条例》");
                builder.setPositiveButton("确认", null);
                builder.create();
                builder.show();
                break;

            case R.id.rzfh:
                finish();


        }


    }
}
