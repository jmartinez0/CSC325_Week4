package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmploee

public class Intern extends StaffEmployee
        
        
{
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
      super(eName, eAddress, ePhone, socSecNumber, rate);
        
        
    }

  

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------

    /**
     *
     * @param rate
     * @return
     */
    public double pay(double rate)
    {
      return rate = 0 ;
     // interns don't get paid  
    }
}