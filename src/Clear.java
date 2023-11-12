import java.util.Scanner;

public class Clear {
    String name;

    public Clear(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void clearConsole(){
        for(int i=0; i<50; i++){
            System.out.println();
        }
    }

    public void addPlayers(){
        System.out.println("Enter your name:");
        Scanner n = new Scanner(System.in);
        name = n.next();
    }

    public void sayHello(){
        System.out.println("Hello " + getName());
    }
}
