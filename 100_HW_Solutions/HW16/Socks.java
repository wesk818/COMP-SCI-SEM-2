class Socks extends Clothing{
    String type;
    Socks(double p, String n){
        price = p;
        producer = n;
    }
    public void assigntype(String b){
        type = b;
    }
    public String getInfo(){
        return type;
    }
}