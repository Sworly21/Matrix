package hu.petrik.matrixooop;

import java.rmi.MarshalException;

public class Main {

    public static void main(String[] args) {
	    Matrix m1 = new Matrix(5,7);
	    Matrix m2 = new Matrix(2,3);
        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
        System.out.printf("A mátrix elemeinek összege: %d, pozitív elemeinek száma: %d, legnagyobb eleme: %d"
                ,m2.getElemekOsszege(),m2.getPozitivElemekSzama(),m2.getLegnagyobbElem());
        System.out.println();
        int[] elsoPozitiv = m2.findElsoPozitivElem();
        System.out.printf("A mátrix első pozitív eleme: %d, %d\n",elsoPozitiv[0], elsoPozitiv[1] );

        for (int i = 0; i < 100; i++) {
            Matrix m = new Matrix(2,2);
            int[] elso = m.findElsoPozitivElem();
            System.out.println(m);
            System.out.printf("A mátrix első pozitív eleme: %d, %d\n",elso[0], elso[1] );
        }
    }
}
