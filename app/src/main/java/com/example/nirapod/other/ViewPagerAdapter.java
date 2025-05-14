package com.example.nirapod.other;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.nirapod.tabs.EmergencyContactsFragment;
import com.example.nirapod.tabs.MediaFragment;
import com.example.nirapod.tabs.PersonalInfoFragment;
import com.example.nirapod.tabs.SecurityFragment;
import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PersonalInfoFragment();
            case 1:
                return new SecurityFragment();
            case 2:
                return new EmergencyContactsFragment();
            case 3:
                return new MediaFragment();
            default:
                return new PersonalInfoFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
