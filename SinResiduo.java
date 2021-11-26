import java.util.Scanner;


class SinResiduo{
public static void main(String[] args)

{
Scanner teclado=new Scanner(System.in);

int uno,dos,tres;

System.out.print("ingrese el primer numero\n");
uno=teclado.nextInt();

System.out.print("ingrese el segundo numero\n");
dos=teclado.nextInt();

System.out.print("ingrese el tercero numero\n");
tres=teclado.nextInt();

System.out.printf("promedio: %d%n",(uno+dos+tres)/3);
System.out.printf("producto: %d%n",uno*dos*tres);


     if (uno > dos && uno > tres)
    System.out.printf("el numero mayor es: %d%n",uno);

     if (dos > uno && dos > tres)
    System.out.printf("el numero mayor es: %d%n",dos);

     if (tres > uno && tres > dos)
    System.out.printf("el numero mayor es: %d%n",tres);

     if (uno < dos && uno < tres)
    System.out.printf("el numero menor es: %d%n",uno);

     if (dos < uno && dos < tres)
System.out.printf("el numero menor es: %d%n",dos);

if (tres < uno && tres < dos)
System.out.printf("el numero menor es: %d%n",tres);

if (uno == dos && uno > tres)
System.out.printf("los numeros mayores son: %d y %d%n",uno,dos);

if (uno==tres && uno > dos)
System.out.printf("los numeros mayores son: %d y %d%n",uno,tres);

if (dos == tres && tres > uno)
System.out.printf("los numeros mayores son: %d y %d%n",dos,tres);

if (uno == dos && uno < tres)
System.out.printf("los numeros menores son: %d y %d%n",uno,dos);

if (uno==tres && uno < dos)
System.out.printf("los numeros menores son: %d y %d%n",uno,tres);

if (dos == tres && tres < uno)
System.out.printf("los numeros menores son: %d y %d%n",dos,tres);

if (uno == tres && dos == tres)
System.out.printf("los 3 numeros son iguales");





}
}