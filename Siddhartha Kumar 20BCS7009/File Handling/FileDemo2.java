import java.io.*; 
class FileDemo2
{
public static void main(String[] args)throws IOException
{
File f1=new File("siddhartha");
f1.mkdir();
File f2=new File("siddharha","sidd.txt"); 
f2.createNewFile();
}
}