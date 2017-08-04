package com.example.samanthayao.quantumtictactoe;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Samantha Yao on 8/3/2017.
 */

public class ButtonAdapter extends BaseAdapter {
    private Context mContext;

    // Gets the context so it can be used later
    public ButtonAdapter(Context c) {
        mContext = c;
    }

    // Total number of things contained within the adapter
    public int getCount() {
        return filesnames.length;
    }

    // Require for structure, not really used in my code.
    public Object getItem(int position) {
        return null;
    }

    // Require for structure, not really used in my code. Can
    // be used to get the id of an item in the adapter for
    // manual control.
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position,
                        View convertView, ViewGroup parent) {
        Button btn;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            btn = new Button(mContext);
            btn.setLayoutParams(new GridView.LayoutParams(300, 300));
            btn.setPadding(5, 5, 5, 5);
        }
        else {
            btn = (Button) convertView;
        }
        btn.setText(filesnames[position]);
        // filenames is an array of strings
        btn.setTextColor(Color.BLACK);
        btn.setBackgroundResource(R.drawable.cell);
        btn.setId(position);

        return btn;
    }
    public String[] filesnames = {
            "1","2","3","4","5","6","7","8","9"
    };
}