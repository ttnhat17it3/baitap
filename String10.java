/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayandstring;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Administrator
 */
public class String10 
{
    public static void main(String args[]) 
    {
	SimpleDateFormat cdt = new SimpleDateFormat("HH:mm:ss\ndd/MM/yyyy ");
	cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+7")));
	System.out.println(cdt.format(System.currentTimeMillis()));
    }
}
