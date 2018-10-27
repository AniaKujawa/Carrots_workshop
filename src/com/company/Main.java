package com.company;

public class Main {

    //static - wspólna dla wszystkich obiektów, żeby wywołac nazwaklasy.nazwametody (nie trzeba mieć obiektu!)
    public static void main(String[] args) {
//	Dog reksio = new Dog("Pieseł");
//	System.out.println(reksio.getNumberOfLegs());
//	reksio.setNumberOfLegs(8);
//	System.out.println(reksio.getNumberOfLegs());
//	reksio.bark();
//	Dog.sayHau();
//	Dicer dicer = new Dicer(3);
//	dicer.Game();
//	dicer.throwDicers();
        Person aneczka = new Person("Ania", 16, Gender.FEMALE);
        Person aneczka2 = new Person("Ania", 16, Gender.FEMALE);
        System.out.println(aneczka.equals(aneczka2));

        System.out.println(aneczka.toString());
        String a =new String("Java");
        String b = new String("Java");
        // tu nowe obiekty, niżej mszyna stwarza jeden obiekt, bo widzi, że są takie same - optymalizacja
        String c = "Java";
        String d = "Java";
        System.out.println(a==b);
        System.out.println(c==d);

//        for (int i = 0; i <100000 ; i++) {
//            System.out.println("a" == "a");
//        }
    }
}

