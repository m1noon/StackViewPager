package com.minoon.stackviewpagersample;


import android.app.Fragment;
import android.app.FragmentManager;

/**
 * Created by a13587 on 15/05/24.
 */
public class SampleAdapter extends SupportFragmentPagerAdapter {
    private static final String TAG = SampleAdapter.class.getSimpleName();

    public SampleAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AFragment.newInstance();
            case 1:
                return BFragment.newInstance();
        }
        return null;
    }

    @Override
    public float getPageWidth(int position) {
        if(position == 1) {
            // ここでOverlapViewの幅を指定
            return 0.2f;
        }
        return super.getPageWidth(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
