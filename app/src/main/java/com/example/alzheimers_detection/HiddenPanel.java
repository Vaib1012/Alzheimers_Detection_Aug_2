package com.example.alzheimers_detection;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

class HiddenPanel {

    //call this method to show a pop up
    @SuppressLint("WrongViewCast")
    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    void showPopUp(final Context c, final String stage_name){
        //We need to get the instance of the LayoutInflater, use the context of this activity
        LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Inflate the view from a predefined XML layout (no need for root id, using entire layout)
        View layout = inflater.inflate(R.layout.menu_popup,null);
        //to set game description
        //Get the devices screen density to calculate correct pixel sizes
        float density=c.getResources().getDisplayMetrics().density;
        // create a focusable PopupWindow with the given layout and correct size
        final PopupWindow pw = new PopupWindow(layout, (int)density*390, (int)density*520, true);
        pw.setOutsideTouchable(false);

        // display the pop-up in the center
        pw.showAtLocation(layout, Gravity.CENTER, 0, 0);

        layout.findViewById(R.id.how_to_play).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stage_name.contains("ExecutiveFunctioning"))
                    change_stage1(c);
                if(stage_name.contains("Naming"))
                    change_stage2(c);
                if(stage_name.contains("Abstraction"))
                    change_stage3(c);
                if(stage_name.contains("Calculation"))
                    change_stage4(c);
                if(stage_name.contains("Orientation"))
                    change_stage5(c);
                if(stage_name.contains("ImmediateRecall"))
                    change_stage6(c);
                if(stage_name.contains("Attention"))
                    change_stage7(c);
                if(stage_name.contains("Visuoperception"))
                    change_stage8(c);
                if(stage_name.contains("Fluency"))
                    change_stage9(c);
                if(stage_name.contains("DelayedRecall"))
                    change_stage10(c);
                pw.dismiss();
            }
        });
        layout.findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(c, HomeScreen.class);
                c.startActivity(myIntent);
                pw.dismiss();
            }
        });
        layout.findViewById(R.id.nextstage).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stage_name.contains("ExecutiveFunctioning"))
                    next_stage1(c);
                if(stage_name.contains("Naming"))
                    next_stage2(c);
                if(stage_name.contains("Abstraction"))
                    next_stage3(c);
                if(stage_name.contains("Calculation"))
                    next_stage4(c);
                if(stage_name.contains("Orientation"))
                    next_stage5(c);
                if(stage_name.contains("ImmediateRecall"))
                    next_stage6(c);
                if(stage_name.contains("Attention"))
                    next_stage7(c);
                if(stage_name.contains("Visuoperception"))
                    next_stage8(c);
                if(stage_name.contains("Fluency"))
                    next_stage9(c);
                if(stage_name.contains("DelayedRecall"))
                    next_stage10(c);
                pw.dismiss();
            }
        });
        layout.findViewById(R.id.settings).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(c, Settings.class);
                c.startActivity(myIntent);
                pw.dismiss();
            }
        });
    }
    private void next_stage10(Context c) {
        Intent myIntent = new Intent(c, AskForJournal.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage9(Context c) {
        Intent myIntent = new Intent(c, DelayedRecall_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage8(Context c) {
        Intent myIntent = new Intent(c, Fluency_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage7(Context c) {
        Intent myIntent = new Intent(c, Visuoperception_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage6(Context c) {
        Intent myIntent = new Intent(c, Attention_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage5(Context c) {
        Intent myIntent = new Intent(c, ImmediateRecall_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage4(Context c) {
        Intent myIntent = new Intent(c, Orientation_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage3(Context c) {
        Intent myIntent = new Intent(c, Calculation_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage2(Context c) {
        Intent myIntent = new Intent(c, Abstraction_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void next_stage1(Context c) {
        Intent myIntent = new Intent(c, Naming_Intro.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage10(Context c) {
        Intent myIntent = new Intent(c, DelayedRecall.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage9(Context c) {
        Intent myIntent = new Intent(c, Fluency.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage8(Context c) {
        Intent myIntent = new Intent(c, Visuoperception.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage7(Context c) {
        Intent myIntent = new Intent(c, Attention.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage6(Context c) {
        Intent myIntent = new Intent(c, ImmediateRecall.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage5(Context c) {
        Intent myIntent = new Intent(c, Orientation.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage4(Context c) {
        Intent myIntent = new Intent(c, Calculation.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage3(Context c) {
        Intent myIntent = new Intent(c, Abstraction.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage2(Context c) {
        Intent myIntent = new Intent(c, Naming4.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }

    private void change_stage1(Context c) {
        Intent myIntent = new Intent(c, ExecutiveFunctioning.class);
        myIntent.putExtra("Play", "no");
        c.startActivity(myIntent);
    }
}


