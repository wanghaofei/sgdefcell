package cn.hx.deauftcell.cell;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import cn.hx.deauftcell.R;
import cn.hx.deauftcell.basecell.RVBaseCell;
import cn.hx.deauftcell.basecell.RVBaseViewHolder;


/**
 * Created by zhouwei on 17/1/19.
 */

public class ImageCell extends RVBaseCell<Entry> {
    public static final int TYPE = 1;
    public ImageCell(Entry entry) {
        super(entry);
    }

    @Override
    public int getItemType() {
        return TYPE;
    }

    @Override
    public RVBaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RVBaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.image_cell_layout,null));
    }

    @Override
    public void onBindViewHolder(RVBaseViewHolder holder, int position) {
      //  Log.e("zhouwei","ImageCell onBindViewHolder");
       // Picasso.with(holder.getItemView().getContext()).load(mData.imageUrl).into(holder.getImageView(R.id.image));
     //   holder.getImageView(R.id.image).setImageBitmap();
    }

    @Override
    public void releaseResource() {
        super.releaseResource();
     //   Log.e("zhouwei","ImageCell releaseResource");
    }
}
