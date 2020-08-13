package Models;

import java.util.Date;

public class REL_STATIONS_VARIABLES {
    private String ID;
    private String STATION_ID;
    private String VARIABLE_ID;
    private Date START_TIME;
    private Date END_TIME;
    private Integer MIN_VALUE;
    private Integer MAX_VALUE;
    private Integer AVERAGE_VALUE;
    private String DATA_TYPE;

    public String getId(){
        return ID;
    }

    public void setId(String id){
        this.ID = id;
    }

    public String getStationId(){
        return STATION_ID;
    }

    public void setStationId(String stationId){
        this.STATION_ID = stationId;
    }

    public String getVariableId(){
        return VARIABLE_ID;
    }

    public void setVariableId(String variableId){
        this.VARIABLE_ID = variableId;
    }

    public Date getStartTime(){
        return START_TIME;
    }

    public void setStartTime(Date startTime){
        this.START_TIME = startTime;
    }

    public Date getEndTime(){
        return END_TIME;
    }

    public void setEndTime(Date endTime){
        this.END_TIME = endTime;
    }

    public Integer getMinValue(){
        return MIN_VALUE;
    }

    public void setMinValue(Integer minValue){
        this.MIN_VALUE = minValue;
    }

    public Integer getMaxValue(){
        return MAX_VALUE;
    }

    public void setMaxValue(Integer maxValue){
        this.MAX_VALUE = maxValue;
    }

    public Integer getAverageValue(){
        return AVERAGE_VALUE;
    }

    public void setAverageValue(Integer averageValue){
        this.AVERAGE_VALUE = averageValue;
    }

    public String getDataType(){
        return DATA_TYPE;
    }

    public void setDataType(String dataType){
        this.DATA_TYPE = dataType;
    }
}
