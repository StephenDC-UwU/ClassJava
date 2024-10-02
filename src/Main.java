import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Mostrar Hello Poblenou
        /*System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("H E L L O    P O B L E N O U !");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        */

//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        String course = input.nextLine();
//        byte age = input.nextByte();
//        System.out.println("Hola em dic " + name +", tinc " + age + " any i realitzo el cicle formatiu de " + course);


        /*Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float num4 = input.nextFloat();
        float sol = ((num1+num2+num3+num4)/4);
        System.out.println("La media es: " + Math.round(sol));*/

      /*  Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float num4 = input.nextFloat();
        float pon1 = input.nextFloat();
        float pon2 = input.nextFloat();
        float pon3 = input.nextFloat();
        float pon4 = input.nextFloat();
        float sol = (float) ((num1*(pon1/100)) + (num2*(pon2/100)) + (num3*(pon3/100)) + (num4*(pon4/100))) ;
        System.out.println("La media es: " + Math.round(sol));
*/

//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        String lastName = input.nextLine();
//        String course = input.nextLine();
//        String age = input.nextLine();
//        System.out.println("Hola em dic " + name +" " + lastName + ", tinc " + age + " anys i realitzo el cicle formatiu de " + course);

//        Scanner input = new Scanner(System.in);
//        int segunRetar = input.nextInt();
//        int segTotPerYear = segunRetar*165;
//        int horaTot = segTotPerYear/3600;
//        int minTot = segTotPerYear%3600/60;
//        int segTot =  (segTotPerYear%3600) % 60;
//        System.out.println(horaTot);
//        System.out.println(minTot);
//        System.out.println(segTot);

        /* Scanner input = new Scanner(System.in);
         float areaTotal  = input.nextFloat();
         float result = (float) (Math.sqrt(areaTotal/Math.PI));
         System.out.println(Math.round(result));*/

//        Scanner input = new Scanner(System.in);
//        int impresora = input.nextInt();
//        int ordenador = input.nextInt();
//        int portatils = input.nextInt();
//        int discDuro = input.nextInt();
//        int matOfimatico = input.nextInt();
//
//        final int PRE_IMP = 500;
//        final int PRE_ORD = 400;
//        final int PRE_POR = 700;
//        final int PRE_DISC = 50;
//        final int PRE_MAT_OFI = 300;
//
//        int result = (impresora*PRE_IMP) + (ordenador*PRE_ORD) + (portatils*PRE_POR) + (discDuro*PRE_DISC) + (matOfimatico*PRE_MAT_OFI);
//        System.out.println(result);

//       Scanner input = new Scanner(System.in);
//        int a1 = input.nextInt();
//        int a2 = input.nextInt();
//        int b1 = input.nextInt();
//        int b2 = input.nextInt();
//        int c1 = input.nextInt();
//        int c2 = input.nextInt();
//        int d1 = input.nextInt();
//        int d2 = input.nextInt();
//
//        float a = (float) Math.sqrt(Math.pow(a1,2) + Math.pow(a2,2));
//        float b = (float) Math.sqrt(Math.pow((b1-a1),2) + Math.pow((b2-a2),2));
//        float c = (float) Math.sqrt(Math.pow((c1-b1),2) + Math.pow((c2-b2),2));
//        float d = (float) Math.sqrt(Math.pow((d1-c1),2) + Math.pow((d2-c2),2));
//        float e = (float) Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));
//
//        int result = Math.round(a+b+c+d+e);
//
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        //Alumno por aulas
        int N = sc.nextInt();
        //aulas por planta
        int A = sc.nextInt();
        //Plantas totales que tiene el instituo
        int P = sc.nextInt();
        //Matriculados total
        int M = sc.nextInt();

        int capacidadTotalAlumnos = ((N * A) * P);

        if (capacidadTotalAlumnos>0) {

            int alumnosSobrantes = M%capacidadTotalAlumnos;
            if ( alumnosSobrantes > 0) {
                int X = alumnosSobrantes/(N*A);
                if (alumnosSobrantes%(N*A) != 0) {
                    X+=1;
                }
                System.out.println("Calen "+ X +" plantes per acollir tots els alumnes matriculats");
            } else {
                int X = alumnosSobrantes/(N*A);
                if (alumnosSobrantes%(N*A) != 0) {
                    X+=1;
                }
                System.out.println("A l'institut sobren "+X+" plantes");

            }
        }else{
            System.out.println("Error dades introduides no valides");
        }

       /* Scanner sc = new Scanner(System.in);

        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();

        if ((nota1>=0 && nota2>=0 && nota3>=0) && (nota1<=10 && nota2<=10 && nota3<=10)) {
                if (nota1>nota2 && nota1>nota3) {
                    System.out.println(nota1);
                } else if (nota2>nota1 && nota2>nota3) {
                    System.out.println(nota2);
                } else{
                    System.out.println(nota3);
                }
        } else {
            System.out.println("Error en el rang de les notes");
        }*/

      /*  Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        char caracter = sc.next().charAt(0);

        switch (caracter) {
            case '-':
                System.out.println(number1 - number2);
                break;
            case '+':
                System.out.println(number1 + number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                 break;
            default:
                System.out.println("L'operacio no es valida");
        }*/

        /*Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Dilluns");
                break;
                case 2:
                    System.out.println("Dimarts");
                    break;
                    case 3:
                        System.out.println("Dimecres");
                        break;
                        case 4:
                            System.out.println("Dijous");
                            break;
                            case 5:
                                System.out.println("Divendres");
                                break;
                                case 6:
                                    System.out.println("Dissabte");
                                    break;
                                    case 7:
                                        System.out.println("Diumenge");
                                        break;

            default:
                System.out.println("Dia no valid");
        }*/

        /*Scanner sc = new Scanner(System.in);
        boolean hisFamiliaNumerosa = sc.nextBoolean();
        boolean hisMatriculaHonor = sc.nextBoolean();
        boolean hisMonoparentalNormal = sc.nextBoolean();
        boolean hisMonoparentalEspecial = sc.nextBoolean();
        int edadAlumno = sc.nextInt();
        boolean hisMatriculaCompleta = sc.nextBoolean();
        int numeroUf = sc.nextInt();

        int precioBase = 440;
        if ((hisFamiliaNumerosa || hisMonoparentalNormal) && hisMatriculaCompleta
        && edadAlumno<=27 && !hisMonoparentalEspecial) {
            precioBase = precioBase/2;
            System.out.println(precioBase);
        } else if (hisMatriculaHonor && hisMatriculaCompleta
                && edadAlumno<=27 && !hisMonoparentalEspecial) {
            precioBase = precioBase-80;
            System.out.println(precioBase);
        } else if (hisMonoparentalEspecial && edadAlumno<=27 && hisMatriculaCompleta ) {
            precioBase = (int) (precioBase*0.20);
            System.out.println(precioBase);
        } else if (edadAlumno>27 && hisMatriculaCompleta) {
            precioBase = (int) (precioBase*0.10);
            System.out.println(precioBase);
        } else if (!hisMatriculaCompleta && numeroUf<17.6) {
            precioBase = numeroUf*25;
            System.out.println(precioBase);
        }*/





    }

}