package com.example.gitce.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter2 extends FragmentPagerAdapter {

    private List<Fragment> fragmentos = new ArrayList<>();
    private List<String> titles= new ArrayList<>();

    public SectionPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentos.get(position);
    }

    @Override
    public int getCount() {
        return fragmentos.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        fragmentos.add(fragment);
        titles.add(title);
    }
}
