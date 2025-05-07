class Big{
    int age;
    Big(int age){
        this.age=age;
        // System.out.println(age);
    }

    void ages(){
        System.out.println(age);
    }
    

}


class Hello{
    int age=15;
    void data(){
        System.out.println(this);
    }
}

public class thiss {
    public static void main(String[] args){
        Hello obj = new Hello();
        obj.data();
        System.out.println(obj);
        Big big = new Big(69);
        big.ages();

    }
}
