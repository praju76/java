import java.util.*;
import java.io.*;
class Myfile
{
    File f1,f2;
    char change;
    Myfile()
    {
        Scanner s=new Scanner(System.in);
        // System.out.println("Enter Path of sourse file:  ");
        // String path=s.next();
        System.out.print("Enter name of the source file:  ");
        String name=s.next();
        f1=new File(name);
        // System.out.println("Enter Path of Destination file:  ");
        // path=s.next();
        System.out.print("Enter name of the Destination file:  ");
        name=s.next();
        f2=new File(name);
    }
void copycontent()
{
    try
    {
         if(f1.isFile())
             {
                if(f2.isFile())
                {
                          FileInputStream fin=new FileInputStream(f1);
                          FileOutputStream fout=new FileOutputStream(f2);
                          int i=fin.read();
                          while(i!=-1)
                          {
                                char c= ((char)i);
                                if(Character.isUpperCase(c))
                                {
                                    change=Character.toLowerCase(c);
                                }
                                else if(Character.isLowerCase(c))
                                {
                                    change=Character.toUpperCase(c);
                                }
                                else if(Character.isDigit(c))
                                {
                                    change='*';
                                }
                                else
                                {
                                    change=c;
                                }
                                fout.write((int)change);
                                i=fin.read();
                          }
                          fin.close();
                          fout.close();
                          System.out.println("You Got it Bro....!!!!!!");
                      }
                 }
        }catch(Exception e)
        {
            System.out.println("Error Bitch:    "+e);
        }
    }
}
class Slip13
{
    public static void main(String args[])
    {
        Myfile fi = new Myfile();
        fi.copycontent();
    }
}
