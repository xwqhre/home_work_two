package com.example.home_work_two;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FifthFragment extends Fragment {

    private TextView textFiveOne,textFiveTwo,textFiveThree;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textFiveOne = requireActivity().findViewById(R.id.text_five_one);
        textFiveTwo = requireActivity().findViewById(R.id.text_five_two);
        textFiveThree = requireActivity().findViewById(R.id.text_five_three);

        String result = getArguments().getString("key_text");
        textFiveOne.setText(result);

        String resultTwo = getArguments().getString("key_element");
        textFiveTwo.setText(resultTwo);

        String resultThree = getArguments().getString("key_number");
        textFiveThree.setText(resultThree);
    }
}