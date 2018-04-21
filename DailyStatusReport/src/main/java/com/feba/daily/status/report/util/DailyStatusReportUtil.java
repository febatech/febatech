package com.feba.daily.status.report.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DailyStatusReportUtil
{
	public DailyStatusReportUtil()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * This method is used to get the date objects.
     *
     * @param date the date
     * @return the date objects
     */
    public static List<Date> getDateObjects(Date date)
    {

        int maxDay = 0;
        List<Date> dateList = new ArrayList<Date>();

        try
        {

            SimpleDateFormat sdf = getDateFormat("EEE MMM dd HH:mm:ss z yyyy");

            SimpleDateFormat sdfDate = getDateFormat("dd-MM-yyyy");

            String selectedDate = sdfDate.format(date);

            Calendar calendar = Calendar.getInstance();

            calendar.set(Calendar.DATE, Integer.parseInt(selectedDate.substring(0, 2)));
            calendar.set(Calendar.MONTH, Integer.parseInt(selectedDate.substring(3, 5)) - 1);
            calendar.set(Calendar.YEAR, Integer.parseInt(selectedDate.substring(6, 10)));

            Calendar startCal = Calendar.getInstance();
            Calendar endCal = Calendar.getInstance();
            startCal.setTime(new Date(calendar.getTimeInMillis()));
            endCal.setTime(new Date(calendar.getTimeInMillis()));
            maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            // log.debug("Max Day: " + maxDay);
            endCal.add(Calendar.DAY_OF_YEAR, maxDay - 1);

            for (Calendar cal = startCal; cal.compareTo(endCal) <= 0; cal.add(Calendar.DAY_OF_YEAR,
                    1))
            {
                // log.debug (sdf.format(cal.getTime()));
                date = (Date) sdf.parse(sdf.format(cal.getTime()));
                dateList.add(cal.getTime());
            }
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return dateList;
    }

    /**
     * This method gets the date format.
     *
     * @param format the format
     * @return the date format
     */
    public static SimpleDateFormat getDateFormat(String format)
    {
        return new SimpleDateFormat(format);

    }

    /**
     * This method is used to get the session.
     *
     * @return the session
     */
    /*public static HttpSession getSession()
    {

        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

        return session;
    }*/

    /**
     * Converts Date String of particular format to Date object.
     *
     * @param inFormat the in format
     * @param inDate the in date
     * @return the date object
     */
    public static Date getDateObject(String inFormat, String inDate)
    {

        Date dateObject = null;
        try
        {
            DateFormat format = new SimpleDateFormat(inFormat);
            dateObject = format.parse(inDate);
        }
        catch (ParseException e)
        {

        }
        return dateObject;
    }

    /**
     * Get the difference between two dates in days.
     *
     * @param FromDate the from date
     * @param ToDate the to date
     * @return the date diff
     */
    public static int getDateDiff(Date FromDate, Date ToDate)
    {
        int diffinDays;
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(FromDate);
        cal2.setTime(ToDate);

        long timediff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
        diffinDays = (int) timediff / (24 * 60 * 60 * 1000);

        return diffinDays;
    }

    /**
     * This method is used to compare by day.
     *
     * @param op1 the op1
     * @param op2 the op2
     * @return the int
     */
    public static int compareByDay(Date op1, Date op2)
    {

        return op1.compareTo(op2);
    }

    /**
     * This method is used to get the first day of previous month.
     *
     * @return the date
     */
    public static Date firstDayOfPreviousMonth()
    {
        Calendar nowCal = Calendar.getInstance();
        int month = nowCal.get(Calendar.MONTH) - 1;
        int year = nowCal.get(Calendar.YEAR);

        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date dueDate = new Date(cal.getTimeInMillis());

        return dueDate;
    }

    /**
     * This method is used to get the current date.
     *
     * @return the date
     */
    public static Date Currentdate()
    {

        Date today = new Date();
        return today;
    }

    /**
    * This method is used to get the date to string date.
    *
    * @param date the date
    * @return the date to string date
    */
    public static String getDateToStringDate(Date date)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        return formatter.format(date);

    }
    
    /**
     * Getting date in string format.
     * @param date date
     * @param format format
     * @return String
     */
    public static String getDateToStringDate(Date date, String format)
    {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

	/**
	 * This API will try to understand the given dateString in "dd-MM-yyyy",
	 * "dd/MM/yyyy", "yyyy-MM-dd", "dd MM yyyy". If it finds a match then the
	 * dateString will be converted to Date object and returned.
	 * 
	 * @param dateString
	 * @return
	 */
	public static Date getDateFromString(String dateString) {
		// TODO Auto-generated method stub
		Date date = null;
		if (dateString != null) {

			String dateFormatArray[] = new String[] { "dd-MM-yyyy",
					"dd/MM/yyyy", "yyyy-MM-dd", "dd MM yyyy" };
			for (String dateFormat : dateFormatArray) {
				date = getDateObject(dateFormat, dateString);
				if (date != null) {
					break;
				}
			}
		}
		return date;
	}
}
