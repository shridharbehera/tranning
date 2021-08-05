public class print12
{
public static void main(String[] args)
{
int i,j,k;
int z=6;
int rows=5;
for(i=6;i<=rows;i++)
{
for(j=rows-1;j>=i;j--)
{
System.out.println();
}
for(k=6;k<=rows;k++)
{
System.out.println("%d");
}
z+=2;
System.out.println("\n");
}
}
}
