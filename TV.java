/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment1;


public class TV {
    
    int channel;
    int volumeLevel;
    boolean on;
    
    public TV()
    {
        channel = 1;
        volumeLevel = 1;
        on = true;
    }
    public void turnon ()
    {
        on = true;
    }
    
     public void turnoff ()
    {
        on = false;
    }
     
     public void setchannel (int newchannel)
     {
        if(newchannel>=1&&newchannel<=120)
            channel=newchannel;
     }
     
      public void setvolume (int newvolumeLevel)
     {
        if(newvolumeLevel>=1&&newvolumeLevel<=7)
            volumeLevel=newvolumeLevel;
     }
      
      public void channelUp()
      {
          channel++;
      }
      
       public void channelDown()
      {
          channel--;
      }
       
        public void volumeUp()
      {
          volumeLevel++;
      }
        
         public void volumeDown()
      {
          volumeLevel--;
      }
    
}
