import java.util.*;

class MusicConversionTestDriver{

   public static void printList(String[] a)
   {
      for(int b = 0; b<a.length; b++)
         System.out.println(a[b]);
   }

   public static void main(String argv[]){
   
   Scanner sc = new Scanner(System.in); 
   
   String[] convert = new String[50];
   String[] initial = new String[50];
   
   String[] music = {"C2","D2","E2","F2","G2","A2","B2",
                     "C3","D3","E3","F3","G3","A3","B3",
                     "C4","D4","E4","F4","G4","A4","B4",
                     "C5","D5","E5","F5","G5","A5","B5",
                     "C6"};
   
   /*********/                        
   System.out.println("FLAG "); // this is fine
   printList(music);
   
   System.out.println("Put in your notes to convert, separated by a space:");
   String initialString = sc.nextLine(); // this is fine
   
   /*********/
   System.out.println("FLAG "+initialString); // this is fine
   
   initial = initialString.split(" "); // this is fine
   
   /*********/
   System.out.println("FLAG ");
   printList(initial);
   
   /*int trim = 49;
   for(int x = 0; x<initial.length; x++)
         {
            if(initial[x] == "")
               trim = x;
         }
   
   /********
   System.out.println("FLAG " + trim);
         
   String[] initialClean = new String[trim];
   for(int y = 0; y<initialClean.length; y++)
   {
      initialClean[y] = initial[y];
   }
   
   /********
   System.out.println("FLAG ");
   printList(initialClean);*/
                            
   int at = 0;
   int pos = 49;
      
      for(int i = 0; i<initial.length; i++)
      {
         for(int m = 0; m<music.length; m++)
         {
            System.out.println("FLAG INITIAL: " + initial[i]);
            System.out.println("FLAG MUSIC: " + music[m]);
            
            if(initial[i] == music[m])
            {
               convert[i] = music[m - 1];
               System.out.println(convert[i]);
            }
            
            System.out.println("FLAG m: " + m);
         } 
         
          System.out.println("FLAG i: " + i);
      }
   
   /*********/   
   System.out.println("FLAG CONVERT");
   printList(convert);
   
}
}