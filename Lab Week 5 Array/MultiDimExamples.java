/*THIS CLASS REPRESENTS MUTLITDIMENSIONAL ARRAYS  --->MULTI DIMENSIONAL ARRAYS CAN BE RECTANGULAR OR NON RECTANGULAR DEPENDING ON HOW THEY ARE ASSIGNED -->MULTIDIMENSIONAL ARRAYS ARE ARRAYS OF ARRAYS*/

public class MultiDimExamples
{
   //DECLARE AN ARRAY MEMBER VARIABLE
   int clock [][] = new int [12][60];
   int halfYear[][] = new int [6][];

   //EXAMPLE OF A RECTANGULAR ARRAY -->THINK OF THE PRINT OUT LOOKS LIKE A RECTANGLE ALSO USES A LOOP TO STORE AND PRINT VALUES
   public void setClock()
   {	//DECLARE TWO LOCAL VARIABLES
       int hours = 0;
       int seconds = 0;
       //DECLARE AND ASSIGN THE VALUES TO AN ARRAY SHORT HAND
       String time[] = {"one","two","three","four","five","six","seven", "eight","nine","ten","eleven","twelve"};

       for(hours = 0; hours<clock.length; hours++)
       {
           //PRINTS THE HOUR OF THE DAY STORED IN THE TIME ARRAY
           System.out.println(time[hours]);

           for(seconds = 1; seconds<clock[hours].length; seconds++)
           {
               //STORE THE SECONDS IN THE CLOCK
               clock[hours][seconds]=seconds;


               //PRINT OUT THE "SECONDS" VALUES STORED IN THE CLOCK
               System.out.print(clock[hours][seconds] + "\t");
           }

           System.out.println(" " );
       }

       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

   }

   //THIS METHOD USES A MUTLIDIMENSIONAL NON RECTANGULAR ARRAY.  EACH DIMENSION OF THE ARRAY STORES A SECOND ARRAY WITH DIFFERENT SIZES
   public void setHalfYear()
   {
       //THE ARRAY IS USED TO RESPRESNT THE DAYS STORED IN THE MONTHS IN THE FIRST HALF OF THE YEAR
       halfYear[0] = new int[32];
       halfYear[1] = new int [29];
       halfYear[2] = new int[32];
       halfYear[3] = new int[31];
       halfYear[4] = new int [32];
       halfYear[5] = new int [31];


       //LOCAL VARIABLES USED IN THE LOOP TO INCREMENT THE LOOP TO PRINT AND STORE VALUES
       int months=0;
       int days=0;

       //AN ARRAY TO BE ASSOCIATED WITH EACH SET OF DAYS STORED IN THE ARRAY halfYear[][]
       String firstQuarter []={"January", "February", "March", "April","May","June"};

       //LOOP USED TO MOVE THROUGHT THE FIRST DIMENSION OF THE ARRAY
       for(months = 0; months<halfYear.length; months++)
       {
           //PRINT OUT THE VALUES IN THE NON MULTIDIMENSIONAL ARRAY
           System.out.println(firstQuarter[months]);

           //FOR LOOP USED TO PRINT AND INITIALIZE VALUES IN THE SECOND DIMENSION OF THE ARRAY
           for(days = 1; days < halfYear[months].length; days++)
           {
               //INDEX THROUGH BOTH DIMENSIONS AND STORE THE VALUES
               halfYear[months][days]= days;
               //INDEX THROUGH BOTH VALUES AND PRINT
               System.out.print(halfYear[months][days]+ "\t");
           }

           System.out.println("  ");
       }

           System.out.println("******************************************************************************");
   }

   public void myFamily()
   {
       //A MULTIDIMENSIONAL ARRAY THAT IS WRITTEN SHORT HAND TO ASSIGN VALUES
       //MUST BE DONE ON ONE LINE --> BE CAREFUL OF COMMAS AND {  }  CAN BE TRICKY
       String myFamily [] []= {
                                   {"Ken", "Kristen", "Emma", "Phineas", "Charlie"},
                                   {"Pete","Carol"},
                                   {"Rachel","Philip","Liam","Gannon","Ella"},
                                   {"Becky","Mike","Katie","David"},
                           };
       //PRINTING OUT THE VALUES OF THE MULTI DIMENSIONAL ARRAY
       for(int a = 0; a< myFamily.length; a++)
       {
           for(int b = 0; b<myFamily[a].length; b++)
           {
               System.out.print(myFamily[a][b]+ "\t"+"\t");
           }

       }
                               System.out.println  ("--------------------------------------------------------------");

   }//end method





           //CREATING THE MAIN METHOD USED TO INSTATIATE THE MULTIDIMEXAMPLE OBJECT AND INVOKE ALL OF ITS METHODS.
           public static void main(String args[])
           {
               MultiDimExamples theExampleObject = new MultiDimExamples();
               theExampleObject.setClock();
               theExampleObject.setHalfYear();
               theExampleObject.myFamily();
           }
   }
