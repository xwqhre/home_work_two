package com.example.home_work_two;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    private Button buttonSecond;
    private TextView textOne, textTwo, textThree;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textOne = requireActivity().findViewById(R.id.textTwoOne);
        textTwo = requireActivity().findViewById(R.id.textTwoTwo);
        textThree = requireActivity().findViewById(R.id.textTwoThree);
        buttonSecond = requireActivity().findViewById(R.id.button_Second);

        String result = getArguments().getString("randomText");
        textOne.setText(result);

        String resultTwo = getArguments().getString("randomElement");
        textTwo.setText(resultTwo);

        String resultThree = getArguments().getString("randomNumber");
        textThree.setText(resultThree);

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key_text", result);
                bundle.putString("key_element", resultTwo);
                bundle.putString("key_number", resultThree);
                FifthFragment fragment = new FifthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).
                        replace(R.id.fragment_container_view, fragment).commit();
            }
        });
    }}