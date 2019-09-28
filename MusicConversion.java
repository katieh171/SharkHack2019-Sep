
/* 
   Code created by Charlie Repaci
   Last updated: 27 September 2019
   Purpose: Backend to Conversion
*/


import java.util.*;

class MusicConversion
{
   public String[] convert = new String[50];
   public String[] initial = new String[50];
   
   public String[] music = {"C2","D2","E2","F2","G2","A2","B2",
                            "C3","D3","E3","F3","G3","A3","B3",
                            "C4","D4","E4","F4","G4","A4","B4",
                            "C5","D5","E5","F5","G5","A5","B5",
                            "C6"};
   
   public void setUp()
   {
      convert = new String[50];
      initial = new String[50];
      
   }
   
   public void setInitial(String[] notes) 
   {
      initial = notes;
   }
   
   public String[] getInitial() 
   {
      return(initial);
   }
   
   public void createList(String initialString)
   {
      initial = initialString.split(" ");
   }
   
   public String[] altToTreb()
   {
      for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            
            if(initial[i].equals(music[m]))
            {
               convert[i] = music[m + 1];
               System.out.println(convert[i]);
            }
            
         } 
      }
      
      return(convert);
   }
   
   public String[] trebToAlt(String[] notes)
   {
    for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            
            if(initial[i].equals(music[m]))
            {
               convert[i] = music[m - 1];
               System.out.println(convert[i]);
            }
            
         } 
      }
      
      return(convert);
   }
   
   public String[] trebToBass(String[] notes)
   {
    for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            
            if(initial[i].equals(music[m]))
            {
               convert[i] = music[m - 12];
               System.out.println(convert[i]);
            }
            
         } 
      }
      
      return(convert);
   }
   
   public String[] bassToTreb(String[] notes)
   {
      for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            
            if(initial[i].equals(music[m]))
            {
               convert[i] = music[m + 12];
               System.out.println(convert[i]);
            }
            
         } 
      }
      
      return(convert);
   }
   
   public String[] bassToAlt(String[] notes)
   {
    for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            
            if(initial[i].equals(music[m]))
            {
               convert[i] = music[m + 11];
               System.out.println(convert[i]);
            }
            
         } 
      }
      
      return(convert);
   }
   
   public String[] altToBass(String[] notes)
   {
    for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            
            if(initial[i].equals(music[m]))
            {
               convert[i] = music[m - 11];
               System.out.println(convert[i]);
            }
            
         } 
      }
      
      return(convert);
   }
   


}

