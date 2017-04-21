/**
 * Created by Maestro on 21.04.2017.
 */
public class Population {
    private int mBirth, mDeath, mImmigrant;
    private int population;
    int year1  = 22896703;
      int  year2, year3, year4, year5;

    public Population(int birth, int death, int immigrant) {
        mBirth = birth;
        mDeath = death;
        mImmigrant = immigrant;

    }
    public int getPopulation(){
        population = mBirth -mDeath +mImmigrant;
        return population;
    }


    public int getYear1(){

        return year1;
    }
    public int getYear2(){
        year2 = year1 + mBirth - mDeath +mImmigrant ;
        return year2;}

    public int getYear3(){
        year3 = year2 + mBirth - mDeath +mImmigrant ;
        return year3;}
    public int getYear4(){
        year4 = year3 + mBirth - mDeath +mImmigrant ;
        return year4;}
    public int getYear5(){
        year5 = year4 + mBirth - mDeath +mImmigrant ;
        return year5;}

}
