package GPTPractice;

public class Encapsulation {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        System.out.println(c.getValue());
        c.increment();
        System.out.println(c.getValue());
        c.decrement();
        System.out.println(c.getValue());
        c.reset();
        System.out.println(c.getValue());
        c.setValue(5);
        System.out.println(c.getValue());
    }
}

class Counter{
    private int value;

    public int getValue() { // Safe to read
        return value;
    }

    public void increment(){ // safe change
        value++;
    }

    public void reset(){
        value = 0;
    }

    public void setValue(int v){
        if(v>=0)this.value = v;
    }

    public void decrement(){ // decrements the value, never goes below 0
        if(value > 0)value--;
    }
}