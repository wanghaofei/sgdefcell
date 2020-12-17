package cn.hx.deauftcell.cell;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import cn.hx.deauftcell.R;
import cn.hx.deauftcell.basecell.RVBaseCell;
import cn.hx.deauftcell.basecell.RVBaseViewHolder;


/**
 * Created by Double on 2018/5/22.
 */
public class TextCell extends RVBaseCell<Entry> {
    public static final int TYPE = 0;
    public TextCell(Entry entry) {
        super(entry);
    }

    @Override
    public int getItemType() {
        return TYPE;
    }

    @Override
    public RVBaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RVBaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_myfmg,null));
    }

    @Override
    public void onBindViewHolder(RVBaseViewHolder holder, int position) {
       // holder.setText(R.id.text_content,mData.content);
    }
}

