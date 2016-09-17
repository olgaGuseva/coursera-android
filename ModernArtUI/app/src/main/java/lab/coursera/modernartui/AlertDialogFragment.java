package lab.coursera.modernartui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

// Class that creates the AlertDialog
public class AlertDialogFragment extends DialogFragment {

    public static AlertDialogFragment newInstance() {
        return new AlertDialogFragment();
    }

    // Build AlertDialog using AlertDialog.Builder
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return new AlertDialog.Builder(getActivity())
                .setMessage("Inspired by the works of artists.\n\n Click below to learn more")

                // User can dismiss dialog by hitting back button
                .setCancelable(true)

                // Set up No Button
                .setNegativeButton("Not now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        })

                // Set up Yes Button
                .setPositiveButton("Visit MOMA",
                        new DialogInterface.OnClickListener() {
                            public void onClick(final DialogInterface dialog, int id) {
                                Intent momaIntent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("http://www.moma.org"));
                                startActivity(momaIntent);

                            }
                        }).create();
    }

}