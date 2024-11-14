abstract class Employee {
   abstract void calculateSalary();
   abstract void displayInfo();



}

class Manager extends Employee {
    String stanowisko;
    double podstawowaPłaca;
    int nadgodziny;
    double Stawkagodzinowa;
    double Premie;
    double Całakwota;
    public Manager(String stanowisko,double podstawowaPłaca, int nadgodziny,double Stawkagodzinowa, double Premie) {
        this.stanowisko = stanowisko;
        this.podstawowaPłaca = podstawowaPłaca;
        this.nadgodziny = nadgodziny;
        this.Stawkagodzinowa = Stawkagodzinowa;
        this.Premie = Premie;

    }
void calculateSalary() {
    Całakwota= nadgodziny*Stawkagodzinowa+Premie+podstawowaPłaca;
    System.out.println("Employee is managed."+ Całakwota);
}

void displayInfo() {
    System.out.println("Stanowisko:"+stanowisko);
    System.out.println("podstawowapłaca"+podstawowaPłaca);
    System.out.println("nadgodziny"+nadgodziny);
    System.out.println("Stawkagodzinowa"+Stawkagodzinowa);
    System.out.println("Premia"+Premie);

}

}



class Programmer extends Employee {
    String stanowisko;
    double podstawowaPłaca;
    int nadgodziny;
    double Stawkagodzinowa;
    double Premie;
    double Całakwota;
    public Programmer(String stanowisko,double podstawowaPłaca, int nadgodziny, double Stawkagodzinowa,double Premie){
    this.stanowisko = stanowisko;
    this.podstawowaPłaca= podstawowaPłaca;
    this.nadgodziny = nadgodziny;
    this.Stawkagodzinowa = Stawkagodzinowa;
    this.Premie = Premie;

    }

    void calculateSalary() {
        Całakwota= nadgodziny*Stawkagodzinowa+Premie+podstawowaPłaca;
        System.out.println("Employee is calculated."+ Całakwota);
    }
    void displayInfo() {

        System.out.println("Stanowisko:"+stanowisko);
        System.out.println("podstawowapłaca"+podstawowaPłaca);
        System.out.println("nadgodziny"+nadgodziny);
        System.out.println("Stawkagodzinowa"+Stawkagodzinowa);
        System.out.println("Premia"+Premie);
    }
}




public class Main {
    public static void main(String[] args) {

 Programmer programmer= new Programmer("Zatrudnionty",900,12,28.5,300);
programmer.calculateSalary();
programmer.displayInfo();

Manager manager= new Manager("Zatrudnionty",400,200,100,1424);
manager.calculateSalary();
manager.displayInfo();

        }
    }
