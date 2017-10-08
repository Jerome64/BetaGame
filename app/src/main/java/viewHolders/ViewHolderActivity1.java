package viewHolders;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import Tables.Possessions;

/**
 * Created by jeromebriois on 16/09/2017.
 */

public class ViewHolderActivity1 extends RecyclerView.ViewHolder{

    private TextView _textQuantityView;
    private ImageView _imageView;

    public ViewHolderActivity1(View itemView) {
        super(itemView);
        this._textQuantityView = (TextView) itemView.findViewById(R.id.text);
        this._imageView = (ImageView) itemView.findViewById(R.id.image);
    }

    public void bind(Possessions possessions) {
        this._textQuantityView.setText(String.valueOf(possessions.get_quantite()));
    }





}
