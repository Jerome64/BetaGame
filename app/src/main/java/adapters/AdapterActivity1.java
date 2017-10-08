package adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jeromebriois.betagame.R;

import java.util.ArrayList;
import java.util.List;

import Tables.Possessions;
import viewHolders.ViewHolderActivity1;

/**
 * Created by jeromebriois on 16/09/2017.
 */

public class AdapterActivity1 extends RecyclerView.Adapter<ViewHolderActivity1> {

    private List<Possessions> _possessionsList;

    public AdapterActivity1(List<Possessions> possessionsList) {

        this._possessionsList = new ArrayList<>();
    }

    @Override
    public ViewHolderActivity1 onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sell_card,viewGroup,false);
        return new ViewHolderActivity1(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderActivity1 viewHolderActivity1r, int position) {
        Possessions possessions = this._possessionsList.get(position);
        viewHolderActivity1r.bind(possessions);
    }

    @Override
    public int getItemCount() {
        return this._possessionsList.size();
    }


}
