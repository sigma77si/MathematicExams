package com.dev.sigma77.mathematicexams;

import java.sql.Array;

/**
 * Created by user on 20.3.2017 г..
 */

public class SetProblemValues {


    public SetProblemValues(int testNumb , int problems) {


    }

   static int[] taskConditions_13 ={R.string.exam1Problem1,R.string.exam1Problem2,R.string.exam1Problem3,R.string.exam1Problem4,R.string.exam1Problem5,
            R.string.exam1Problem6,R.string.exam1Problem7,R.string.exam1Problem8,R.string.exam1Problem9,R.string.exam1Problem10,R.string.exam1Problem11,R.string.exam1Problem12,R.string.exam1Problem13,R.string.exam1Problem14,R.string.exam1Problem15};
  static   int[] taskConditions_12 ={ R.string.exam2Problem1,R.string.exam2Problem2,R.string.exam2Problem3,R.string.exam2Problem4,R.string.exam2Problem5,R.string.exam2Problem6,R.string.exam2Problem7,
            R.string.exam2Problem8,R.string.exam2Problem9,R.string.exam2Problem10,R.string.exam2Problem11,R.string.exam2Problem12,R.string.exam2Problem13,R.string.exam2Problem14,R.string.exam2Problem15};
   static int[] taskConditions_11={ R.string.exam3Problem1,R.string.exam3Problem2,R.string.exam3Problem3,R.string.exam3Problem4,R.string.exam3Problem5,R.string.exam3Problem6,R.string.exam3Problem7,
            R.string.exam3Problem8,R.string.exam3Problem9,R.string.exam3Problem10,R.string.exam3Problem11,R.string.exam3Problem12,R.string.exam3Problem13,R.string.exam3Problem14,R.string.exam3Problem15};
   static int[] taskConditions_14={ R.string.exam4Problem1,R.string.exam4Problem2,R.string.exam4Problem3,R.string.exam4Problem4,R.string.exam4Problem5,R.string.exam4Problem6,R.string.exam4Problem7,
            R.string.exam4Problem8,R.string.exam4Problem9,R.string.exam4Problem10,R.string.exam4Problem11,R.string.exam4Problem12,R.string.exam4Problem13,R.string.exam4Problem14,R.string.exam4Problem15};
    static int[] taskConditions_15={ R.string.exam5Problem1,R.string.exam5Problem2,R.string.exam5Problem3,R.string.exam5Problem4,R.string.exam5Problem5,R.string.exam5Problem6,R.string.exam5Problem7,
            R.string.exam5Problem8,R.string.exam5Problem9,R.string.exam5Problem10,R.string.exam5Problem11,R.string.exam5Problem12,R.string.exam5Problem13,R.string.exam5Problem14,R.string.exam5Problem15};
    static int[] taskConditions_16={ R.string.exam6Problem1,R.string.exam6Problem2,R.string.exam6Problem3,R.string.exam6Problem4,R.string.exam6Problem5,R.string.exam6Problem6,R.string.exam6Problem7,
            R.string.exam6Problem8,R.string.exam6Problem9,R.string.exam6Problem10,R.string.exam6Problem11,R.string.exam6Problem12,R.string.exam6Problem13,R.string.exam6Problem14,R.string.exam6Problem15};
    static int[] taskConditions_10={ R.string.exam7Problem1,R.string.exam7Problem2,R.string.exam7Problem3,R.string.exam7Problem4,R.string.exam7Problem5,R.string.exam7Problem6,R.string.exam7Problem7,
            R.string.exam7Problem8,R.string.exam7Problem9,R.string.exam7Problem10,R.string.exam7Problem11,R.string.exam7Problem12,R.string.exam7Problem13,R.string.exam7Problem14,R.string.exam7Problem15};
    static int[] taskConditions_08={ R.string.exam8Problem1,R.string.exam8Problem2,R.string.exam8Problem3,R.string.exam8Problem4,R.string.exam8Problem5,R.string.exam8Problem6,R.string.exam8Problem7,
            R.string.exam8Problem8,R.string.exam8Problem9,R.string.exam8Problem10,R.string.exam8Problem11,R.string.exam8Problem12,R.string.exam8Problem13,R.string.exam8Problem14,R.string.exam8Problem15};

   static int[] examAnswers_13 ={R.string.exam1Answer1,R.string.exam1Answer2,R.string.exam1Answer3,R.string.exam1Answer4,R.string.exam1Answer5,R.string.exam1Answer6,
            R.string.exam1Answer7,R.string.exam1Answer8,R.string.exam1Answer9,R.string.exam1Answer10,R.string.exam1Answer11,R.string.exam1Answer12,R.string.exam1Answer13,R.string.exam1Answer14,R.string.exam1Answer15};
   static int[] examAnswers_12 ={R.string.exam2Answer1,R.string.exam2Answer2,R.string.exam2Answer3,R.string.exam2Answer4,R.string.exam2Answer5,R.string.exam2Answer6,
            R.string.exam2Answer7,R.string.exam2Answer8,R.string.exam2Answer9,R.string.exam2Answer10,R.string.exam2Answer11,R.string.exam2Answer12,R.string.exam2Answer13,R.string.exam2Answer14,R.string.exam2Answer15};
   static int[] examAnswers_11={R.string.exam3Answer1,R.string.exam3Answer2,R.string.exam3Answer3,R.string.exam3Answer4,R.string.exam3Answer5,R.string.exam3Answer6,
            R.string.exam3Answer7,R.string.exam3Answer8,R.string.exam3Answer9,R.string.exam3Answer10,R.string.exam3Answer11,R.string.exam3Answer12,R.string.exam3Answer13,R.string.exam3Answer14,R.string.exam3Answer15};
   static int[] examAnswers_14 ={R.string.exam4Answer1,R.string.exam4Answer2,R.string.exam4Answer3,R.string.exam4Answer4,R.string.exam4Answer5,R.string.exam4Answer6,
            R.string.exam4Answer7,R.string.exam4Answer8,R.string.exam4Answer9,R.string.exam4Answer10,R.string.exam4Answer11,R.string.exam4Answer12,R.string.exam4Answer13,R.string.exam4Answer14,R.string.exam4Answer15};
    static int[] examAnswers_15 ={R.string.exam5Answer1,R.string.exam5Answer2,R.string.exam5Answer3,R.string.exam5Answer4,R.string.exam5Answer5,R.string.exam5Answer6,
            R.string.exam5Answer7,R.string.exam5Answer8,R.string.exam5Answer9,R.string.exam5Answer10,R.string.exam5Answer11,R.string.exam5Answer12,R.string.exam5Answer13,R.string.exam5Answer14,R.string.exam5Answer15};
    static int[] examAnswers_16 ={R.string.exam6Answer1,R.string.exam6Answer2,R.string.exam6Answer3,R.string.exam6Answer4,R.string.exam6Answer5,R.string.exam6Answer6,
            R.string.exam6Answer7,R.string.exam6Answer8,R.string.exam6Answer9,R.string.exam6Answer10,R.string.exam6Answer11,R.string.exam6Answer12,R.string.exam6Answer13,R.string.exam6Answer14,R.string.exam6Answer15};
    static int[] examAnswers_10 ={R.string.exam7Answer1,R.string.exam7Answer2,R.string.exam7Answer3,R.string.exam7Answer4,R.string.exam7Answer5,R.string.exam7Answer6,
            R.string.exam7Answer7,R.string.exam7Answer8,R.string.exam7Answer9,R.string.exam7Answer10,R.string.exam7Answer11,R.string.exam7Answer12,R.string.exam7Answer13,R.string.exam7Answer14,R.string.exam7Answer15};
    static int[] examAnswers_08 ={R.string.exam8Answer1,R.string.exam8Answer2,R.string.exam8Answer3,R.string.exam8Answer4,R.string.exam8Answer5,R.string.exam8Answer6,
            R.string.exam8Answer7,R.string.exam8Answer8,R.string.exam8Answer9,R.string.exam8Answer10,R.string.exam8Answer11,R.string.exam8Answer12,R.string.exam8Answer13,R.string.exam8Answer14,R.string.exam8Answer15};

    static int []correctAnswersList_13={4,2,3,1,3,1,4,2,1,2,4,2,3,3,4};
    static int []correctAnswersList_12={1,1,4,2,3,1,2,3,2,1,2,1,3,2,2};
    static int []correctAnswersList_11={3,1,4,2,3,2,3,1,3,1,2,1,2,4,3};
    static int []correctAnswersList_14={2,3,2,4,2,1,3,3,2,3,2,2,3,4,1};
    static int []correctAnswersList_15={3,2,1,4,4,3,1,3,1,3,2,4,3,1,1};
    static int []correctAnswersList_16={2,2,3,3,3,3,3,1,3,4,3,3,3,2,2};
    static int []correctAnswersList_10={1,4,2,3,2,3,1,2,1,1,2,3,3,2,1};
    static int []correctAnswersList_08={2,3,2,1,1,1,3,2,4,1,2,1,3,4,2};


    public static int[]setValues(int testNumb){
        int[] correctAnswers=new int[14];
        int[] examCondition=new int[14];
        int[] examAnswer=new int[14];
        switch (testNumb){

            case 1:{
                correctAnswers= correctAnswersList_13;
                examCondition= taskConditions_13;
                examAnswer= examAnswers_13;
            }break;
            case 2:{
                correctAnswers= correctAnswersList_12;
                examCondition= taskConditions_12;
                examAnswer= examAnswers_12;
            }break;
            case 3:{
                correctAnswers= correctAnswersList_11;
                examCondition= taskConditions_11;
                examAnswer= examAnswers_11;
            }break;
            case 4:{
                correctAnswers= correctAnswersList_14;
                examCondition= taskConditions_14;
                examAnswer= examAnswers_14;
            }break;
            case 5:{
                correctAnswers= correctAnswersList_15;
                examCondition= taskConditions_15;
                examAnswer= examAnswers_15;
            }break;case 6:{
                correctAnswers= correctAnswersList_16;
                examCondition= taskConditions_16;
                examAnswer= examAnswers_16;
            }break;
            case 7:{
                correctAnswers= correctAnswersList_10;
                examCondition= taskConditions_10;
                examAnswer= examAnswers_10;
            }break;
            case 8:{
                correctAnswers= correctAnswersList_08;
                examCondition= taskConditions_08;
                examAnswer= examAnswers_08;
            }break;

        }
        return correctAnswers;


    };


    public static int[] setCorrectAnswers(int testNumb){
       int[] correctAnswers=new int[15];

        switch (testNumb){

            case 1:{
                correctAnswers= correctAnswersList_13;


            }break;
            case 2:{
                correctAnswers= correctAnswersList_12;

            }break;
            case 3:{
                correctAnswers= correctAnswersList_11;

            }break;
            case 4:{
                correctAnswers= correctAnswersList_14;

            }break;
            case 5:{
                correctAnswers= correctAnswersList_15;

            }break;case 6:{
                correctAnswers= correctAnswersList_16;

            }break;
        case 7:{
            correctAnswers= correctAnswersList_10;

        }break;
            case 8:{
                correctAnswers= correctAnswersList_08;

            }break;

        }

             return correctAnswers;
    }
    public static int[] setTaskCondition( int testNumb){
        int[] examCondition=new int[15];
        switch (testNumb){

            case 1:{
                examCondition= taskConditions_13;

            }break;
            case 2:{
                examCondition= taskConditions_12;

            }break;
            case 3:{
                examCondition= taskConditions_11;

            }break;
            case 4:{
                examCondition= taskConditions_14;

            }break;
            case 5:{
                examCondition= taskConditions_15;

            }break;
            case 6:{
                examCondition= taskConditions_16;

            }break;
            case 7:{
                examCondition= taskConditions_10;

            }break;
            case 8:{
                examCondition= taskConditions_08;

            }break;

        }

        return examCondition;
    }
    public static int[] setExamAnswer( int testNumb){
        int[] examAnswer=new int[15];
        switch (testNumb){

            case 1:{
                examAnswer= examAnswers_13;

            }break;
            case 2:{
                examAnswer= examAnswers_12;

            }break;
            case 3:{
                examAnswer= examAnswers_11;

            }break;
            case 4:{
                examAnswer= examAnswers_14;

            }break;
            case 5:{
                examAnswer= examAnswers_15;

            }break;
            case 6:{
                examAnswer= examAnswers_16;

            }break;
            case 7:{
                examAnswer= examAnswers_10;

            }break;
            case 8:{
                examAnswer= examAnswers_08;

            }break;

        }

        return examAnswer;
    }
}
