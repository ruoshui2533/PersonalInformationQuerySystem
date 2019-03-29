package org.jcorba;
import java.util.*;
public class TComImpl extends TComPOA
{
private Vector people=new Vector();
public Person[] getSomeData()
{
	int i=0;
	this.people.add(new Person("zhu ting","zt@163.com"));
	this.people.add(new Person("li ting","lt@163.com"));
	this.people.add(new Person("liu ting","lt@163.com"));
	Person[] values= new Person[this.people.size()];
	Iterator ptr=this.people.iterator();
	while(ptr.hasNext())
	{
		Person p=(Person)ptr.next();
		values[i]=p;
		i++;
	}
	return values;
}
	@Override
	public void getPersonInfo(NPersonHolder persons) {
		// TODO Auto-generated method stub
		persons.value=this.getSomeData();
	}

}
