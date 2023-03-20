package com.example.home_work_two;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


public class FirstFragment extends Fragment {
        private Button buttonForth;
        private Button buttonSecond;
        private Button buttonThird;

        private String[] randomText = {"white home", "good day", "some coffee","pink unicorn","blue zebra"};
        private String[] randomNumbers = {"12", "4839", "983", "3820", "31"};
        private String[] randomElements = {"true", "false"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        buttonSecond = requireActivity().findViewById(R.id.buttonSecond);
        buttonThird = requireActivity().findViewById(R.id.buttonThird);
        buttonForth = requireActivity().findViewById(R.id.buttonFourth);

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Bundle bundle = new Bundle();
               bundle.putString ("randomText", getRandomText());
                bundle.putString("randomElement", getRandomElements());
                bundle.putString("randomNumber", getRandomNumber());

                SecondFragment fragment = new SecondFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.fragment_container_view, fragment).commit();
            }
        });

        buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdFragment secondFragment = new ThirdFragment();
                Bundle bundle = new Bundle();
                bundle.putString ("randomText", getRandomText());
                bundle.putString("randomElement", getRandomElements());
                bundle.putString("randomNumber", getRandomNumber());
                secondFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.fragment_container_view,secondFragment).commit();
            }
        });

        buttonForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragment fourthFragment = new FourthFragment();
                Bundle bundle = new Bundle();
                bundle.putString ("randomText", getRandomText());
                bundle.putString("randomElement", getRandomElements());
                bundle.putString("randomNumber", getRandomNumber());
                fourthFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.fragment_container_view,fourthFragment).commit();
            }
        });
    }

            private String getRandomText() {
        return randomText[new Random().nextInt(randomText.length)];
        }

            private String getRandomElements() {
        return randomElements[new Random().nextInt(randomElements.length)];
        }

            private String getRandomNumber() {
        return randomNumbers[new Random().nextInt(randomNumbers.length)];
        }
             }

