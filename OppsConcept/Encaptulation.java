public class Encaptulation {
    private String name;

    public void setname(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println(name);
    }
    public static void main(String args[]){
        Encaptulation myName=new Encaptulation();
        myName.setname("shivam");
        myName.getName();
        System.out.println(myName.name);
    }
}
