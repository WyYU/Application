package com.example.dell.application;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import vo.RecordVo;

/**
 * Created by dell on 2018/4/9 0009.
 */

public class RecoderVoAdpater extends RecyclerView.Adapter <RecoderVoAdpater.ViewHolder>{
    private List<RecordVo> RecordList;
    public  RecoderVoAdpater(List<RecordVo> recoderList){
        RecordList = recoderList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recorditem,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecoderVoAdpater.ViewHolder holder, int position) {
        RecordVo recordVo=RecordList.get(position);
        holder.username.setText("用户名"+recordVo.getUserName());
        holder.userid.setText("用户id"+recordVo.getUserId());
        holder.classname.setText("classname"+recordVo.getClassName());
         holder.time.setText(TimeTools.toDateTime(recordVo.getTimestamp()));

    }

    @Override
    public int getItemCount() {
        return RecordList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView username;
        TextView userid;
        TextView classname;
        TextView time;
        View RecoderView;
        public ViewHolder(View itemView) {
            super(itemView);
            RecoderView=itemView;
            username=(TextView)itemView.findViewById(R.id.name);
            userid=(TextView)itemView.findViewById(R.id.id);
            classname=(TextView)itemView.findViewById(R.id.classname);
            time=(TextView)itemView.findViewById(R.id.time);

        }
    }
}
