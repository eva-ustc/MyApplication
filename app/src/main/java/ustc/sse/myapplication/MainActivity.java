package ustc.sse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String Tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caculator_layout);
        initView();
    }

    private void initView() {
        // 第一种设置方式
        TextView view_cancel = (TextView)this.findViewById(R.id.tv_cancel);
        view_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Tag ,"利用setOnClickListener()方法绑定了点击事件...");
            }
        });
        //第二种设置方式
        TextView mPlusOrSubtract = (TextView) this.findViewById(R.id.num_PlusOrSubtract);
        mPlusOrSubtract.setOnClickListener(this);
    }


    public void oneOnClick(View view){
//        Log.d(Tag,"white click...");
        if (view instanceof TextView) {
            String num = ((TextView) view).getText().toString();
            Log.d( Tag,"num=="+num);
        }
    }
    public void onOrangeClick(View view){
//        Log.d(Tag ,"orange click...");
        if (view instanceof TextView) {
            String text = ((TextView) view).getText().toString();
            Log.d(Tag ,"text=="+text);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.num_PlusOrSubtract) {
            Log.d(Tag ,"利用实现接口的方式绑定点击事件");
        }
    }
}
