package com.hiber;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Iterator;
import org.hibernate.SQLQuery;

public class Hibertesting {
     public void select()
    {
        try{
        Session sf=NewHibernateUtil.getSessionFactory().openSession();
        Transaction t=sf.beginTransaction();
        SQLQuery query=sf.createSQLQuery("select * from users");         
        query.addEntity(Users.class);
        List em = query.list();
        for(Iterator it=em.iterator();it.hasNext();)
        {
        Users s6=(Users) it.next();
        System.out.println(s6.getUserid());
        System.out.println(s6.getLatitude());
        System.out.println(s6.getLongitude());
        SQLQuery nearvistis=sf.createSQLQuery("SELECT visitid, ( 3959 * acos( cos( radians(38.8951118) ) * cos( radians( latitude ) ) * \n" +
"cos( radians( longitude ) - radians(-77.0363658) ) + sin( radians(38.8951118) ) * \n" +
"sin( radians( latitude ) ) ) ) AS distance FROM visits HAVING\n" +
"distance < 25 ORDER BY distance LIMIT 0 , 20;");         
        nearvistis.addEntity(Venues.class);
        List nearvistisl = query.list();        
        for(Iterator it2=em.iterator();it2.hasNext();)
        {
        
        }}
        System.out.println();
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
        }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hibertesting ht=new Hibertesting();
        ht.select();
    }
    
}
