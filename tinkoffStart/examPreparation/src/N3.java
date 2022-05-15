import java.util.Scanner;
import java.util.Vector;

public class N3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = in.nextInt(), time = in.nextInt();

        Vector<Integer> floors = new Vector<>();
        for (int i = 0; i < count; ++i) {
            floors.add(in.nextInt());
        }

        int leavingPerson = in.nextInt() - 1;
        int steps = 0;

        if (time < Math.abs(floors.elementAt(leavingPerson) - floors.elementAt(0))
                && time < Math.abs(floors.elementAt(leavingPerson) - floors.lastElement())) {
            if (Math.abs(floors.elementAt(leavingPerson) - floors.elementAt(0)) > Math.abs(floors.elementAt(leavingPerson) - floors.lastElement())) {
                steps += floors.lastElement() - floors.elementAt(leavingPerson);
            } else {
                steps += floors.elementAt(leavingPerson) - floors.firstElement();
            }
        }
        steps += floors.lastElement() - floors.firstElement();
        System.out.println(steps);
    }
}