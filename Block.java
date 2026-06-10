public class Block {
    private int x;
    static int y;
    //Instance Initialization block
    {
        System.out.println("Instance block:"+x);
        x=5;
    }
    //Static Initialization Block
    static{
        System.out.println("Static Block:y="+y);
        y=10;
    }
    public Block(){
    }
    public Block(int a){
        System.out.println("Constructor:"+x);
    }
    public static void main(String[] args) {
        new Block();
        new Block(9);
    }
}
