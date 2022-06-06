class Shirts extends Clothing{
    String material;
    Shirts(double p, String n){
        price = p;
        producer = n;
    }
    public void assignmaterial(String b){
        material = b;
    }
    public String getInfo(){
        return material;
    }
}