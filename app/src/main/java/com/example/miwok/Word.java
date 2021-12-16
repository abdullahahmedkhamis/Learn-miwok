package com.example.miwok;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourcedId;
    private int mColorResourceId;
    private int mAudioResourceId;

    ArrayList<String> data;
    private ArrayList<Word> items;
    String[] Array = {"mDefaultTranslation", "mMiwokTranslation", "mImageResourcedId", "mColorResourceId", "mAudioResourceId"};

    public class Item {
        String username;
        String number;
        String content;

    }


    // private int mImageResourcedId = No_IMAGE_PROVIDER;
    private static final int No_IMAGE_PROVIDER = 1;

    public Word(ArrayList<String> data, ArrayList<Word> items, String[] array) {
        this.data = data;
        this.items = items;
        Array = array;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourcedId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourcedId = mImageResourcedId;
        this.mColorResourceId = mColorResourceId;
        this.mAudioResourceId = mAudioResourceId;


    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getmImageResourcedId() {
        return mImageResourcedId;
    }

    public void setmImageResourcedId(int mImageResourcedId) {
        this.mImageResourcedId = mImageResourcedId;
    }

    public int getmColorResourceId() {
        return mColorResourceId;
    }

    public void setmColorResourceId(int mColorResourceId) {
        this.mColorResourceId = mColorResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourcedId != No_IMAGE_PROVIDER;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourcedId=" + mImageResourcedId +
                ", mColorResourceId=" + mColorResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';


    }




        public ArrayList<String> getData() {
            return data;
        }

        public void setData(ArrayList<String> data) {
            this.data = data;
        }

        public ArrayList<Word> getItems() {
            return items;
        }

        public void setItems(ArrayList<Word> items) {
            this.items = items;
        }

        public String[] getArray() {
            return Array;
        }

        public void setArray(String[] array) {
            Array = array;
        }

        public static int getNo_IMAGE_PROVIDER() {
            return No_IMAGE_PROVIDER;
        }
    }
class ListAdapter extends ArrayAdapter<Word.Item> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        // TODO Auto-generated constructor stub
    }

    private List<Word.Item> items;

    public ListAdapter(Context context, int resource, List<Word.Item> items) {

        super(context, resource, items);

        this.items = items;

    }
}

