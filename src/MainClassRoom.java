import java.util.Scanner;
public class MainClassRoom {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escribe el radio:");
//        float radio = sc.nextFloat();
//        float perimetro = (radio*3.14f)*2;
//        float area = (float) (3.14f*(Math.pow(radio, 2)));
//        System.out.println("EL perimetro es:" + perimetro);
//        System.out.println("EL area es:" + area);
//
//
//
//
//        System.out.println("Hello world!");

//        Scanner sc = new Scanner(System.in);
//       System.out.println("Escribe el numero 1:");
//       int num1 = sc.nextInt();
//        System.out.println("Escribe el numero 2:");
//        int num2 = sc.nextInt();
//        System.out.println("Escribe el numero 3:");
//        int num3 = sc.nextInt();
//
//        int mediaAri = num1+num2+num3/3;
//
//        System.out.println("La media es:" + mediaAri);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escribe la base: ");
//        int base = sc.nextInt();
//        System.out.println("Escribe la altura: ");
//        int altura = sc.nextInt();
//
//        int areaTri= (base*altura)/2;
//        System.out.println("El area de un triangulo es:" + areaTri);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escribe el precio del producto: ");
//        float precio = sc.nextFloat();
//        System.out.println("Escribe el IVA: ");
//        float iva = sc.nextFloat();
//        System.out.println("Escribe el descuento: ");
//        float desc = sc.nextFloat();
//
//
//        float productIva = precio-(precio*(iva/100));
//        float productFinal = productIva-(productIva*desc/100);
//
//        System.out.println("El precio del producto con iva es:" + productIva);
//        System.out.println("El precio del producto final es:" + productFinal);


        /*
          Scanner sc = new Scanner(System.in);
          System.out.println("Escribe el radio:");
          float radio = sc.nextFloat();
          System.out.println("Escribe la altura:");
          float altura = sc.nextFloat();
          double volumen = 3.14f * Math.pow(radio, 2) * altura;
          System.out.println("El volumen es:" + volumen);
    */


       /* Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        int posicio = sc.nextInt();

        int nomIntermig = (int) (nombre/Math.pow(10,posicio-1));
        int sol = nomIntermig % 10;
        System.out.println(sol);*/
/*
        Scanner sc = new Scanner(System.in);
        int R = 6371000;
        float g = 9.81f;
        int h = sc.nextInt();
        int time = (int) (2*Math.PI) * (Math.pow((R*h));*/

//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        int m = sc.nextInt();
//        int s = sc.nextInt();
//
//        int result = (h*3600) + (m*60) + s;
//        System.out.println(result);

//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int calhora = s/3600;
//        int calMin =  (s%3600) / 60 ;
//        int calseg = (s%3600) % 60;
//        System.out.println(calhora);
//        System.out.println(calMin);
//        System.out.println(calseg);

//        Scanner sc = new Scanner(System.in);
//        int segAlum = sc.nextInt();
//        int timeLostYear = 0;

      /*  Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edadNacimiento = sc.nextInt();

        int edadNum = 2022-edadNacimiento;

        if ( edadNum < 18) {
            System.out.println(nombre + " te " + edadNum + " anys i es menor d'edat.");
        } else {
            System.out.println(nombre + " te " + edadNum + " anys i es major d'edat.");
        }*/

        /*Scanner sc = new Scanner(System.in);
        //Alumno por aulas
        int N = sc.nextInt();
        //aulas por planta
        int A = sc.nextInt();
        //Plantas totales que tiene el instituo
        int P = sc.nextInt();
        //Matriculados total
        int M = sc.nextInt();

        int calcularTotalAlumnos = ((N * A) * P);
        if (calcularTotalAlumnos>0) {
            if (calcularTotalAlumnos > M) {
                int X = calcularTotalAlumnos - M;
                System.out.println("A l'institut hi caben tots els alumnes, encara n'hi caben " + X);
            } else {
                int X = M - calcularTotalAlumnos;
                System.out.println("Calen " + X + " places per tots els alumnes que s'han matriculat");
            }
        }else{
            System.out.println("Error dades introduides no valides");
        }*/

       /* Scanner sc = new Scanner(System.in);
        //Alumno por aulas
        int N = sc.nextInt();
        //aulas por planta
        int A = sc.nextInt();
        //Plantas totales que tiene el instituo
        int P = sc.nextInt();
        //Matriculados total
        int M = sc.nextInt();

        int calcularTotalAlumnos = ((N * A) * P);
        if (calcularTotalAlumnos>0){
            if (calcularTotalAlumnos < M) {
                int X = M%calcularTotalAlumnos;
                System.out.println("A l'institut sobren "+ X +" plantes");
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        int edadUser = sc.nextInt();
        int numeroViajes = sc.nextInt();

        if (edadUser>=25 && edadUser<60){
            if (numeroViajes==1){
                System.out.println("Bitllet senzill");
            } else if (numeroViajes>1 && numeroViajes<10) {
                System.out.println("T-casual");
            } else if (numeroViajes>10) {
                System.out.println("T-usual");
            }
        } else if (edadUser<25 && edadUser>16) {
            if (numeroViajes==1){
                System.out.println("Bitllet senzill");
            } else if (numeroViajes>1 && numeroViajes<=10) {
                System.out.println("T-casual");
            } else if (numeroViajes>10 && numeroViajes<=30) {
                System.out.println("T-usual");
            } else {
                System.out.println("T-jove");
            }
        } else if(edadUser>=60){
            System.out.println("Targeta Rosa");
        } else if (edadUser>=4) {
            System.out.println("T-16");
        } else {
            System.out.println("Introducir una edad correcta");
        }*/



    }
}