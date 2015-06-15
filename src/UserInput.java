import java.io.BufferedReader;
import java.io.InputStreamReader;

//USERINPUT
public class UserInput {


//INTEGER
static int getInteger ()
{
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try
{
       line=br.readLine();
       int i=Integer.parseInt(line);
       return i;
}
 catch(Exception e)
{
 	return -1;
}
}

//STRING
public static String getString()
{
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(eisodosString);
try
{
 line=br.readLine();
 return line;
}
catch (Exception e)
{
  return "Error";
}

}

static double getDouble ()
{
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try
{
       line=br.readLine();
       double d=Double.parseDouble(line);
       return d;
}
 catch(Exception e)
{
 	return -1;
}
 
 

}
 
static char getChar(){
  char line;
  InputStreamReader eisodosString=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(eisodosString);
try
{
 line=(char)br.read();
 return line;
}
catch (Exception e)
{
  return 'E';
}

    
}
 
 
 
}







