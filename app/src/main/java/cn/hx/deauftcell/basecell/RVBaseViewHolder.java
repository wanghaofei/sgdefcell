package cn.hx.deauftcell.basecell;


import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Double on 2018/5/22.
 */
public class RVBaseViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> views;
    private View mItemView;

    public RVBaseViewHolder(View itemView) {
        super(itemView);
        views = new SparseArray<>();
        mItemView = itemView;

    }

    /**
     * 获取ItemView
     *
     * @return
     */
    public View getItemView() {
        return mItemView;
    }

    public View getView(int resId) {
        return retrieveView(resId);
    }

    public TextView getTextView(int resId) {
        return retrieveView(resId);
    }

    public ImageView getImageView(int resId) {
        return retrieveView(resId);
    }
    public WebView getWebView(int resId){
        return  retrieveView(resId);
    }
    public RelativeLayout getRelativeLayout(int resId) {
        return retrieveView(resId);
    }
    public LinearLayout getLinearLayout(int resId){
        return  retrieveView(resId);
    }
    public ProgressBar getProgressBar(int resId){
        return retrieveView(resId);

    }
    public ListView getListView(int resId){
      return   retrieveView(resId);
    }
    public RecyclerView getRecyclerView(int resId){
        return  retrieveView(resId);
    }
    public Button getButton(int resId) {
        return retrieveView(resId);
    }

    @SuppressWarnings("unchecked")
    protected <V extends View> V retrieveView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = mItemView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (V) view;
    }


    public void setText(int resId, CharSequence text) {
        getTextView(resId).setText(text);
    }

    public void setText(int resId, int strId) {
        getTextView(resId).setText(strId);
    }

}
