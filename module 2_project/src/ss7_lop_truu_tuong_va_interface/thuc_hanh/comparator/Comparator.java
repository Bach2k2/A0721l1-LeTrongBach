package ss7_lop_truu_tuong_va_interface.thuc_hanh.comparator;

import ss7_lop_truu_tuong_va_interface.thuc_hanh.circle.Circle;

import java.util.Comparator;

class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
