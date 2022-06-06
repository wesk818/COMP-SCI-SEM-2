class Pants extends Clothing{
    int length;
    Pants(double p, String n){
        price = p;
        producer = n;
    }
    public void assignlength(int x){
        length = x;
    }
    public int getInfo(){
        return length;
    }
}