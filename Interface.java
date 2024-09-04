/**
 * parent
 */
interface parent1 {
    public void sum();


    
}
interface parent2 {
    public void sum();
    

    
}
class child implements parent1,parent2 {
    public void sum(){
        System.out.println("sum1");
    }
    

    
}
public class Interface {
    public static void main(String[] args) {
        child objChild=new child();
        objChild.sum();
    }
    
}
