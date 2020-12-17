package cn.hx.deauftcell.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import cn.hx.deauftcell.R;
import cn.hx.deauftcell.basecell.RVBaseViewHolder;
import cn.hx.deauftcell.basecell.RVSimpleAdapter;


/**
 * Created by zhouwei on 17/1/23.
 */

public class EmptyCell extends RVAbsStateCell {

    public EmptyCell(Object o) {
        super(o);
    }


    @Override
    public int getItemType() {
        return RVSimpleAdapter.EMPTY_TYPE;
    }

    @Override
    public void onBindViewHolder(RVBaseViewHolder holder, int position) {

    }

    @Override
    protected View getDefaultView(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.rv_empty_layout,null);
    }
}
