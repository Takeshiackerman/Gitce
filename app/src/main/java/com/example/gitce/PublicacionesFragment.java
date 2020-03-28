package com.example.gitce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.gitce.Adapter.SectionPagerAdapter2;
import com.example.gitce.Fragment.LiliaFragment;
import com.example.gitce.Fragment.VladimirFragment;
import com.example.gitce.R;
import com.google.android.material.tabs.TabLayout;

public class PublicacionesFragment extends Fragment {

    ViewPager vistas;
    TabLayout cortina;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_publicaciones, container, false);

        vistas=root.findViewById(R.id.viewPager);
        cortina=root.findViewById(R.id.tabLayout);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(vistas);
        cortina.setupWithViewPager(vistas);
        cortina.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager vistas) {
        SectionPagerAdapter2 adapter2 = new SectionPagerAdapter2(getChildFragmentManager());
        adapter2.addFragment(new VladimirFragment(),"Vladimir");
        adapter2.addFragment(new LiliaFragment(),"Lilia");

        vistas.setAdapter(adapter2);
    }
}