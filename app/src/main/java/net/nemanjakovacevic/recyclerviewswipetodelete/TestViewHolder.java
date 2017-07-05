package net.nemanjakovacevic.recyclerviewswipetodelete;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * ViewHolder capable of presenting two states: "normal" and "undo" state.
 */
class TestViewHolder extends RecyclerView.ViewHolder {

    TextView titleTextView;
    Button undoButton;

    public TestViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, parent, false));
        titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
        undoButton = (Button) itemView.findViewById(R.id.undo_button);
    }

}