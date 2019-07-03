package com.example.fragment_viewpageradapter_backstackviewpager_android_github;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragment_viewpageradapter_backstackviewpager_android_github.SampleData.DataProvider;
import com.example.fragment_viewpageradapter_backstackviewpager_android_github.model.Sticker;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Sticker> stickerList = DataProvider.stickerList;
    private final int numPages = stickerList.size();
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        PagerAdapter pagerAdapter = new ViewPagerFragment(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    public class ViewPagerFragment extends FragmentStatePagerAdapter{
        public ViewPagerFragment(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return ItemFragment.newInstance(stickerList.get(i));
        }

        @Override
        public int getCount() {
            return numPages;
        }
    }
}
