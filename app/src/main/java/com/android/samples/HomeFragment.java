package com.android.samples;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.samples.databinding.FragmentHomeBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        User user = new User();
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false);
        binding.setUser(user);

        EventHandler eventHandler = new EventHandler();
        binding.setHandler(eventHandler);

        return binding.getRoot();
    }

}
