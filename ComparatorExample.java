public class ComparatorExample {
    class Sortbylen implements Comparator<Envelopes>{
        public int compare(Envelopes a, Envelopes b) { 
            return a.h-b.h; 
        }
    }
    class Envelopes{
        int h;
        int w;
        Envelopes(int th,int w){
            h=th;
            w=tw;
        }
    }
    public int solve(ArrayList<ArrayList<Integer>> A) {
        
        ArrayList<Envelopes> lstEn=new ArrayList<Envelopes>();
        Collections.sort(lst,new Sortbylen());
    }
}
