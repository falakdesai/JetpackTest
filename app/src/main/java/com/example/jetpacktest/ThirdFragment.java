package com.example.jetpacktest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment {

    Button btn_first;
    public NavController navController;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Using navGraph Action
        btn_first = view.findViewById(R.id.btn_thirdFrag);

        View.OnClickListener navigate = Navigation.createNavigateOnClickListener(R.id.action_thirdFragment_to_firstFragment);

        btn_first.setOnClickListener(navigate);


        //using NavController && Lambda
       /* btn_first = view.findViewById(R.id.btn_thirdFrag);
        navController = Navigation.findNavController(getActivity(),R.id.host_fragment);

        btn_first.setOnClickListener(view1 -> {

            //navController.navigate(R.id.firstFragment);

            navController.navigate(R.id.action_thirdFragment_to_firstFragment);
        });*/


    }
}