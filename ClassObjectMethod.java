 // Creating Class

 class Actor
{
    // Create Variable (none)

    String name = "Rajinikanth";
    String born = "12-December-50";
    int    age  = 72;
    String otherName ="superStar,Thalaivar,Thalaivan" ;
    String occupation = "Actor,Producer,screenwriter";
    String year = "1975-Present" ;
    String spouse = "latha Rajinikanth";
    String Children ="Aishwarya,sounderya";
    String awards ="Dadasaheb phaiko Award (2021),Padma Vibhushan(2016),NTR National Award (2016),Padma Bhushan(2000)";
    String firstMovie = "1975-Apoorva Raagangal";
    String currentMovie = "Jailer-soon";
    int TotalMovie = 160 ;

    //Create MainMethod

    public static void main (String arg[])
    {
        //object Creation
        Actor rajinikanth = new Actor();
        rajinikanth.personalDetails();
        rajinikanth.Acting();
        rajinikanth.Family();
        rajinikanth.Achievement();
        rajinikanth.Filemoography();
       
    }

    //Creating Methods (verb)

    public void personalDetails()
    {
        System.out.println("Name\t\t:"+name);
        System.out.println("D.o.B\t\t:"+born);
        System.out.println("Age\t\t:"+age);
        System.out.println("other Name\t:"+otherName);
    }
    public void Acting()
    {
        System.out.println("occupation\t:"+occupation);
        System.out.println("Year\t\t:"+year);
        
    }
    public void Family()
    {
        System.out.println("spouse\t\t:"+spouse);
        System.out.println("Children\t:"+Children);
        
        
    }
    public void Achievement()
    {
       System.out.println("Awards\t\t:"+awards);
    }

    public void Filemoography()
    {
       System.out.println("First Movie\t:"+firstMovie);
       System.out.println("Current Movie\t:"+currentMovie);
       System.out.println("Total Movie\t:"+TotalMovie);
        
    }
}