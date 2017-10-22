package yufei99.com.yj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class KfActivity extends AppCompatActivity {
    TextView kf;
    TextView kffs;
    WebView webview;

    private String url = "https://www.sobot.com/chat/h5/index.html?sysNum=62290c3882224bdfbb4e849578cf23b5&source=2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kf);
        kf = (TextView) findViewById(R.id.kf);
        kffs = (TextView) findViewById(R.id.kffs);
        kf.setText("客服");
        webview = (WebView) findViewById(R.id.webview);
        //开启JavaScript调用
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);


    }


    public void doclick(View v) {

        switch (v.getId()) {
            case R.id.kffs:
                finish();

        }
    }


}
