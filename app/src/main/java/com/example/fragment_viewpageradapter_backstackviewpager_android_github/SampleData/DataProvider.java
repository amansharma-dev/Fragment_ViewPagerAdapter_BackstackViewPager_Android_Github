package com.example.fragment_viewpageradapter_backstackviewpager_android_github.SampleData;

import com.example.fragment_viewpageradapter_backstackviewpager_android_github.model.Sticker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataProvider {

    public static final List<Sticker> stickerList = new ArrayList<>();
    public static final Map<String, Sticker> stickerMap = new HashMap<>();

    static {
        addSticker(null,"SpaceOut","img_one","Galaxy",5.9);
        addSticker(null,"Horse","img_two","Fabulous Horse",4.9);
        addSticker(null,"Fries","img_three","Eat Me",6.19);
        addSticker(null,"Watermelon","img_four","Eat It",4.9);
        addSticker(null,"Heart","img_five","Love",5.9);

    }

    private static void addSticker(String itemId, String name,String image, String description, double price){
        Sticker sticker = new Sticker(itemId,name,image,description,price);
        stickerList.add(sticker);
        stickerMap.put(itemId, sticker);
    }
}


