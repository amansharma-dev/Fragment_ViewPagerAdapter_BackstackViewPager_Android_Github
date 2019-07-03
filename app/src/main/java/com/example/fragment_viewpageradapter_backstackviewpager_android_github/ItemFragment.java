package com.example.fragment_viewpageradapter_backstackviewpager_android_github;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fragment_viewpageradapter_backstackviewpager_android_github.model.Sticker;

import java.io.IOException;
import java.io.InputStream;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment extends Fragment {

    public TextView stickerName,stickerDescription,stickerPrice;
    public ImageView stickerImage;
    private Sticker sticker;
    public static final String STICKER_KEY="sticker_key";
    public static final String TAG = "Item_Fragment";

    public static ItemFragment newInstance(Sticker sticker) {

        Bundle args = new Bundle();
        args.putParcelable(STICKER_KEY,sticker);
        ItemFragment fragment = new ItemFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        Bundle args = getArguments();
        if(args == null) throw new AssertionError();

        sticker = args.getParcelable(STICKER_KEY);
        if(sticker == null) throw new AssertionError();

        stickerName = view.findViewById(R.id.sticker_name);
        stickerDescription = view.findViewById(R.id.sticker_description);
        stickerPrice = view.findViewById(R.id.sticker_price);

        stickerImage = view.findViewById(R.id.sticker_image);


        stickerName.setText(sticker.getSticker_Name());
        stickerDescription.setText(sticker.getSticker_description());
        stickerPrice.setText(String.valueOf(sticker.getSticker_Price()));


        String image = sticker.getSticker_Image();
        int imageResource =  getActivity().getResources().getIdentifier(image,"drawable",getActivity().getPackageName());
        stickerImage.setImageResource(imageResource);

//        Log.i(TAG,"Id:-> "+sticker.getSticker_Id()+","+sticker.getSticker_Name()+","+sticker.getSticker_Image()+","+sticker.getSticker_description()+","+
//                sticker.getSticker_Price());

        return view;
    }

}
