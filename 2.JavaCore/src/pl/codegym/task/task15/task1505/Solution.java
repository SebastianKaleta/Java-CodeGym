package pl.codegym.task.task15.task1505;                                                                                                    
                                                                                                    
import java.util.ArrayList;                                                                                                    
import java.util.List;                                                                                                    
                                                                                                    
/*                                                                                                     
OOP: Rozwiązanie problemów związanych z dziedziczeniem                                                                                                    
*/                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static interface LivingPart {                                                                                                    
        boolean containsBones();
    }                                                                                                    
                                                                                                    
    public static class BodyPart implements LivingPart {                                                                                                    
        private String name;                                                                                                    
                                                                                                    
        public BodyPart(String name) {                                                                                                    
            this.name = name;                                                                                                    
        }                                                                                                    
                                                                                                    
        public boolean containsBones() {
            BodyPart body=new BodyPart(name);
            return ;
        }                                                                                                    
                                                                                                    
        public String toString() {                                                                                                    
            return containsBones() ? name + " zawiera kości" : name + " nie zawiera kości";                                                                                                    
        }                                                                                                    
    }                                                                                                    
                                                                                                    
    public static class Finger extends BodyPart {                                                                                                    
        private boolean isArtificial;                                                                                                    
                                                                                                    
        public Finger(String name, boolean isArtificial) {                                                                                                    
            super(name);                                                                                                    
            this.isArtificial = isArtificial;                                                                                                    
        }                                                                                                    
                                                                                                    
        public boolean containsBones() {                                                                                                    
            return super.containsBones() && !isArtificial;                                                                                                    
        }                                                                                                    
    }                                                                                                    
                                                                                                    
    public static void main(String[] args) {                                                                                                    
        printlnFingers();                                                                                                    
        printlnBodyParts();                                                                                                    
        printlnLivingParts();                                                                                                    
    }                                                                                                    
                                                                                                    
    private static void printlnLivingParts() {                                                                                                    
        System.out.println(new BodyPart("ręka").containsBones());                                                                                                    
    }                                                                                                    
                                                                                                    
    private static void printlnBodyParts() {                                                                                                    
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);                                                                                                    
        bodyParts.add(new BodyPart("ręka"));                                                                                                    
        bodyParts.add(new BodyPart("noga"));                                                                                                    
        bodyParts.add(new BodyPart("głowa"));                                                                                                    
        bodyParts.add(new BodyPart("ciało"));                                                                                                    
        System.out.println(bodyParts.toString());                                                                                                    
    }                                                                                                    
                                                                                                    
    private static void printlnFingers() {                                                                                                    
        List<Finger> fingers = new ArrayList<Finger>(5);                                                                                                    
        fingers.add(new Finger("kciuk", true));                                                                                                    
        fingers.add(new Finger("palec wskazujący", true));                                                                                                    
        fingers.add(new Finger("palec środkowy", true));                                                                                                    
        fingers.add(new Finger("palec serdeczny", false));                                                                                                    
        fingers.add(new Finger("mały palec", true));                                                                                                    
        System.out.println(fingers.toString());                                                                                                    
    }                                                                                                    
}