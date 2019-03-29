package org.jcorba;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import java.util.Properties;
public class Client {
public static void main(String[] args)
{
try{
Properties env = new Properties();
env.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
env.setProperty("org.omg.CORBA.ORBInitialPort", "1050");
ORB orb = ORB.init(args, env);
org.omg.CORBA.Object temp;
temp = orb.resolve_initial_references("NameService");
NamingContextExt node = NamingContextExtHelper.narrow(temp);
temp = node.resolve_str("TCom");
TCom ro = TComHelper.narrow(temp);
NPersonHolder result = new NPersonHolder();
ro.getPersonInfo(result);
Person[] data=result.value;
for(int i=0;i<data.length;i++)
{
	System.out.printf("%20s%20s\n",data[i].name,data[i].email);
}
}catch(Exception ex){}
}
}
