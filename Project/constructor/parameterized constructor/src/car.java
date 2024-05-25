public class car {
    String name,model,country;
    int year;
    void setInformation(String n,String m,String c,int y){
        name=n;
        model=m;
        country=c;
        year=y;
    }

    void displayInformation()
    {
        System.out.println("Car name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Country of origin: "+country);
        System.out.println("Year: "+year);
    }
}
