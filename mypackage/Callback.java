package mypackage;

public interface Callback {

    void callback(int param);

    default int favoriteNumber(int favoNum){
        return favoNum;
    }
}