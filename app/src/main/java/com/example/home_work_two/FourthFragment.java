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


public class FourthFragment extends Fragment {

    private TextView textFourOne,textFourTwo,textFourThree;
    private Button buttonFour;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textFourOne = requireActivity().findViewById(R.id.text_four_one);
        textFourTwo = requireActivity().findViewById(R.id.text_four_two);
        textFourThree = requireActivity().findViewById(R.id.text_four_three);
        buttonFour = requireActivity().findViewById(R.id.button_four);

        String result = getArguments().getString("randomText");
        textFourOne.setText(result);

        String resultTwo = getArguments().getString("randomElement");
        textFourTwo.setText(resultTwo);

        String resultThree = getArguments().getString("randomNumber");
        textFourThree.setText(resultThree);

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key_text", result);
                bundle.putString("key_element", resultTwo);
                bundle.putString("key_number", resultThree);
                FifthFragment fragment = new FifthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().
                        addToBackStack(null).replace(R.id.fragment_container_view, fragment).commit();

            }
        });
    }
}