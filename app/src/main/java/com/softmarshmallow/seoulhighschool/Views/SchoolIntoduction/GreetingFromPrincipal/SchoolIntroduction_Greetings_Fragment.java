package com.softmarshmallow.seoulhighschool.Views.SchoolIntoduction.GreetingFromPrincipal;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.softmarshmallow.seoulhighschool.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SchoolIntroduction_Greetings_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SchoolIntroduction_Greetings_Fragment extends Fragment
{
        
        private static final String TAG ="Greetings";
        
        public SchoolIntroduction_Greetings_Fragment() {
                // Required empty public constructor
        }
        
        /**c
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment SchoolIntroduction_SchoolSymbols_Fragment.
         */
        // TODO: Rename and change types and number of parameters
        public static SchoolIntroduction_Greetings_Fragment newInstance() {
                return new SchoolIntroduction_Greetings_Fragment();
        }
        
        
        
        @BindView(R.id.scrollView)
        NestedScrollView mScrollView;
        
        
        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
        
        }
        
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                View view = inflater.inflate(R.layout.fragment_school_introduction__greetings, container,
                        false);
        
                ButterKnife.bind(this, view);
                
                
                return view;
                
        }
        
        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
                super.onViewCreated(view, savedInstanceState);
        
                MaterialViewPagerHelper.registerScrollView(getActivity(),  mScrollView);
        
        }
}
