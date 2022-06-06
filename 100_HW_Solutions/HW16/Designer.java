class Designer extends Clothing{
   String brand;
   
    Designer(double p, String n){
        price = p;
        producer = n;
    }
    public void assignbrand(String b){
        brand = b;
    }
    public String getInfo(){
        return brand;        
    }
}