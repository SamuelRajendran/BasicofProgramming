package Inhertiance;

public class NewClass extends House {
    int price;

  public   NewClass(){
        this.price=23;
    }
    NewClass(NewClass other){
      super(other);
        price=other.price;
    }

    public NewClass(int rom,String nam,float val,int price){
      super(rom,nam,val); //here we are calling the house constructor which have three aruguments.
      this.price=price;
      //if we try access the rooms we get error because that is a private variable.
       // this.rooms;
        //here we have same variable in base class so we can access via using super keyword.
        System.out.println(super.price);

    }


}
