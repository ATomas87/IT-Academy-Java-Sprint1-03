package n1exercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<>();

        Month enero = new Month("enero");
        Month febrero = new Month("febrero");
        Month marzo = new Month("marzo");
        Month abril = new Month("abril");
        Month mayo = new Month("mayo");
        Month junio = new Month("junio");
        Month julio = new Month("julio");
        Month septiembre = new Month("septiembre");
        Month octubre = new Month("octubre");
        Month noviembre = new Month("noviembre");
        Month diciembre = new Month("diciembre");

        Collections.addAll(months, enero, febrero, marzo, abril, mayo, junio, julio, septiembre, octubre, noviembre, diciembre);

        System.out.println("-------- Todos los meses sin agosto --------");
        for (Month month : months) {
            System.out.println(month);
        }
        System.out.println();

        System.out.println("-------- Todos los meses con agosto en su posición --------");
        Month agosto = new Month("agosto");
        months.add(7, agosto);

        for (Month month : months) {
            System.out.println(month);
        }
        System.out.println();

        HashSet<Month> monthHashSet = new HashSet<>(months);

        //Intentamos introducir más de un mes con el mismo nombre después de implementar los métodos equals y hashCode de la clase Month
        monthHashSet.add(new Month("enero"));
        monthHashSet.add(new Month("Enero"));
        monthHashSet.add(new Month("enero"));
        monthHashSet.add(new Month("enero"));

        System.out.println("-------- Todos los meses en HashSet con For Loop --------");
        for (Month month: monthHashSet){
            System.out.println(month);
        }
        System.out.println();

        System.out.println("-------- Todos los meses en HashSet con Iterator --------");
        Iterator<Month> iterator = monthHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
