package com.example.home_work_two;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    private TextView textViewOne,textViewTwo,textViewThree;
    private Button buttonThree;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewOne = requireView().findViewById(R.id.textThreeOne);
        textViewTwo = requireView().findViewById(R.id.textThreeTwo);
        textViewThree = requireView().findViewById(R.id.textThreeThree);
        buttonThree = requireActivity().findViewById(R.id.buttonThree);

        String result = getArguments().getString("randomText");
        textViewTwo.setText(result);

        String resultOne = getArguments().getString("randomElement");
        textViewTwo.setText(resultOne);

        String resultThree = getArguments().getString("randomNumber");
        textViewThree.setText(result);

    buttonThree.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putString("key_text",result);
            bundle.putString("key_element", resultOne);
            bundle.putString("key_number", resultThree);
            FifthFragment fragment = new FifthFragment();
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().
                    addToBackStack(null).replace(R.id.fragment_container_view, fragment).commit();

        }
    });
        }}