//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//composition

        SegmentCompo sc=new SegmentCompo(0,0,5,5);
      // aggrégation

        Point pt1=new Point(1,1);
        Point pt2=new Point(6,6);


        SegmentAggregation sa=new SegmentAggregation(pt1,pt2);
        System.out.println(sa.tostring());



    }
}