package com.example.gitce;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.gitce.Adapter.SectionPageAdapter;
import com.example.gitce.Fragment.AcercadeFragment;
import com.example.gitce.Fragment.GrupoinvestigacionFragment;
import com.example.gitce.Fragment.LineasinvestigacionFragment;
import com.example.gitce.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MiembrosFragment extends Fragment {

   View myFragment;

   ViewPager viewPager;
   TabLayout tabLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_miembros, container, false);

        viewPager=myFragment.findViewById(R.id.viewPager);
        tabLayout=myFragment.findViewById(R.id.tabLayout);

        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
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

    private void setUpViewPager(ViewPager viewPager) {
        SectionPageAdapter adapter=new SectionPageAdapter(getChildFragmentManager());

        adapter.addFragment(new AcercadeFragment(),"Acerca de Nosotros");
        adapter.addFragment(new GrupoinvestigacionFragment(),"Grupo de Investigacion");
        adapter.addFragment(new LineasinvestigacionFragment(),"Lineas de Investigacion");

        viewPager.setAdapter(adapter);
    }

}