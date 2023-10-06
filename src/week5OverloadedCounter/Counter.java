package week5OverloadedCounter;

public class Counter {
    int value;
    boolean check;


    public Counter(int StartingValue, boolean check){
        this.value = StartingValue;
        this.check = check;
    }

    public Counter(int StartingValue){
        this.value = StartingValue;
        this.check = false;
    }

    public Counter(boolean check){
        this.value = 0;
        this.check = check;
    }

    public Counter(){
        this.value = 0;
        this.check = false;
    }

    public int value(){
        return value;
    }

    public void increase(){
        value += 1;
    }

    public void decrease(){
        if(check == true && value != 0){
            value -= 1;
        } else {
            value -= 1;
        }            
    }

    public void increase(int increaseAmount){
        if(increaseAmount > 0){
            value += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount > 0){
            if(check == true && decreaseAmount > value){
                value = 0;
            } else {
                value -= decreaseAmount;
            }
        }
    }
}
