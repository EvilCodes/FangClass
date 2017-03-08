package cn.ucai.blackfox.fangclass.View.activitys;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.View.fragments.CartFragment;
import cn.ucai.blackfox.fangclass.View.fragments.CategoryFragment;
import cn.ucai.blackfox.fangclass.View.fragments.FirstFragment;
import cn.ucai.blackfox.fangclass.View.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView[] textViews;
    Fragment[] fragments;
    int[] drawableSelected;
    int[] drawableIdDefault;
    FragmentManager fragmentManager;
    //    不能用一个transaction来表示所有的动作
//    FragmentTransaction transaction;
    private final static String TAG = MainActivity.class.getSimpleName();
    int tabNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        setListenter();
    }

    private void setListenter() {
        textViews[0].setOnClickListener(this);
        textViews[1].setOnClickListener(this);
        textViews[2].setOnClickListener(this);
        textViews[3].setOnClickListener(this);
    }
    private void initData() {
        fragments = new Fragment[]{
                new FirstFragment(), new CategoryFragment(), new CartFragment(),
                new ProfileFragment()
        };
        fragmentManager = getSupportFragmentManager();
        textViews = new TextView[]{(TextView) findViewById(R.id.tv_first),
                (TextView) findViewById(R.id.tv_category),(TextView) findViewById(R.id.tv_cart),
                (TextView) findViewById(R.id.tv_profile)
        };
        drawableSelected = new int[]{R.drawable.ic_button1_on,R.drawable.ic_button2_on,
                R.drawable.ic_button3_on,R.drawable.ic_button4_on};
        drawableIdDefault = new int[]{R.drawable.ic_button1_off,R.drawable.ic_button2_off,
                R.drawable.ic_button3_off,R.drawable.ic_button4_off};
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_first:
                tabNum = 0;
                break;
            case R.id.tv_category:
                tabNum = 1;
                break;
            case R.id.tv_cart:
                tabNum = 2;

                break;
            case R.id.tv_profile:
                tabNum = 3;
                break;
        }
        setTabStatus();
    }
    private void setTabStatus() {
        for (int i=0;i<fragments.length;i++) {
            if (i == tabNum) {
                textViews[i].setCompoundDrawables(null,getMyDrawable(drawableSelected[i]),null,null);
                ((fragmentManager.beginTransaction()).replace(R.id.fm_replace, fragments[i])).commit();
                textViews[i].setSelected(true);

            } else {
                textViews[i].setCompoundDrawables(null,getMyDrawable(drawableIdDefault[i]),null,null);
                textViews[i].setSelected(false);
            }
        }
    }
    private Drawable getMyDrawable(int drawableId) {
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(drawableId);
        Log.e(TAG, "drawable=" + drawable);
        drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        return drawable;
    }
}
