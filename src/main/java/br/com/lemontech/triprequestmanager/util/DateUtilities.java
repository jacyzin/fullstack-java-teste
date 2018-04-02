package br.com.lemontech.triprequestmanager.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe com métodos para manipulação de datas do webservice e do banco de dados 
 * 
 */
public class DateUtilities {

	private static final Logger logger = LoggerFactory.getLogger(DateUtilities.class);

	public static XMLGregorianCalendar getXMLGCConverter(Long millisecond) {
		try {
			final GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTimeInMillis(millisecond);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(
                calendar);
		} catch (Exception e) {
			logger.error("Problema ao converter data", e);
			throw new RuntimeException(e);
		}
	}

	public static final Date getDate(XMLGregorianCalendar date) {
		try {
			return date.toGregorianCalendar().getTime();
		} catch (Exception e) {
			logger.error("Falha ao processar data", e);
			throw new RuntimeException(e);
		}
	}
}
