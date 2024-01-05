public class Test1

{ 

    public static void main(String[] args) 

    { 
    
     try 
    
    { 
    
     int num = Integer.parseInt("abc"); 
    
     System.out.println(num); 
    
     System.out.println("After parsing");
    
     } 
    
    catch (NumberFormatException e) 
    
    { 
    
     System.out.println("Number Format Exception"); 
    
     } 
    
    finally 
    
    { 
    
     System.out.println("Finally block"); 
    
     }
    
     }

 }