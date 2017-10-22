package yufei99.com.yj;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            TextView tit = (TextView) findViewById(R.id.tit);

            switch (item.getItemId()) {
                case R.id.navigation_zj:
                    tit.setText("足迹店");
                    zj zj = new zj();
                    getFragmentManager().beginTransaction().replace(R.id.content, zj).commit();
                    return true;
                case R.id.navigation_ts:
                    tit.setText("我的退税单");
                    ts ts = new ts();
                    getFragmentManager().beginTransaction().replace(R.id.content, ts).commit();

                    return true;
                case R.id.navigation_grzx:
                    tit.setText("个人中心");
                    grzx grzx = new grzx();
                    getFragmentManager().beginTransaction().replace(R.id.content, grzx).commit();

                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //取消标题栏
        //getSupportActionBar().hide();

        //隐藏状态栏
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
//定义actionbar 显示返回按钮
/*android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);*///设置是否显示返回按钮
        TextView tit = (TextView) findViewById(R.id.tit);
        // 程序运行 设置标题  加载足迹页的fragment
        tit.setText("足迹店");

        zj zj = new zj();
        getFragmentManager().beginTransaction().replace(R.id.content, zj).commit();

        //底部菜单项的监听
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //使用Toolbar作为标题
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);


    }


//重写onCreateOptionsMenu 加载菜单项
/*public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.navigation,menu);
        return super.onCreateOptionsMenu(menu);

    }
*/


    //足迹页按钮的监听
    public void doclick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "点击了母婴", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile_image:
                Toast.makeText(this, "点击了头像", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rz:
                Intent intent = new Intent(this, HuZhaoActivity.class);
                startActivity(intent);
                break;
            case R.id.dlhz:
                Toast.makeText(this, "点击了添加代理护照", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bz:
//                AlertDialog.Builder builder = new AlertDialog.Builder(this);
//                builder.setTitle("18514697034");
//                builder.setPositiveButton("拨打", null);
//                builder.setNegativeButton("取消", null);
//                builder.create();
//                builder.show();
                Intent intent1 = new Intent(this, KfActivity.class);
                startActivity(intent1);


        }
    }

//顶部选项按钮的监听
// public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                Toast.makeText(this, "点击了返回按钮", Toast.LENGTH_SHORT).show();
//
//
//
//        }
//        return true;
//    }



    //设置一个返回按钮
//    toolbar.setNavigationIcon(R.drawable.bk);   //这里设置按钮形状
//    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//
//        @Override
//        public void onClick(View v) {
//            finish();
//        }
//    });
}



