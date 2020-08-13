package Models;

public class STATIONS {
    private String ID;
    private String LOCALIZATION;

    public String getId(){
        return ID;
    }

    public void setId(String id){
        this.ID = id;
    }

    public String GetLocalization(){
        return this.LOCALIZATION;
    }

    public void setLocalization(String localization){
        this.LOCALIZATION = localization;
    }
}
