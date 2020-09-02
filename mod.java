import java.util.Scanner;
public class mod
{
public static void main (String Args[])
{
Scanner sc = new Scanner(System.in);
int n1,n2;
System.out.println("Enter the Numbers : ");
n1 = sc.nextInt();
n2 = sc.nextInt();
int Mod = n1%n2;
System.out.println(" The Mod Value of n1 and n2 is " + Mod);
}
}