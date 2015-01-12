
/**
 * Thien Lai CSC 2120
 * Class CarDriver
 */
public class CarDriver
{
    private Keyboard input = Keyboard.getKeyboard(); // geting Keyboard class named as input
    private static double total = 0;
    private static int counter = 0;
    /**
     * Main Method
     */
    public static void main (String[] args)
    {
        CarBuilder cb = null;
        boolean keepGoing = true; 
        do {
            keepGoing = true;
            CarItem ci = null;
            int choice = menu();
            if (choice == 1)
            {
                cb = new CarBuilder();
                requestModel(cb);
                requestColors(cb);
                requestOptions(cb);
      
            }
            else if (choice == 2)
            {
                cb = new HondaFitLoaded();
            }
            else
                keepGoing = false;
            if (keepGoing)
            {
                ci = cb.orderCar();
                showOrder(ci);
                total += ci.cost();
                counter++;
            }
        }while(keepGoing);
        String finalMess = "You ordered " + counter + " car";
        if (counter >1)
            finalMess += "s";
        finalMess += " for a grand total of " + Currency.formatCurrency(total) + ".";
        if (counter ==0)
            finalMess = "None Car Ordered!!!";
        System.out.println("\r\n" + finalMess);    
    }
    /**
     * Displays Menu
     */
    private static int menu(){
        Keyboard input = Keyboard.getKeyboard();
        String answer = input.readString("Would you like to order a car (y/n)?");
        int choice =0;
        if (Character.toUpperCase(answer.charAt(0))=='Y')
        {
            System.out.println("\r\n1.Build Your Own\r\n2. Honda Fit Loaded");
            do 
                choice = input.readInt("\r\nSelect from above: ");
            while (choice !=1 && choice != 2);
        }
        return choice;
    }
    /**
     * Calls the appropriate method on the builder until input is accepted
     */
    private static void requestModel(CarBuilder cb)
    {
        Keyboard input = Keyboard.getKeyboard();
        char choice = '\0';
        do
        {
            String answer = input.readString("\r\n(A)ccord, (C)ivic, (F)it: ");
            choice = '\0';
            if (!answer.equals(""))
                choice = Character.toUpperCase(answer.charAt(0));
            if(!cb.buildModel(choice))
                choice='\0';
        }while(choice == '\0');   
    }
    /**
     * Calls the appropriate method on the builder for color until input is accepted
     */
    private static void requestColors(CarBuilder cb)
    {
        Keyboard input = Keyboard.getKeyboard();
        System.out.println("\r\nSelect the stripe colors for your car.");
        boolean canBeDone = false;
        char choice = '\0';
        do
        {
            String answer = input.readString("\r\n(B)lack, (S)ilver, (W)hite, (D)one: ");
            if(!answer.equals(""))
                choice = Character.toUpperCase(answer.charAt(0));
            if(cb.buildColor(choice))
                canBeDone=true;
        }while(!canBeDone || (canBeDone && choice != 'D'));
           
    }   
    /**
     * Calls the appropriate method on the builder for option until input is accepted (Note that option is disappeared after being selected)
     */
    private static void requestOptions(CarBuilder cb)
    {
      Keyboard input = Keyboard.getKeyboard();
      CarOption co = null;
      Alloy a = null;
      FloorMats f = null;
      GPS g = null;
      Spoilers s = null;
      boolean hasOption = false;
      System.out.println("\r\n\nSelect the options for your car.");
      char choice = '\0';
      do 
      {
          hasOption = false;
          CarItem ci = cb.orderCar();
          if(ci instanceof CarOption)
          {
              co = (CarOption) ci;
              a = new Alloy(co);
              f = new FloorMats(co);
              g = new GPS(co);
              s = new Spoilers(co);
              hasOption = true;
              
          }
          String message = "";
          if(!hasOption || !a.isDuplicate())
            message += "\r\n(A)lloy Wheels, ";
          if(!hasOption || !f.isDuplicate())
            message += "(F)loor Mats, ";
          if(!hasOption || !g.isDuplicate())
            message += "(G)PS, ";
          if(!hasOption || !s.isDuplicate())
            message += "(S)ploiers, ";   
          message += "Done: ";
          String answer = input.readString(message);
          choice = '\0';
          if(!answer.equals(""))
            choice = Character.toUpperCase(answer.charAt(0));
          if(choice != 'D' && !cb.buildOption(choice))
            choice='\0';
          else if (choice == 'A' ||choice == 'F' ||choice == 'G' ||choice == 'S' )
          {
              co = (CarOption) cb.orderCar();
              switch(choice)
              {
                  case 'A':
                    a = new Alloy(co);
                    break;
                  case 'f':
                    f = new FloorMats(co);
                    break;
                  case 'g':
                    g = new GPS(co);
                    break;
                  case 's':
                    s = new Spoilers(co);
                    break;
              }
              if(hasOption && a.isDuplicate() && f.isDuplicate() && g.isDuplicate() && s.isDuplicate())
                choice ='D';
          }
          
      }while(choice!='D');
      
    }
    /*
     * Method to show Order
     */
    private static void showOrder (CarItem ci)
    {
        System.out.println("\r\n" +ci);
        System.out.println("Your car cost is " + Currency.formatCurrency(ci.cost()) + ".\r\n");
    }
}
