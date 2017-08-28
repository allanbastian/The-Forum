package com.adgvit.allan.theforum;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Allan on 28-08-2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter{

    public FragmentAdapter(FragmentManager fm) {
        //required constructor
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: ForumFrag forumFrag = new ForumFrag();
                    return forumFrag;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
