package guru.syntax;

import java.util.*;

public class ComparatorExample {
    static class Sortbylen implements Comparator<Envelopes>{
        public int compare(Envelopes a, Envelopes b) { 
            return a.h-b.h; 
        }
    }
    class Envelopes{
        int h;
        int w;
        Envelopes(int th,int tw){
            h=th;
            w=tw;
        }
    }
    public static void main(String[] args) {
        ArrayList<Envelopes> lstEn=new ArrayList<Envelopes>();
        Collections.sort(lstEn,new Sortbylen());
    }
}
