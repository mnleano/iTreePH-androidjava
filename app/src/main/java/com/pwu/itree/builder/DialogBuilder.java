package com.pwu.itree.builder;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.pwu.itree.R;
import com.pwu.itree.data.EZSharedPreferences;

public class DialogBuilder {


    public static AlertDialog.Builder getBuilder(Context ctx) {

        if (EZSharedPreferences.isNightModeEnabled(ctx))
            return new AlertDialog.Builder(ctx, android.R.style.Theme_Material_Dialog);
        else return new AlertDialog.Builder(ctx, android.R.style.Theme_Material_Light_Dialog);

    }

    public static void showImagePreviewDialog(Context ctx, int drawable) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.dialog_tree_preview, null);

        AlertDialog.Builder builder = getBuilder(ctx);
        builder.setView(v);
        builder.setCancelable(true);

        final AlertDialog dialog = builder.create();
        dialog.show();

        ImageView ivTree = v.findViewById(R.id.ivTree);
        ivTree.setImageResource(drawable);
        ivTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    public static void showExitDialog(final Context ctx) {
        getBuilder(ctx).setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setCancelable(true)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((AppCompatActivity) ctx).finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();

    }

    public static void themeChangeDialog(Context ctx, boolean isNightEnabled) {

        String message = "";

        if (isNightEnabled) {
            message = "Theme changed to night mode, will be applied after restart";
        } else {
            message = "Theme changed to default mode, will be applied after restart";
        }

        getBuilder(ctx).setTitle(R.string.app_name).setMessage(message).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).show();

        EZSharedPreferences.isNightModeEnabled(ctx, isNightEnabled);
    }


    /**
     *  private void startTrivia() {

     View v = LayoutInflater.from(this).inflate(R.layout.dialog_treevia, null);
     //        Dialog dialog = new Dialog(this);
     //        dialog.setContentView(v);
     //        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
     //        dialog.show();

     AlertDialog.Builder builder = new AlertDialog.Builder(this);
     builder.setView(v);

     AlertDialog dialog = builder.create();
     dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
     dialog.show();

     }

     //    @OnClick({R.id.btnTrees, R.id.btnGame})
     //    public void onViewClicked(View view) {
     //        switch (view.getId()) {
     //            case R.id.btnTrees:
     //                startActivity(new Intent(this, TreesActivity.class));
     //                break;
     //            case R.id.btnGame:
     //                break;
     //        }
     //    }
     */
}
