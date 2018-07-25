package com.pwu.itree.builder;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.pwu.itree.R;

public class DialogBuilder {

    public static void showImagePreviewDialog(Context ctx, int drawable) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.dialog_tree_preview, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
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
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx, android.R.style.Theme_Material_Light_Dialog_Alert);
        builder.setTitle("Exit")
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
