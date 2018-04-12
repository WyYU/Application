package dto;

import android.os.AsyncTask;

import com.example.dell.application.RecoderVoAdpater;

import java.util.ArrayList;
import java.util.List;

import vo.RecordVo;

/**
 * Created by dell on 2018/4/11 0011.
 */

public class RecordTask extends AsyncTask<Integer,Integer,List<RecordVo> >{

    private List<RecordVo> recordVoList;
    private RecoderVoAdpater recordVoAdpater;

    public RecordTask(List<RecordVo> recordVoList, RecoderVoAdpater recordVoAdpater) {
        this.recordVoList = recordVoList;
        this.recordVoAdpater = recordVoAdpater;
    }

    @Override
    protected List<RecordVo> doInBackground(Integer... integers) {
        Control  control=new AdminSystem();
        return control.getRecord();
    }

    @Override
    protected  void onPostExecute(List<RecordVo> record){

        recordVoList.clear();
        for(int i=0;i<record.size();i++){
            recordVoList.add(record.get(i));
        }
        recordVoAdpater.notifyDataSetChanged();
    }
}
