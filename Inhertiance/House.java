package Inhertiance;

public class House {
   private int rooms;
    String names;
    float value;
    int price;

    //No Aruguments

    House(){
        this.rooms=-1;
        this.names="null";
        this.value=-1;
    }
    //Two arugument
    House(int side,String Side){
        this.rooms=side;
        this.value=side;
        this.names=Side;

    }
    //three Aruguments
    House(int rom,String nam,float val){
        this.rooms=rom;
        this.names=nam;
        this.value=val;
    }
    //calling another constructor
    House(House old){
        this.rooms= old.rooms;
        this.names=old.names;
        this.value=old.value;
    }

}
