
package starpattern;


public class StarPattern {

    
    public static void main(String[] args) {
        for(int x=1;x<=5;x++){
            for(int y = 1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
