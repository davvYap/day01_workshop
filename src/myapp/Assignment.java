package myapp;

import java.io.Console;

public class Assignment{
    public static void main(String[] args){

        Console cons = System.console();

        // get rows and cols => number of equations and terms
        String rows = cons.readLine("How many equations (rows)?");
        String cols = cons.readLine("How many terms (cols)?");
        
        int totalRows = Integer.parseInt(rows);
        int totalCols = Integer.parseInt(cols);
        
        // create an array to store the equations 
        String[]strRowArray = new String[totalRows];
        
        // to read the equations 
        int x = 0;
        while(x<totalRows){

            strRowArray[x] = cons.readLine("Please enter the equation for row %d (%d numbers)\n",(x+1),totalCols);

            x++;
        }

        // to store the equations multi-dimension array
        int[][] intFinalArray = new int[totalRows][totalCols];

        int i = 0;
        while(i<totalRows){
            int j =0;
            while(j<totalCols){
                intFinalArray[i][j] = Integer.parseInt(strRowArray[i].split(" ")[j]);
                j++;
            }
            i++;
        }


        // to read the input for weight/coefficient
        String strWeight = cons.readLine("Please enter the weight (Must equal to cols: %d)\n",totalCols);

        // create an array to store the splitted weight 
        int[] intWeightArray = new int[totalCols];
        
        int y = 0; 
        while(y<totalCols){

            intWeightArray[y] = Integer.parseInt(strWeight.split(" ")[y]);

            y++;
        }
        
        // to calculate the answer
        int[] finalAnswer = new int[totalRows];

        int a = 0;
        while(a<totalRows){
                int b = 0;
                while(b<totalCols){
                    finalAnswer[a] += intFinalArray[a][b]*intWeightArray[b]; 
                    b++;
                }
                a++;
        }

        // to print the answer
        int z = 0;
        while(z<finalAnswer.length){
                System.out.printf("The answer %d is : %d\n",(z+1),finalAnswer[z]);
                z++;
        }
    }
}