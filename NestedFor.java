public class NestedFor {
    public static void main(String[] args) {
        String animals[]={"Tiger","Lion","cat"};
        for(int i=0;i<animals.length;i++){
            for(int j=0;j<=i;j++){
                System.out.println(animals[i]);
            }
        }
        
    }
    
}
