package com.example.lependu_38007562;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.zip.Inflater;

    public class CustomAdapter extends BaseAdapter {
        Context context;
        String countryList[];
        int flags[];
        LayoutInflater inflater;

        public CustomAdapter(Context applicationContext, String[] countryList, int[] flags) {
            this.context = context;
            this.countryList = countryList;
            this.flags = flags;
            inflater = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return countryList.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = inflater.inflate(R.layout.activity_listview, null);

            TextView country = (TextView) view.findViewById(R.id.textView);
            ImageView icon = (ImageView) view.findViewById(R.id.icon);
            country.setText(countryList[i]);
            icon.setImageResource(flags[i]);
            return view;
        }
        public View getView2(View view){

            View view2 = view.findViewById(R.id.linearLayout2);
            return view2;

        }



    }

