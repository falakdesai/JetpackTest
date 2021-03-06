package com.example.jetpacktest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment {

    Button btn_third;
    public NavController navController;

    public SecondFragment() {
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
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //using namGraph Action method
        btn_third = view.findViewById(R.id.btn_secondFrag);

        View.OnClickListener navigate = Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment);

        btn_third.setOnClickListener(navigate);


        //using NavController
        /*btn_third = view.findViewById(R.id.btn_secondFrag);
        navController = Navigation.findNavController(getActivity(),R.id.host_fragment);

        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.thirdFragment);
            }
        });*/
    }
}