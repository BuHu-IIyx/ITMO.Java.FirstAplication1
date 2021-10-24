package itmo.java.labs;

public class Lab5 {
    //
    //Exercise
    //
    public static void ex() {
        //Тест конструктора
        Lab5Vector newVector = new Lab5Vector(1, 2, 3);
        System.out.print("Первый вектор: ");
        newVector.printVector();
        Lab5Vector newVector2 = new Lab5Vector(3, 2, 1);
        System.out.print("Второй вектор: ");
        newVector2.printVector();
        //Тест расчета длинны
        double vectorLength = newVector.getLength();
        System.out.print("Длинна первого вектора: ");
        System.out.println(vectorLength);
        //Тест скалярного произведения
        int scalarProd = newVector.scalarProduct(newVector2);
        System.out.print("Скалярное произведение: ");
        System.out.println(scalarProd);
        //Тест векторного произведения
        Lab5Vector vectorProd = newVector.vectorProduct(newVector2);
        System.out.print("Векторное произведение: ");
        vectorProd.printVector();
        //Тест расчета угла
        double vectorAng = newVector.vectorAngle(newVector2);
        System.out.print("Косинус угла: ");
        System.out.println(vectorAng);
        //Тест суммы
        Lab5Vector vectorSum = newVector.sumVector(newVector2);
        System.out.print("Сумма векторов: ");
        vectorSum.printVector();
        //Тест разницы
        Lab5Vector vectorSub = newVector.subVector(newVector2);
        System.out.print("Разность векторов: ");
        vectorSub.printVector();
        //Тест генератора
        int countArr = 5;
        Lab5Vector[] newVectorArray = Lab5Vector.generateVector(countArr);
        int j = 1;
        System.out.println("Массив векторов:");
        for (Lab5Vector i :
                newVectorArray) {
            System.out.print("Вектор " + j++ + ": ");
            i.printVector();
        }
    }

}
